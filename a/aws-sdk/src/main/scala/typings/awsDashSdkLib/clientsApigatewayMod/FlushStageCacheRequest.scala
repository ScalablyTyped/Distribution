package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushStageCacheRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The name of the stage to flush its cache.
    */
  var stageName: String
}

object FlushStageCacheRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, stageName = stageName)
  
    __obj.asInstanceOf[FlushStageCacheRequest]
  }
}

