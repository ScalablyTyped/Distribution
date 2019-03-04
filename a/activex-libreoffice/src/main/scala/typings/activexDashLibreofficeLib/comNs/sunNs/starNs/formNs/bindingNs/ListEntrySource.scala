package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a component which provides a list of string entries */
trait ListEntrySource
  extends XListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object ListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: activexDashInteropLib.SafeArray[java.lang.String],
    ListEntryCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addListEntryListener: js.Function1[XListEntryListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAllListEntries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getListEntry: js.Function1[scala.Double, java.lang.String],
    getListEntryCount: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeListEntryListener: js.Function1[XListEntryListener, scala.Unit]
  ): ListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, ListEntryCount = ListEntryCount, acquire = acquire, addEventListener = addEventListener, addListEntryListener = addListEntryListener, dispose = dispose, getAllListEntries = getAllListEntries, getListEntry = getListEntry, getListEntryCount = getListEntryCount, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeListEntryListener = removeListEntryListener)
  
    __obj.asInstanceOf[ListEntrySource]
  }
}

