package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of this interface is used by the {@link XGridRowSelection} to get notifications about selection changes. */
trait XGridSelectionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a selection was changed. */
  def selectionChanged(gridSelectionEvent: GridSelectionEvent): scala.Unit
}

