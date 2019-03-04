package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a listener for changes in a item list
  * @see XListItems
  */
trait XItemListListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when the list has been completely cleared, i.e. after an invocation of {@link XItemList.removeAllItems()} */
  def allItemsRemoved(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is called when the changes to the item list which occurred are too complex to be notified in single events.
    *
    * Consumers of this event should discard their cached information about the current item list, and completely refresh it from the {@link XItemList} 's
    * current state.
    */
  def itemListChanged(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is called when an item is inserted into the list */
  def listItemInserted(Event: ItemListEvent): scala.Unit
  /** is called when an item in the list is modified, i.e. its text or image changed */
  def listItemModified(Event: ItemListEvent): scala.Unit
  /** is called when an item is removed from the list */
  def listItemRemoved(Event: ItemListEvent): scala.Unit
}

object XItemListListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    allItemsRemoved: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    itemListChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    listItemInserted: js.Function1[ItemListEvent, scala.Unit],
    listItemModified: js.Function1[ItemListEvent, scala.Unit],
    listItemRemoved: js.Function1[ItemListEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XItemListListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, allItemsRemoved = allItemsRemoved, disposing = disposing, itemListChanged = itemListChanged, listItemInserted = listItemInserted, listItemModified = listItemModified, listItemRemoved = listItemRemoved, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XItemListListener]
  }
}

