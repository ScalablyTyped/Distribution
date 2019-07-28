package typings.adone.adoneNs.vaultNs.INs

import typings.adone.adoneStrings.none
import typings.adone.adoneStrings.normal
import typings.adone.adoneStrings.onlyId
import typings.adone.adoneStrings.onlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuableToJSONOptions extends js.Object {
  var entriesAsArray: js.UndefOr[Boolean] = js.undefined
  var includeEntryId: js.UndefOr[Boolean] = js.undefined
  var includeId: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[normal | onlyName | onlyId | none] = js.undefined
}

object ValuableToJSONOptions {
  @scala.inline
  def apply(
    entriesAsArray: js.UndefOr[Boolean] = js.undefined,
    includeEntryId: js.UndefOr[Boolean] = js.undefined,
    includeId: js.UndefOr[Boolean] = js.undefined,
    tags: normal | onlyName | onlyId | none = null
  ): ValuableToJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entriesAsArray)) __obj.updateDynamic("entriesAsArray")(entriesAsArray)
    if (!js.isUndefined(includeEntryId)) __obj.updateDynamic("includeEntryId")(includeEntryId)
    if (!js.isUndefined(includeId)) __obj.updateDynamic("includeId")(includeId)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuableToJSONOptions]
  }
}

