package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies (some) functionality provided by a grid control (aka table control)
  * @since OOo 3.1
  */
trait XGridControl
  extends XGrid
     with XGridFieldDataSupplier {
  /** registers a listener which is to be notified about state changes in the grid control */
  def addGridControlListener(listener: XGridControlListener): scala.Unit
  /** revokes a previously registered grid control listener */
  def removeGridControlListener(listener: XGridControlListener): scala.Unit
}

