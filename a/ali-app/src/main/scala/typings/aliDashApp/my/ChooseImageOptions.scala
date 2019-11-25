package typings.aliDashApp.my

import typings.aliDashApp.Anon_ApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 最大可选照片数，默认1张 */
  var count: Double
  /** 相册选取或者拍照，默认 [‘camera’,‘album’] */
  var sourceType: js.Array[ImageSourceType]
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  @JSName("success")
  def success_MChooseImageOptions(res: Anon_ApFilePaths): Unit
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    count: Double,
    sourceType: js.Array[ImageSourceType],
    success: Anon_ApFilePaths => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

