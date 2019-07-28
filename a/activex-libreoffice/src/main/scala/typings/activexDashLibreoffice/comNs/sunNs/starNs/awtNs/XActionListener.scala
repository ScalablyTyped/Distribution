package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive action events. */
trait XActionListener extends XEventListener {
  /** is invoked when an action is performed. */
  def actionPerformed(rEvent: ActionEvent): Unit
}

object XActionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    actionPerformed: ActionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), actionPerformed = js.Any.fromFunction1(actionPerformed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XActionListener]
  }
}

