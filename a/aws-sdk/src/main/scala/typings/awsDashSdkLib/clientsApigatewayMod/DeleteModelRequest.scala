package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteModelRequest extends js.Object {
  /**
    * [Required] The name of the model to delete.
    */
  var modelName: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteModelRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteModelRequest]
  }
}

