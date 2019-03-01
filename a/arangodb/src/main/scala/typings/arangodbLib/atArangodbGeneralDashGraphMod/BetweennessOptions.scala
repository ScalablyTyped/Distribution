package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BetweennessOptions extends js.Object {
  var defaultWeight: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[arangodbLib.ArangoDBNs.EdgeDirection] = js.undefined
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object BetweennessOptions {
  @scala.inline
  def apply(
    defaultWeight: scala.Int | scala.Double = null,
    direction: arangodbLib.ArangoDBNs.EdgeDirection = null,
    weight: java.lang.String = null
  ): BetweennessOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultWeight != null) __obj.updateDynamic("defaultWeight")(defaultWeight.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[BetweennessOptions]
  }
}

