package typings.adone.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueableEntriesOptions extends js.Object {
  var entriesAsArray: js.UndefOr[Boolean] = js.undefined
  var includeEntryId: js.UndefOr[Boolean] = js.undefined
}

object ValueableEntriesOptions {
  @scala.inline
  def apply(
    entriesAsArray: js.UndefOr[Boolean] = js.undefined,
    includeEntryId: js.UndefOr[Boolean] = js.undefined
  ): ValueableEntriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entriesAsArray)) __obj.updateDynamic("entriesAsArray")(entriesAsArray)
    if (!js.isUndefined(includeEntryId)) __obj.updateDynamic("includeEntryId")(includeEntryId)
    __obj.asInstanceOf[ValueableEntriesOptions]
  }
}

