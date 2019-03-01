package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccessListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  def approveConnectionClosing(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  def connectionChanged(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  def connectionClosing(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XDatabaseAccessListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveConnectionClosing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    connectionChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    connectionClosing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("approveConnectionClosing")(approveConnectionClosing)
    __obj.updateDynamic("connectionChanged")(connectionChanged)
    __obj.updateDynamic("connectionClosing")(connectionClosing)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
}

