package typings.awsGreengrassCoreSdk.mod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.AllOrError
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.BestEffort
import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishParams extends js.Object {
  var payload: Buffer | Blob | String | ArrayLike[_] = js.native
  var queueFullPolicy: js.UndefOr[AllOrError | BestEffort] = js.native
  var topic: String = js.native
}

object PublishParams {
  @scala.inline
  def apply(payload: Buffer | Blob | String | ArrayLike[_], topic: String): PublishParams = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParams]
  }
  @scala.inline
  implicit class PublishParamsOps[Self <: PublishParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPayload(value: Buffer | Blob | String | ArrayLike[_]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueFullPolicy(value: AllOrError | BestEffort): Self = this.set("queueFullPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueFullPolicy: Self = this.set("queueFullPolicy", js.undefined)
  }
  
}

