package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultReuseByAgeConfiguration extends StObject {
  
  /**
    * True if previous query results can be reused when the query is run; otherwise, false. The default is false.
    */
  var Enabled: Boolean
  
  /**
    * Specifies, in minutes, the maximum age of a previous query result that Athena should consider for reuse. The default is 60.
    */
  var MaxAgeInMinutes: js.UndefOr[Age] = js.undefined
}
object ResultReuseByAgeConfiguration {
  
  inline def apply(Enabled: Boolean): ResultReuseByAgeConfiguration = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultReuseByAgeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultReuseByAgeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeInMinutes(value: Age): Self = StObject.set(x, "MaxAgeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeInMinutesUndefined: Self = StObject.set(x, "MaxAgeInMinutes", js.undefined)
  }
}
