package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait AddressBookSourcePilot extends XExecutableDialog {
  def createWithParent(ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

object AddressBookSourcePilot {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createWithParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): AddressBookSourcePilot = {
    val __obj = js.Dynamic.literal(acquire = acquire, createWithParent = createWithParent, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[AddressBookSourcePilot]
  }
}

