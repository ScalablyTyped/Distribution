package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyObjectOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var meta: js.UndefOr[UserMeta] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CopyObjectOptions {
  @scala.inline
  def apply(headers: js.Object = null, meta: UserMeta = null, timeout: js.UndefOr[Double] = js.undefined): CopyObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectOptions]
  }
}

