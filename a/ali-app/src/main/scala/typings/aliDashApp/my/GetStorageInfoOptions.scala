package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetStorageInfoOptions(res: StorageInfo): Unit
}

object GetStorageInfoOptions {
  @scala.inline
  def apply(
    success: StorageInfo => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetStorageInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetStorageInfoOptions]
  }
}

