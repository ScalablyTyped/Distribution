package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStageRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The name of the Stage resource to get information about.
    */
  var stageName: String
}

object GetStageRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): GetStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, stageName = stageName)
  
    __obj.asInstanceOf[GetStageRequest]
  }
}

