package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeploySystemInstanceResponse extends StObject {
  
  /**
    * An object that contains summary information about the system instance that was removed from its target.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
}
object UndeploySystemInstanceResponse {
  
  inline def apply(): UndeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
