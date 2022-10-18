package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSdkTypeRequest extends StObject {
  
  /**
    * The identifier of the queried SdkType instance.
    */
  var id: String
}
object GetSdkTypeRequest {
  
  inline def apply(id: String): GetSdkTypeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSdkTypeRequest]
  }
  
  extension [Self <: GetSdkTypeRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
