package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a notifier for changes of XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeListener
  */
trait XPropertySetInfoChangeNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addPropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): scala.Unit
  /**
    * removes a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removePropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): scala.Unit
}

object XPropertySetInfoChangeNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addPropertySetInfoChangeListener: js.Function1[XPropertySetInfoChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertySetInfoChangeListener: js.Function1[XPropertySetInfoChangeListener, scala.Unit]
  ): XPropertySetInfoChangeNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertySetInfoChangeListener")(addPropertySetInfoChangeListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertySetInfoChangeListener")(removePropertySetInfoChangeListener)
    __obj.asInstanceOf[XPropertySetInfoChangeNotifier]
  }
}

