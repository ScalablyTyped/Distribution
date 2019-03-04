package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive an event when the current selection changes.
  * @see com.sun.star.view.XSelectionSupplier
  */
trait XSelectionChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when the selection changes.
    *
    * You can get the new selection via {@link XSelectionSupplier} from {@link com.sun.star.lang.EventObject.Source} .
    */
  def selectionChanged(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XSelectionChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectionChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, selectionChanged = selectionChanged)
  
    __obj.asInstanceOf[XSelectionChangeListener]
  }
}

