package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsOptions extends js.Object {
  var direction: js.UndefOr[arangodbLib.ArangoDBNs.EdgeDirection] = js.undefined
  var followCycles: js.UndefOr[scala.Boolean] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
}

object PathsOptions {
  @scala.inline
  def apply(
    direction: arangodbLib.ArangoDBNs.EdgeDirection = null,
    followCycles: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null
  ): PathsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(followCycles)) __obj.updateDynamic("followCycles")(followCycles)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsOptions]
  }
}

