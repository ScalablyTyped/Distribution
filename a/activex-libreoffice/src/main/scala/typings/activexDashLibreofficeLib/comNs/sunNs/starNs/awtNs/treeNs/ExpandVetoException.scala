package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception used to stop an expand/collapse from happening.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait ExpandVetoException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The event that the exception was created for. */
  var Event: TreeExpansionEvent
}

