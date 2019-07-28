package typings.arangodb.atArangodbGeneralDashGraphMod

import typings.arangodb.ArangoDBNs.EdgeDirection
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
  def apply(defaultWeight: Int | Double = null, direction: EdgeDirection = null, weight: String = null): BetweennessOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultWeight != null) __obj.updateDynamic("defaultWeight")(defaultWeight.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[BetweennessOptions]
  }
}

