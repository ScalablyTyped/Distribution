package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveFoldsReversed extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
  var preserveFolds: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonPreserveFoldsReversed {
  @scala.inline
  def apply(
    autoscroll: js.UndefOr[Boolean] = js.undefined,
    preserveFolds: js.UndefOr[Boolean] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): AnonPreserveFoldsReversed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFolds)) __obj.updateDynamic("preserveFolds")(preserveFolds.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveFoldsReversed]
  }
}

