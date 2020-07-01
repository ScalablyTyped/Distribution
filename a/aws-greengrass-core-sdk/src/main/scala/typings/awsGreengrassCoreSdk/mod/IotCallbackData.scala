package typings.awsGreengrassCoreSdk.mod

import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotCallbackData extends js.Object {
  var payload: Buffer | Blob | String | ArrayLike[_]
}

object IotCallbackData {
  @scala.inline
  def apply(payload: Buffer | Blob | String | ArrayLike[_]): IotCallbackData = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotCallbackData]
  }
}

