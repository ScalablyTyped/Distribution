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
    acquire: () => scala.Unit,
    enableChangeListenerNotification: scala.Boolean => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPropertySetOption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableChangeListenerNotification = js.Any.fromFunction1(enableChangeListenerNotification), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPropertySetOption]
  }
}

