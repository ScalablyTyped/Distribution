package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTip extends js.Object {
  var tip: js.UndefOr[String] = js.undefined
}

object AnonTip {
  @scala.inline
  def apply(tip: String = null): AnonTip = {
    val __obj = js.Dynamic.literal()
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTip]
  }
}

