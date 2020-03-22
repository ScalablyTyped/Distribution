package typings.aliApp

import typings.aliApp.my.ImageSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ChooseImageOptions> */
trait PartialChooseImageOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ AnonApFilePaths, Unit]] = js.undefined
}

object PartialChooseImageOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    count: Int | Double = null,
    fail: /* res */ js.Any => Unit = null,
    sourceType: js.Array[ImageSourceType] = null,
    success: /* res */ AnonApFilePaths => Unit = null
  ): PartialChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PartialChooseImageOptions]
  }
}

