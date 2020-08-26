package typings.awsGreengrassCoreSdk.mod

import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotCallbackData extends js.Object {
  var payload: Buffer | Blob | String | ArrayLike[_] = js.native
}

object IotCallbackData {
  @scala.inline
  def apply(payload: Buffer | Blob | String | ArrayLike[_]): IotCallbackData = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotCallbackData]
  }
  @scala.inline
  implicit class IotCallbackDataOps[Self <: IotCallbackData] (val x: Self) extends AnyVal {
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
  }
  
}

