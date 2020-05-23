package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`0`
import typings.aliApp.aliAppNumbers.`1`
import typings.aliApp.aliAppNumbers.`2`
import typings.aliApp.aliAppNumbers.`3`
import typings.aliApp.aliAppNumbers.`4`
import typings.aliApp.anon.ApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 要压缩的图片地址数组
    */
  var apFilePaths: js.Array[String]
  /**
    * 压缩级别，支持 0 ~ 4 的整数，默认 4。详见「compressLevel表 说明表」
    * compressLevel表
    * compressLevel | 说明
    * --------------|-----
    * 0 | 低质量
    * 1 | 中等质量
    * 2 | 高质量
    * 3 | 不压缩
    * 4 | 根据网络适应
    */
  var compressLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.undefined
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.undefined
}

object CompressImageOptions {
  @scala.inline
  def apply(
    apFilePaths: js.Array[String],
    complete: /* res */ js.Any => Unit = null,
    compressLevel: `0` | `1` | `2` | `3` | `4` = null,
    fail: js.Any => Unit = null,
    success: /* res */ ApFilePaths => Unit = null
  ): CompressImageOptions = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (compressLevel != null) __obj.updateDynamic("compressLevel")(compressLevel.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CompressImageOptions]
  }
}

