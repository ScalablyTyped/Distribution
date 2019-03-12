package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleTextSelection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val SelectedPortionCount: scala.Double
  def addSelection(selectionIndex: scala.Double, startOffset: scala.Double, endOffset: scala.Double): scala.Double
  def getSelectedPortionCount(): scala.Double
  def getSeletedPositionEnd(nSelectedPortionIndex: scala.Double): scala.Double
  def getSeletedPositionStart(nSelectedPortionIndex: scala.Double): scala.Double
  def removeSelection(selectionIndex: scala.Double): scala.Boolean
  def scrollToPosition(aPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, isLeftTop: scala.Boolean): scala.Boolean
}

object XAccessibleTextSelection {
  @scala.inline
  def apply(
    SelectedPortionCount: scala.Double,
    acquire: () => scala.Unit,
    addSelection: (scala.Double, scala.Double, scala.Double) => scala.Double,
    getSelectedPortionCount: () => scala.Double,
    getSeletedPositionEnd: scala.Double => scala.Double,
    getSeletedPositionStart: scala.Double => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSelection: scala.Double => scala.Boolean,
    scrollToPosition: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean) => scala.Boolean
  ): XAccessibleTextSelection = {
    val __obj = js.Dynamic.literal(SelectedPortionCount = SelectedPortionCount, acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction3(addSelection), getSelectedPortionCount = js.Any.fromFunction0(getSelectedPortionCount), getSeletedPositionEnd = js.Any.fromFunction1(getSeletedPositionEnd), getSeletedPositionStart = js.Any.fromFunction1(getSeletedPositionStart), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), scrollToPosition = js.Any.fromFunction2(scrollToPosition))
  
    __obj.asInstanceOf[XAccessibleTextSelection]
  }
}

