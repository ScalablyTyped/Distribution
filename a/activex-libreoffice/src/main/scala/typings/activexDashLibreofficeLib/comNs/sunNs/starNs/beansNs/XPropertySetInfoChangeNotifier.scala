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

