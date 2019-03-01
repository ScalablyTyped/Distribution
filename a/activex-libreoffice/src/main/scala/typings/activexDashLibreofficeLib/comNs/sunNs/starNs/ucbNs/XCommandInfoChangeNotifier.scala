package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a notifier for changes of XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeListener
  * @version 1.0
  */
trait XCommandInfoChangeNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers a listener for CommandInfoChangeEvents.
    * @param Listener the listener to add.
    */
  def addCommandInfoChangeListener(Listener: XCommandInfoChangeListener): scala.Unit
  /**
    * removes a listener for CommandInfoChangeEvents.
    * @param Listener the listener to remove.
    */
  def removeCommandInfoChangeListener(Listener: XCommandInfoChangeListener): scala.Unit
}

object XCommandInfoChangeNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit]
  ): XCommandInfoChangeNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCommandInfoChangeListener")(addCommandInfoChangeListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeCommandInfoChangeListener")(removeCommandInfoChangeListener)
    __obj.asInstanceOf[XCommandInfoChangeNotifier]
  }
}

