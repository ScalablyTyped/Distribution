package typings.arangodb.atArangodbGeneralDashGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsOptions extends js.Object {
  var direction: js.UndefOr[EdgeDirection] = js.undefined
  var followCycles: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
}

object PathsOptions {
  @scala.inline
  def apply(
    direction: EdgeDirection = null,
    followCycles: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    minLength: Int | Double = null
  ): PathsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(followCycles)) __obj.updateDynamic("followCycles")(followCycles.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsOptions]
  }
}

