package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a listener which is to be notified about state changes in a grid control
  * @see XGridControl
  * @since OOo 3.1
  */
trait XGridControlListener extends XEventListener {
  /**
    * called when the current column in a grid control changed
    * @see XGrid.getCurrentColumnPosition
    */
  def columnChanged(event: EventObject): Unit
}

object XGridControlListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    columnChanged: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridControlListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), columnChanged = js.Any.fromFunction1(columnChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XGridControlListener]
  }
}

