package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a listener for events related to changing XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeNotifier
  * @version 1.0
  */
trait XCommandInfoChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called whenever changes of a {@link XCommandInfo} shall be propagated.
    * @param evt the event.
    */
  def commandInfoChange(evt: CommandInfoChangeEvent): scala.Unit
}

