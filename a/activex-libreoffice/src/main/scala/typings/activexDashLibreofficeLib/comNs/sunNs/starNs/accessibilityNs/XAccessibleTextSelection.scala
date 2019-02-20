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

