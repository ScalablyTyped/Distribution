package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushStageAuthorizersCacheRequest extends js.Object {
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * The name of the stage to flush.
    */
  var stageName: String
}

object FlushStageAuthorizersCacheRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageAuthorizersCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, stageName = stageName)
  
    __obj.asInstanceOf[FlushStageAuthorizersCacheRequest]
  }
}

