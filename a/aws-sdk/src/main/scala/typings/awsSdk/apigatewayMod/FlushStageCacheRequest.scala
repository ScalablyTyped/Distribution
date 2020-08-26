package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushStageCacheRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The name of the stage to flush its cache.
    */
  var stageName: String = js.native
}

object FlushStageCacheRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStageCacheRequest]
  }
  @scala.inline
  implicit class FlushStageCacheRequestOps[Self <: FlushStageCacheRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
  }
  
}

