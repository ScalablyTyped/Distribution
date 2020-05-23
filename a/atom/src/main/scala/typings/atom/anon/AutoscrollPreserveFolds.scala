package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscrollPreserveFolds extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
}

object AutoscrollPreserveFolds {
  @scala.inline
  def apply(autoscroll: js.UndefOr[Boolean] = js.undefined, preserveFolds: js.UndefOr[Boolean] = js.undefined): AutoscrollPreserveFolds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscrollPreserveFolds]
  }
}

