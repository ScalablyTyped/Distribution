package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleTextSelection extends XInterface {
  val SelectedPortionCount: Double
  def addSelection(selectionIndex: Double, startOffset: Double, endOffset: Double): Double
  def getSelectedPortionCount(): Double
  def getSeletedPositionEnd(nSelectedPortionIndex: Double): Double
  def getSeletedPositionStart(nSelectedPortionIndex: Double): Double
  def removeSelection(selectionIndex: Double): Boolean
  def scrollToPosition(aPoint: Point, isLeftTop: Boolean): Boolean
}

object XAccessibleTextSelection {
  @scala.inline
  def apply(
    SelectedPortionCount: Double,
    acquire: () => Unit,
    addSelection: (Double, Double, Double) => Double,
    getSelectedPortionCount: () => Double,
    getSeletedPositionEnd: Double => Double,
    getSeletedPositionStart: Double => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelection: Double => Boolean,
    scrollToPosition: (Point, Boolean) => Boolean
  ): XAccessibleTextSelection = {
    val __obj = js.Dynamic.literal(SelectedPortionCount = SelectedPortionCount, acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction3(addSelection), getSelectedPortionCount = js.Any.fromFunction0(getSelectedPortionCount), getSeletedPositionEnd = js.Any.fromFunction1(getSeletedPositionEnd), getSeletedPositionStart = js.Any.fromFunction1(getSeletedPositionStart), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), scrollToPosition = js.Any.fromFunction2(scrollToPosition))
  
    __obj.asInstanceOf[XAccessibleTextSelection]
  }
}

