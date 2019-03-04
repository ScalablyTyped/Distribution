package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 文件路径 */
  var apFilePath: java.lang.String
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, scala.Unit]] = js.undefined
}

object SaveFileOptions {
  @scala.inline
  def apply(
    apFilePath: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ SavedFileData, scala.Unit] = null
  ): SaveFileOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SaveFileOptions]
  }
}

