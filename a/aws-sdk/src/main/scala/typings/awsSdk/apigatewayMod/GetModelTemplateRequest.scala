package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelTemplateRequest extends js.Object {
  /**
    * [Required] The name of the model for which to generate a template.
    */
  var modelName: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetModelTemplateRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
}

