package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Optional
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the event broadcasted by a XListItems implementation for changes in its item list. */
trait ItemListEvent extends EventObject {
  /**
    * the URL of the image of the item
    *
    * If the event being notified did not touch the image of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemText()}
    * , only `ItemText` will be set, and `ItemImageURL` will be empty.
    */
  var ItemImageURL: Optional[String]
  /**
    * specifies the position of the item which is affected by the event
    *
    * In case the event is not related to a single item, but to the complete list, the value of this member is undefined.
    */
  var ItemPosition: Double
  /**
    * the text of the item.
    *
    * If the event being notified did not touch the text of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemImage()}
    * , only `ItemImageURL` will be set, and `ItemText` will be empty.
    */
  var ItemText: Optional[String]
}

object ItemListEvent {
  @scala.inline
  def apply(
    ItemImageURL: Optional[String],
    ItemPosition: Double,
    ItemText: Optional[String],
    Source: XInterface
  ): ItemListEvent = {
    val __obj = js.Dynamic.literal(ItemImageURL = ItemImageURL, ItemPosition = ItemPosition, ItemText = ItemText, Source = Source)
  
    __obj.asInstanceOf[ItemListEvent]
  }
}

