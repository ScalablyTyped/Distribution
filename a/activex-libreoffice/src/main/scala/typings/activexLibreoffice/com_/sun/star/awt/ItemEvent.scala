package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event occurred to an item of a menu, a list box etc. */
trait ItemEvent extends EventObject {
  /** specifies which item is newly highlighted. */
  var Highlighted: Double
  /** specifies the id of the item. */
  var ItemId: Double
  /** specifies which item is newly selected. */
  var Selected: Double
}

object ItemEvent {
  @scala.inline
  def apply(Highlighted: Double, ItemId: Double, Selected: Double, Source: XInterface): ItemEvent = {
    val __obj = js.Dynamic.literal(Highlighted = Highlighted.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEvent]
  }
}

