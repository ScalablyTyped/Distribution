package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): scala.Unit
}

object GetStorageInfoOptions {
  @scala.inline
  def apply(
    success: StorageInfo => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
}

