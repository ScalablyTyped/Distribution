package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSdkTypeRequest extends StObject {
  
  /**
    * [Required] The identifier of the queried SdkType instance.
    */
  var id: String = js.native
}
object GetSdkTypeRequest {
  
  @scala.inline
  def apply(id: String): GetSdkTypeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSdkTypeRequest]
  }
  
  @scala.inline
  implicit class GetSdkTypeRequestMutableBuilder[Self <: GetSdkTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
