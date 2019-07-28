package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive an event when the current selection changes.
  * @see com.sun.star.view.XSelectionSupplier
  */
trait XSelectionChangeListener extends XEventListener {
  /**
    * is called when the selection changes.
    *
    * You can get the new selection via {@link XSelectionSupplier} from {@link com.sun.star.lang.EventObject.Source} .
    */
  def selectionChanged(aEvent: EventObject): Unit
}

object XSelectionChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectionChanged: EventObject => Unit
  ): XSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectionChanged = js.Any.fromFunction1(selectionChanged))
  
    __obj.asInstanceOf[XSelectionChangeListener]
  }
}

