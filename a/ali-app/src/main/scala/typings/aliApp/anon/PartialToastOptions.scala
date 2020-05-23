package typings.aliApp.anon

import typings.aliApp.aliAppStrings.exception
import typings.aliApp.aliAppStrings.fail
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ToastOptions> */
trait PartialToastOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.undefined
}

object PartialToastOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    content: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null,
    `type`: none | success | fail | exception | String = null
  ): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialToastOptions]
  }
}

