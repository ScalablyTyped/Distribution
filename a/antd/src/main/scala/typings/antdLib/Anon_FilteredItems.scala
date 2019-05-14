package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilteredItems extends js.Object {
  var filteredItems: js.Array[antdLib.esTransferMod.TransferItem]
  var filteredRenderItems: js.Array[antdLib.esTransferListMod.RenderedItem]
}

object Anon_FilteredItems {
  @scala.inline
  def apply(
    filteredItems: js.Array[antdLib.esTransferMod.TransferItem],
    filteredRenderItems: js.Array[antdLib.esTransferListMod.RenderedItem]
  ): Anon_FilteredItems = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems, filteredRenderItems = filteredRenderItems)
  
    __obj.asInstanceOf[Anon_FilteredItems]
  }
}

