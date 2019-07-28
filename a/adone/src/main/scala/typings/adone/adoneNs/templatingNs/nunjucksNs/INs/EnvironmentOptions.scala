package typings.adone.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var lstripBlocks: js.UndefOr[Boolean] = js.undefined
  var throOnUndefined: js.UndefOr[Boolean] = js.undefined
  var trimBlocks: js.UndefOr[Boolean] = js.undefined
}

object EnvironmentOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    lstripBlocks: js.UndefOr[Boolean] = js.undefined,
    throOnUndefined: js.UndefOr[Boolean] = js.undefined,
    trimBlocks: js.UndefOr[Boolean] = js.undefined
  ): EnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape)
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev)
    if (!js.isUndefined(lstripBlocks)) __obj.updateDynamic("lstripBlocks")(lstripBlocks)
    if (!js.isUndefined(throOnUndefined)) __obj.updateDynamic("throOnUndefined")(throOnUndefined)
    if (!js.isUndefined(trimBlocks)) __obj.updateDynamic("trimBlocks")(trimBlocks)
    __obj.asInstanceOf[EnvironmentOptions]
  }
}

