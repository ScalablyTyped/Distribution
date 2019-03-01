package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要压缩的图片地址数组
  		 */
  var apFilePaths: js.Array[java.lang.String]
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
  var compressLevel: js.UndefOr[
    aliDashAppLib.aliDashAppLibNumbers.`0` | aliDashAppLib.aliDashAppLibNumbers.`1` | aliDashAppLib.aliDashAppLibNumbers.`2` | aliDashAppLib.aliDashAppLibNumbers.`3` | aliDashAppLib.aliDashAppLibNumbers.`4`
  ] = js.undefined
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_ApFilePaths, scala.Unit]] = js.undefined
}

object CompressImageOptions {
  @scala.inline
  def apply(
    apFilePaths: js.Array[java.lang.String],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    compressLevel: aliDashAppLib.aliDashAppLibNumbers.`0` | aliDashAppLib.aliDashAppLibNumbers.`1` | aliDashAppLib.aliDashAppLibNumbers.`2` | aliDashAppLib.aliDashAppLibNumbers.`3` | aliDashAppLib.aliDashAppLibNumbers.`4` = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_ApFilePaths, scala.Unit] = null
  ): CompressImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apFilePaths")(apFilePaths)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (compressLevel != null) __obj.updateDynamic("compressLevel")(compressLevel.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CompressImageOptions]
  }
}

