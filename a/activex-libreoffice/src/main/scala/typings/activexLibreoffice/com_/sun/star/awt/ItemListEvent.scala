package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the event broadcasted by a XListItems implementation for changes in its item list. */
@js.native
trait ItemListEvent extends EventObject {
  /**
    * the URL of the image of the item
    *
    * If the event being notified did not touch the image of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemText()}
    * , only `ItemText` will be set, and `ItemImageURL` will be empty.
    */
  var ItemImageURL: Optional[String] = js.native
  /**
    * specifies the position of the item which is affected by the event
    *
    * In case the event is not related to a single item, but to the complete list, the value of this member is undefined.
    */
  var ItemPosition: Double = js.native
  /**
    * the text of the item.
    *
    * If the event being notified did not touch the text of an item, this member is empty. For instance, upon invocation of {@link XItemList.setItemImage()}
    * , only `ItemImageURL` will be set, and `ItemText` will be empty.
    */
  var ItemText: Optional[String] = js.native
}

object ItemListEvent {
  @scala.inline
  def apply(
    ItemImageURL: Optional[String],
    ItemPosition: Double,
    ItemText: Optional[String],
    Source: XInterface
  ): ItemListEvent = {
    val __obj = js.Dynamic.literal(ItemImageURL = ItemImageURL.asInstanceOf[js.Any], ItemPosition = ItemPosition.asInstanceOf[js.Any], ItemText = ItemText.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListEvent]
  }
  @scala.inline
  implicit class ItemListEventOps[Self <: ItemListEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemImageURL(value: Optional[String]): Self = this.set("ItemImageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemPosition(value: Double): Self = this.set("ItemPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemText(value: Optional[String]): Self = this.set("ItemText", value.asInstanceOf[js.Any])
  }
  
}

