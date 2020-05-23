package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BetweennessOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[EdgeDirection] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object BetweennessOptions {
  @scala.inline
  def apply(
    defaultWeight: js.UndefOr[Double] = js.undefined,
    direction: EdgeDirection = null,
    weight: String = null
  ): BetweennessOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultWeight)) __obj.updateDynamic("defaultWeight")(defaultWeight.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BetweennessOptions]
  }
}

