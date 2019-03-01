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
    acquire: js.Function0[scala.Unit],
    addSelection: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    getSelectedPortionCount: js.Function0[scala.Double],
    getSeletedPositionEnd: js.Function1[scala.Double, scala.Double],
    getSeletedPositionStart: js.Function1[scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSelection: js.Function1[scala.Double, scala.Boolean],
    scrollToPosition: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Boolean, 
      scala.Boolean
    ]
  ): XAccessibleTextSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SelectedPortionCount")(SelectedPortionCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSelection")(addSelection)
    __obj.updateDynamic("getSelectedPortionCount")(getSelectedPortionCount)
    __obj.updateDynamic("getSeletedPositionEnd")(getSeletedPositionEnd)
    __obj.updateDynamic("getSeletedPositionStart")(getSeletedPositionStart)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSelection")(removeSelection)
    __obj.updateDynamic("scrollToPosition")(scrollToPosition)
    __obj.asInstanceOf[XAccessibleTextSelection]
  }
}

