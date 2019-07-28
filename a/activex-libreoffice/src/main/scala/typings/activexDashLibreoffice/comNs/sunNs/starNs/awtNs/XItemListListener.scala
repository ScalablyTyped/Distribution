package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a listener for changes in a item list
  * @see XListItems
  */
trait XItemListListener extends XEventListener {
  /** is called when the list has been completely cleared, i.e. after an invocation of {@link XItemList.removeAllItems()} */
  def allItemsRemoved(Event: EventObject): Unit
  /**
    * is called when the changes to the item list which occurred are too complex to be notified in single events.
    *
    * Consumers of this event should discard their cached information about the current item list, and completely refresh it from the {@link XItemList} 's
    * current state.
    */
  def itemListChanged(Event: EventObject): Unit
  /** is called when an item is inserted into the list */
  def listItemInserted(Event: ItemListEvent): Unit
  /** is called when an item in the list is modified, i.e. its text or image changed */
  def listItemModified(Event: ItemListEvent): Unit
  /** is called when an item is removed from the list */
  def listItemRemoved(Event: ItemListEvent): Unit
}

object XItemListListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    allItemsRemoved: EventObject => Unit,
    disposing: EventObject => Unit,
    itemListChanged: EventObject => Unit,
    listItemInserted: ItemListEvent => Unit,
    listItemModified: ItemListEvent => Unit,
    listItemRemoved: ItemListEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XItemListListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allItemsRemoved = js.Any.fromFunction1(allItemsRemoved), disposing = js.Any.fromFunction1(disposing), itemListChanged = js.Any.fromFunction1(itemListChanged), listItemInserted = js.Any.fromFunction1(listItemInserted), listItemModified = js.Any.fromFunction1(listItemModified), listItemRemoved = js.Any.fromFunction1(listItemRemoved), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XItemListListener]
  }
}

