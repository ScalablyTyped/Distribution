package typings.arangodb.arangodbGeneralGraphMod

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
    maxLength: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined
  ): PathsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(followCycles)) __obj.updateDynamic("followCycles")(followCycles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsOptions]
  }
}

