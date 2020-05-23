package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
trait XListEntrySource extends XInterface {
  /** provides access to the entirety of all list entries */
  val AllListEntries: SafeArray[String]
  /** retrieves the number of entries in the list */
  val ListEntryCount: Double
  /**
    * adds a listener which will be notified about changes in the list reflected by the component.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addListEntryListener(Listener: XListEntryListener): Unit
  /** provides access to the entirety of all list entries */
  def getAllListEntries(): SafeArray[String]
  /**
    * provides access to a single list entry
    * @see getListEntryCount
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position does not denote a valid index in the list
    */
  def getListEntry(Position: Double): String
  /** retrieves the number of entries in the list */
  def getListEntryCount(): Double
  /**
    * revokes the given listener from the list of components which will be notified about changes in the entry list.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeListEntryListener(Listener: XListEntryListener): Unit
}

object XListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    ListEntryCount: Double,
    acquire: () => Unit,
    addListEntryListener: XListEntryListener => Unit,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListEntryListener: XListEntryListener => Unit
  ): XListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListEntryListener = js.Any.fromFunction1(addListEntryListener), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
    __obj.asInstanceOf[XListEntrySource]
  }
}

