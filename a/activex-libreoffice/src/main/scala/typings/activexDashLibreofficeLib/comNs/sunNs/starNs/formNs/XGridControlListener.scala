package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a listener which is to be notified about state changes in a grid control
  * @see XGridControl
  * @since OOo 3.1
  */
trait XGridControlListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * called when the current column in a grid control changed
    * @see XGrid.getCurrentColumnPosition
    */
  def columnChanged(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

