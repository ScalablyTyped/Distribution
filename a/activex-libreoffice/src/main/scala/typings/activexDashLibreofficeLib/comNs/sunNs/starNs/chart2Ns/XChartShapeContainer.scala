package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartShapeContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /** a renderer creates ChartShapes and adds it to this container */
  def addShape(xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape): scala.Unit
  def getShape(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /** a renderer can remove ChartShapes from this container (e.g. if the visible range has changed) */
  def removeShape(xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape): scala.Unit
}

