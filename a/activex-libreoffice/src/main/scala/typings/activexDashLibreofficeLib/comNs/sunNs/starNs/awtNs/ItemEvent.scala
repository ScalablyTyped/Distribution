package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event occurred to an item of a menu, a list box etc. */
trait ItemEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies which item is newly highlighted. */
  var Highlighted: scala.Double
  /** specifies the id of the item. */
  var ItemId: scala.Double
  /** specifies which item is newly selected. */
  var Selected: scala.Double
}

object ItemEvent {
  @scala.inline
  def apply(
    Highlighted: scala.Double,
    ItemId: scala.Double,
    Selected: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ItemEvent = {
    val __obj = js.Dynamic.literal(Highlighted = Highlighted, ItemId = ItemId, Selected = Selected, Source = Source)
  
    __obj.asInstanceOf[ItemEvent]
  }
}

