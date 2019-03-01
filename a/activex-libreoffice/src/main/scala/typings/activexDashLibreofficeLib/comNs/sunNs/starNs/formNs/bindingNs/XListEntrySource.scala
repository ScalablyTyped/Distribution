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
  val AllListEntries: activexDashInteropLib.SafeArray[java.lang.String]
  /** retrieves the number of entries in the list */
  val ListEntryCount: scala.Double
  /**
    * adds a listener which will be notified about changes in the list reflected by the component.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addListEntryListener(Listener: XListEntryListener): scala.Unit
  /** provides access to the entirety of all list entries */
  def getAllListEntries(): activexDashInteropLib.SafeArray[java.lang.String]
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
    AllListEntries: activexDashInteropLib.SafeArray[java.lang.String],
    ListEntryCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addListEntryListener: js.Function1[XListEntryListener, scala.Unit],
    getAllListEntries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getListEntry: js.Function1[scala.Double, java.lang.String],
    getListEntryCount: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeListEntryListener: js.Function1[XListEntryListener, scala.Unit]
  ): XListEntrySource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllListEntries")(AllListEntries)
    __obj.updateDynamic("ListEntryCount")(ListEntryCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addListEntryListener")(addListEntryListener)
    __obj.updateDynamic("getAllListEntries")(getAllListEntries)
    __obj.updateDynamic("getListEntry")(getListEntry)
    __obj.updateDynamic("getListEntryCount")(getListEntryCount)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeListEntryListener")(removeListEntryListener)
    __obj.asInstanceOf[XListEntrySource]
  }
}

