package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSystemInstanceResponse extends StObject {
  
  /**
    * The summary object that describes the new system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
}
object CreateSystemInstanceResponse {
  
  inline def apply(): CreateSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSystemInstanceResponse]
  }
  
  extension [Self <: CreateSystemInstanceResponse](x: Self) {
    
    inline def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
