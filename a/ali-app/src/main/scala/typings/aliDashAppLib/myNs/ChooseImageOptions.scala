package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 最大可选照片数，默认1张 */
  var count: scala.Double
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType]
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: aliDashAppLib.Anon_ApFilePaths): scala.Unit
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    count: scala.Double,
    sourceType: js.Array[ImageSourceType],
    success: js.Function1[aliDashAppLib.Anon_ApFilePaths, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count, sourceType = sourceType, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

