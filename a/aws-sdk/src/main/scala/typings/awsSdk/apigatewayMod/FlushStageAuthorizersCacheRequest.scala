package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushStageAuthorizersCacheRequest extends js.Object {
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The name of the stage to flush.
    */
  var stageName: String = js.native
}

object FlushStageAuthorizersCacheRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageAuthorizersCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStageAuthorizersCacheRequest]
  }
}

