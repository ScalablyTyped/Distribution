package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 当当前显示图片索引，默认 0 */
  var current: js.UndefOr[scala.Double] = js.undefined
  /** 要预览的图片链接列表 */
  var urls: js.Array[java.lang.String]
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    current: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("urls")(urls)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

