package typings.alertify.alertify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Labels for altertify.set function */
trait ILabels extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
}

object ILabels {
  @scala.inline
  def apply(cancel: String = null, ok: String = null): ILabels = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[ILabels]
  }
}

