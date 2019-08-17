package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chartNs {
  import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv

  /** must be supported by every component that wants to provide data for a chart */
  type ChartData = XChartData
  /** @deprecated Deprecated */
  type ChartDataPoint = SeqEquiv[ChartDataValue]
  /**
    * a service for donut diagrams.
    *
    * Donut diagrams are also known as ring diagrams.
    */
  type DonutDiagram = Diagram
}
