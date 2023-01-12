package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultReuseConfiguration extends StObject {
  
  /**
    * Specifies whether previous query results are reused, and if so, their maximum age.
    */
  var ResultReuseByAgeConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultReuseByAgeConfiguration] = js.undefined
}
object ResultReuseConfiguration {
  
  inline def apply(): ResultReuseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultReuseConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultReuseConfiguration] (val x: Self) extends AnyVal {
    
    inline def setResultReuseByAgeConfiguration(value: ResultReuseByAgeConfiguration): Self = StObject.set(x, "ResultReuseByAgeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultReuseByAgeConfigurationUndefined: Self = StObject.set(x, "ResultReuseByAgeConfiguration", js.undefined)
  }
}
