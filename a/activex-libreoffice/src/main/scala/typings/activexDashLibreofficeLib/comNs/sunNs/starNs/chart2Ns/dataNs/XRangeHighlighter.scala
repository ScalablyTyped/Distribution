package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRangeHighlighter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Returns a list of ranges that are used by objects that are currently selected. */
  val SelectedRanges: stdLib.SafeArray[HighlightedRange]
  /** registers an event listener, which is called when the selection is changed and affects different source ranges */
  def addSelectionChangeListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener): scala.Unit
  /** Returns a list of ranges that are used by objects that are currently selected. */
  def getSelectedRanges(): stdLib.SafeArray[HighlightedRange]
  /** unregisters an event listener which was registered with {@link XRangeHighlighter.addSelectionChangeListener()} before. */
  def removeSelectionChangeListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener): scala.Unit
}

object XRangeHighlighter {
  @scala.inline
  def apply(
    SelectedRanges: stdLib.SafeArray[HighlightedRange],
    acquire: () => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    getSelectedRanges: () => stdLib.SafeArray[HighlightedRange],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit
  ): XRangeHighlighter = {
    val __obj = js.Dynamic.literal(SelectedRanges = SelectedRanges, acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getSelectedRanges = js.Any.fromFunction0(getSelectedRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener))
  
    __obj.asInstanceOf[XRangeHighlighter]
  }
}

