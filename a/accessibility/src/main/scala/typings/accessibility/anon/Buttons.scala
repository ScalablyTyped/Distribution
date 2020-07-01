package typings.accessibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  /** @default true */
  var buttons: js.UndefOr[Boolean] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(buttons: js.UndefOr[Boolean] = js.undefined): Buttons = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

