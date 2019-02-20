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

