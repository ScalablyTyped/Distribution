package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
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
trait XCommandInfoChangeListener extends XEventListener {
  /**
    * gets called whenever changes of a {@link XCommandInfo} shall be propagated.
    * @param evt the event.
    */
  def commandInfoChange(evt: CommandInfoChangeEvent): Unit
}

object XCommandInfoChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    commandInfoChange: CommandInfoChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandInfoChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commandInfoChange = js.Any.fromFunction1(commandInfoChange), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCommandInfoChangeListener]
  }
}

