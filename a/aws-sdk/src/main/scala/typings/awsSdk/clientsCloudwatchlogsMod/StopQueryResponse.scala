package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopQueryResponse extends StObject {
  
  /**
    * This is true if the query was stopped by the StopQuery operation.
    */
  var success: js.UndefOr[Success] = js.undefined
}
object StopQueryResponse {
  
  inline def apply(): StopQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopQueryResponse]
  }
  
  extension [Self <: StopQueryResponse](x: Self) {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
