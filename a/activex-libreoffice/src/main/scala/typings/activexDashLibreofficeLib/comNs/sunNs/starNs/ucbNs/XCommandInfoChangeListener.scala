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

object XCommandInfoChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    commandInfoChange: js.Function1[CommandInfoChangeEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCommandInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, commandInfoChange = commandInfoChange, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCommandInfoChangeListener]
  }
}

