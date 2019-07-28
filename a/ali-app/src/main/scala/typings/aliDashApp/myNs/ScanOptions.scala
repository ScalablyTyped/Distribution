package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否隐藏相册（不允许从相册选择图片），只能从相机扫码
  		 */
  var hideAlbum: js.UndefOr[Boolean] = js.undefined
  @JSName("success")
  var success_ScanOptions: js.UndefOr[js.Function1[/* res */ ScanCodeData, Unit]] = js.undefined
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
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    hideAlbum: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ ScanCodeData => Unit = null,
    `type`: scanType = null
  ): ScanOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(hideAlbum)) __obj.updateDynamic("hideAlbum")(hideAlbum)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScanOptions]
  }
}

