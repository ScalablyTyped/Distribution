package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRangeHighlighter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Returns a list of ranges that are used by objects that are currently selected. */
  val SelectedRanges: activexDashInteropLib.SafeArray[HighlightedRange]
  /** registers an event listener, which is called when the selection is changed and affects different source ranges */
  def addSelectionChangeListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener): scala.Unit
  /** Returns a list of ranges that are used by objects that are currently selected. */
  def getSelectedRanges(): activexDashInteropLib.SafeArray[HighlightedRange]
  /** unregisters an event listener which was registered with {@link XRangeHighlighter.addSelectionChangeListener()} before. */
  def removeSelectionChangeListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener): scala.Unit
}

