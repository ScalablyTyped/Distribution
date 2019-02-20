package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure describes a single data row, specified by its name and a sequence of data points.
  *
  * The cell addresses are in the format of the application that contains this chart.
  */
trait ChartSeriesAddress extends js.Object {
  /** contains the cell range address of the data for this series. */
  var DataRangeAddress: java.lang.String
  /**
    * contains cell addresses for each domain of this series.
    *
    * For XY (scatter) diagrams at least one series has a domain. Most of the other chart types use an empty sequence here.
    */
  var DomainRangeAddresses: activexDashInteropLib.SafeArray[java.lang.String]
  /** contains the cell address of label (i.e. name) of this series. */
  var LabelAddress: java.lang.String
}

