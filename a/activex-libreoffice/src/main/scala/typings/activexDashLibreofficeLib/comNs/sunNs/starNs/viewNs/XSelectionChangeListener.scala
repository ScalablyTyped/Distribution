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

