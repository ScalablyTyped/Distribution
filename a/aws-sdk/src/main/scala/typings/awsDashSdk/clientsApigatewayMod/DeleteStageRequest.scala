package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStageRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The name of the Stage resource to delete.
    */
  var stageName: String
}

object DeleteStageRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, stageName = stageName)
  
    __obj.asInstanceOf[DeleteStageRequest]
  }
}

