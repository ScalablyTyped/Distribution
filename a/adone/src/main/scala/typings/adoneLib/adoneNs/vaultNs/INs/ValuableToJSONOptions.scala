package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableToJSONOptions extends js.Object {
  var entriesAsArray: js.UndefOr[scala.Boolean] = js.undefined
  var includeEntryId: js.UndefOr[scala.Boolean] = js.undefined
  var includeId: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[
    adoneLib.adoneLibStrings.normal | adoneLib.adoneLibStrings.onlyName | adoneLib.adoneLibStrings.onlyId | adoneLib.adoneLibStrings.none
  ] = js.undefined
}

object ValuableToJSONOptions {
  @scala.inline
  def apply(
    entriesAsArray: js.UndefOr[scala.Boolean] = js.undefined,
    includeEntryId: js.UndefOr[scala.Boolean] = js.undefined,
    includeId: js.UndefOr[scala.Boolean] = js.undefined,
    tags: adoneLib.adoneLibStrings.normal | adoneLib.adoneLibStrings.onlyName | adoneLib.adoneLibStrings.onlyId | adoneLib.adoneLibStrings.none = null
  ): ValuableToJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entriesAsArray)) __obj.updateDynamic("entriesAsArray")(entriesAsArray)
    if (!js.isUndefined(includeEntryId)) __obj.updateDynamic("includeEntryId")(includeEntryId)
    if (!js.isUndefined(includeId)) __obj.updateDynamic("includeId")(includeId)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuableToJSONOptions]
  }
}

