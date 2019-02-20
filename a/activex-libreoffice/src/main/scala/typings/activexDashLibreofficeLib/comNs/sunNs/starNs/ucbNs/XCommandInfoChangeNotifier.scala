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

