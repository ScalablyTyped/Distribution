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

object XChartShapeContainer {
  @scala.inline
  def apply(
    Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    acquire: () => scala.Unit,
    addShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    getShape: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal(Shape = Shape, acquire = js.Any.fromFunction0(acquire), addShape = js.Any.fromFunction1(addShape), getShape = js.Any.fromFunction0(getShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeShape = js.Any.fromFunction1(removeShape))
  
    __obj.asInstanceOf[XChartShapeContainer]
  }
}

