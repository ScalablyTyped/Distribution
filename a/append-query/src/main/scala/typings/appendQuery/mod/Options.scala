package typings.appendQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * whether or not to encode appended passed params using `encodeURIComponent`.
    * Default: `true`.
    */
  var encodeComponents: js.UndefOr[Boolean] = js.undefined
  /**
    * whether or not to remove params for `null` properties in the query object.
    * Default: `false` (properties will be preserved with no value).
    */
  var removeNull: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encodeComponents: js.UndefOr[Boolean] = js.undefined,
    removeNull: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encodeComponents)) __obj.updateDynamic("encodeComponents")(encodeComponents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeNull)) __obj.updateDynamic("removeNull")(removeNull.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

