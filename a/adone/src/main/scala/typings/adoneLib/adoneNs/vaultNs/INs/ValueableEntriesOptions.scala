package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueableEntriesOptions extends js.Object {
  var entriesAsArray: js.UndefOr[scala.Boolean] = js.undefined
  var includeEntryId: js.UndefOr[scala.Boolean] = js.undefined
}

object ValueableEntriesOptions {
  @scala.inline
  def apply(
    entriesAsArray: js.UndefOr[scala.Boolean] = js.undefined,
    includeEntryId: js.UndefOr[scala.Boolean] = js.undefined
  ): ValueableEntriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entriesAsArray)) __obj.updateDynamic("entriesAsArray")(entriesAsArray)
    if (!js.isUndefined(includeEntryId)) __obj.updateDynamic("includeEntryId")(includeEntryId)
    __obj.asInstanceOf[ValueableEntriesOptions]
  }
}

