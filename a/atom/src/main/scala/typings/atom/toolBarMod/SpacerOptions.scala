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
  def apply(priority: js.UndefOr[Double] = js.undefined): SpacerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacerOptions]
  }
}

