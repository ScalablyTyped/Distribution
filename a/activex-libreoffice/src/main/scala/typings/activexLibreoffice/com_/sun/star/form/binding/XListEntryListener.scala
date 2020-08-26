package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a listener for changes in a string entry list */
@js.native
trait XListEntryListener extends XEventListener {
  /**
    * notifies the listener that all entries of the list have changed.
    *
    * The listener should retrieve the complete new list by calling the {@link XListEntrySource.getAllListEntries()} method of the event source (which is
    * denoted by {@link com.sun.star.lang.EventObject.Source} ).
    */
  def allEntriesChanged(Source: EventObject): Unit = js.native
  /**
    * notifies the listener that a single entry in the list has change
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the changed entry, the first (and o
    */
  def entryChanged(Source: ListEntryEvent): Unit = js.native
  /**
    * notifies the listener that a range of entries has been inserted into the list
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first inserted entry, the {@lin
    */
  def entryRangeInserted(Source: ListEntryEvent): Unit = js.native
  /**
    * notifies the listener that a range of entries has been removed from the list
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first removed entry, the {@link
    */
  def entryRangeRemoved(Source: ListEntryEvent): Unit = js.native
}

object XListEntryListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    allEntriesChanged: EventObject => Unit,
    disposing: EventObject => Unit,
    entryChanged: ListEntryEvent => Unit,
    entryRangeInserted: ListEntryEvent => Unit,
    entryRangeRemoved: ListEntryEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XListEntryListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allEntriesChanged = js.Any.fromFunction1(allEntriesChanged), disposing = js.Any.fromFunction1(disposing), entryChanged = js.Any.fromFunction1(entryChanged), entryRangeInserted = js.Any.fromFunction1(entryRangeInserted), entryRangeRemoved = js.Any.fromFunction1(entryRangeRemoved), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XListEntryListener]
  }
  @scala.inline
  implicit class XListEntryListenerOps[Self <: XListEntryListener] (val x: Self) extends AnyVal {
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
    def setAllEntriesChanged(value: EventObject => Unit): Self = this.set("allEntriesChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setEntryChanged(value: ListEntryEvent => Unit): Self = this.set("entryChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setEntryRangeInserted(value: ListEntryEvent => Unit): Self = this.set("entryRangeInserted", js.Any.fromFunction1(value))
    @scala.inline
    def setEntryRangeRemoved(value: ListEntryEvent => Unit): Self = this.set("entryRangeRemoved", js.Any.fromFunction1(value))
  }
  
}

