package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否隐藏相册（不允许从相册选择图片），只能从相机扫码
  		 */
  var hideAlbum: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("success")
  var success_ScanOptions: js.UndefOr[js.Function1[/* res */ ScanCodeData, scala.Unit]] = js.undefined
  /**
  		 * 扫码样式(默认 qr)：
  		 * 1. qr,扫码框样式为二维码扫码框
  		 * 1. bar，扫码样式为条形码扫码框
  		 */
  var `type`: js.UndefOr[scanType] = js.undefined
}

object ScanOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    hideAlbum: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[/* res */ ScanCodeData, scala.Unit] = null,
    `type`: scanType = null
  ): ScanOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(hideAlbum)) __obj.updateDynamic("hideAlbum")(hideAlbum)
    if (success != null) __obj.updateDynamic("success")(success)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScanOptions]
  }
}

