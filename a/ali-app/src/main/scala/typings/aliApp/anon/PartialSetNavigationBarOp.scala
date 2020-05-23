package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.SetNavigationBarOptions> */
trait PartialSetNavigationBarOp extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderBottomColor: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialSetNavigationBarOp {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderBottomColor: String = null,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    image: String = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ js.Any => Unit = null,
    title: String = null
  ): PartialSetNavigationBarOp = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSetNavigationBarOp]
  }
}

