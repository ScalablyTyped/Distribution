package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a listener for changes in a string entry list */
trait XListEntryListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * notifies the listener that all entries of the list have changed.
    *
    * The listener should retrieve the complete new list by calling the {@link XListEntrySource.getAllListEntries()} method of the event source (which is
    * denoted by {@link com.sun.star.lang.EventObject.Source} ).
    */
  def allEntriesChanged(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * notifies the listener that a single entry in the list has change
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the changed entry, the first (and o
    */
  def entryChanged(Source: ListEntryEvent): scala.Unit
  /**
    * notifies the listener that a range of entries has been inserted into the list
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first inserted entry, the {@lin
    */
  def entryRangeInserted(Source: ListEntryEvent): scala.Unit
  /**
    * notifies the listener that a range of entries has been removed from the list
    * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first removed entry, the {@link
    */
  def entryRangeRemoved(Source: ListEntryEvent): scala.Unit
}

