package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPropertySetOption
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Turn on or off notifying change listeners on property value change. This option is turned on by default. */
  def enableChangeListenerNotification(bEnable: scala.Boolean): scala.Unit
}

object XPropertySetOption {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    enableChangeListenerNotification: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertySetOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("enableChangeListenerNotification")(enableChangeListenerNotification)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPropertySetOption]
  }
}

