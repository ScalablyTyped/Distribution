package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the diagram of the chart document.
  * @see XChartDocument
  */
trait XDiagram
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape {
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  val DiagramType: java.lang.String
  /**
    * @param nCol the index of the data point of a series (0-based).
    * @param nRow the index of a series (0-based).
    * @returns the properties of the specified data point.
    * @see ChartDataPointProperties
    */
  def getDataPointProperties(nCol: scala.Double, nRow: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @param nRow the index of the series (0-based)
    * @returns the properties of the specified data row (series).
    * @see ChartDataRowProperties
    */
  def getDataRowProperties(nRow: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns a string representing the diagram type. This string contains the fully qualified name of the corresponding service. */
  def getDiagramType(): java.lang.String
}

object XDiagram {
  @scala.inline
  def apply(
    DiagramType: java.lang.String,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    getDataPointProperties: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getDataRowProperties: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getDiagramType: js.Function0[java.lang.String],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XDiagram = {
    val __obj = js.Dynamic.literal(DiagramType = DiagramType, Position = Position, ShapeType = ShapeType, Size = Size, acquire = acquire, getDataPointProperties = getDataPointProperties, getDataRowProperties = getDataRowProperties, getDiagramType = getDiagramType, getPosition = getPosition, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, setPosition = setPosition, setSize = setSize)
  
    __obj.asInstanceOf[XDiagram]
  }
}

