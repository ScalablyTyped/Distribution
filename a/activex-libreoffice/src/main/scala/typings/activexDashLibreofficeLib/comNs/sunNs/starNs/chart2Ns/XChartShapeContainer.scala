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
    acquire: js.Function0[scala.Unit],
    addShape: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    getShape: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeShape: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit]
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shape")(Shape)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addShape")(addShape)
    __obj.updateDynamic("getShape")(getShape)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeShape")(removeShape)
    __obj.asInstanceOf[XChartShapeContainer]
  }
}

