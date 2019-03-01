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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllListEntries")(AllListEntries)
    __obj.updateDynamic("ListEntryCount")(ListEntryCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addListEntryListener")(addListEntryListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAllListEntries")(getAllListEntries)
    __obj.updateDynamic("getListEntry")(getListEntry)
    __obj.updateDynamic("getListEntryCount")(getListEntryCount)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeListEntryListener")(removeListEntryListener)
    __obj.asInstanceOf[ListEntrySource]
  }
}

