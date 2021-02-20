package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRequestValidatorRequest extends StObject {
  
  /**
    * [Required] The identifier of the RequestValidator to be retrieved.
    */
  var requestValidatorId: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object GetRequestValidatorRequest {
  
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): GetRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestValidatorRequest]
  }
  
  @scala.inline
  implicit class GetRequestValidatorRequestMutableBuilder[Self <: GetRequestValidatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestValidatorId(value: String): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
