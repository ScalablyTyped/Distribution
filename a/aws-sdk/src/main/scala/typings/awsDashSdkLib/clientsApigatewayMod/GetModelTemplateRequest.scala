package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelTemplateRequest extends js.Object {
  /**
    * [Required] The name of the model for which to generate a template.
    */
  var modelName: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetModelTemplateRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName, restApiId = restApiId)
  
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
}

