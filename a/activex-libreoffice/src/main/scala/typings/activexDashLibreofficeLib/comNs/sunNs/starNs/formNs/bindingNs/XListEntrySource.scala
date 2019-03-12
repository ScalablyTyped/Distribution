package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a source of string list entries
  *
  * The interface supports foreign components which actively retrieve list entries, as well as components which want to passively being notified of
  * changes in the list.
  * @see XListEntrySink
  */
trait XListEntrySource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** provides access to the entirety of all list entries */
  val AllListEntries: stdLib.SafeArray[java.lang.String]
  /** retrieves the number of entries in the list */
  val ListEntryCount: scala.Double
  /**
    * adds a listener which will be notified about changes in the list reflected by the component.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addListEntryListener(Listener: XListEntryListener): scala.Unit
  /** provides access to the entirety of all list entries */
  def getAllListEntries(): stdLib.SafeArray[java.lang.String]
  /**
    * provides access to a single list entry
    * @see getListEntryCount
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position does not denote a valid index in the list
    */
  def getListEntry(Position: scala.Double): java.lang.String
  /** retrieves the number of entries in the list */
  def getListEntryCount(): scala.Double
  /**
    * revokes the given listener from the list of components which will be notified about changes in the entry list.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeListEntryListener(Listener: XListEntryListener): scala.Unit
}

object XListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: stdLib.SafeArray[java.lang.String],
    ListEntryCount: scala.Double,
    acquire: () => scala.Unit,
    addListEntryListener: XListEntryListener => scala.Unit,
    getAllListEntries: () => stdLib.SafeArray[java.lang.String],
    getListEntry: scala.Double => java.lang.String,
    getListEntryCount: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeListEntryListener: XListEntryListener => scala.Unit
  ): XListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, ListEntryCount = ListEntryCount, acquire = js.Any.fromFunction0(acquire), addListEntryListener = js.Any.fromFunction1(addListEntryListener), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
  
    __obj.asInstanceOf[XListEntrySource]
  }
}

