package typings.atom.toolBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacerOptions extends js.Object {
  /** (optional) defaults to `50` */
  var priority: js.UndefOr[Double] = js.undefined
}

object SpacerOptions {
  @scala.inline
  def apply(priority: Int | Double = null): SpacerOptions = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacerOptions]
  }
}

