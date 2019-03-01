package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: java.lang.String
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[aliDashAppLib.aliDashAppLibStrings.md5 | aliDashAppLib.aliDashAppLibStrings.sha1] = js.undefined
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, scala.Unit]] = js.undefined
}

object GetFileInfoOptions {
  @scala.inline
  def apply(
    apFilePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    digestAlgorithm: aliDashAppLib.aliDashAppLibStrings.md5 | aliDashAppLib.aliDashAppLibStrings.sha1 = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* options */ GetFileInfoSuccess, scala.Unit] = null
  ): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apFilePath")(apFilePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetFileInfoOptions]
  }
}

