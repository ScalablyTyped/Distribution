package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a change that was applied to the data. */
trait ChartDataChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the column number in which the changes end. */
  var EndColumn: scala.Double
  /** specifies the row number in which the changes end. */
  var EndRow: scala.Double
  /** specifies the column number in which the changes begin. */
  var StartColumn: scala.Double
  /** specifies the row number in which the changes begin. */
  var StartRow: scala.Double
  /** specifies the type of change to the data. */
  var Type: ChartDataChangeType
}

object ChartDataChangeEvent {
  @scala.inline
  def apply(
    EndColumn: scala.Double,
    EndRow: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StartColumn: scala.Double,
    StartRow: scala.Double,
    Type: ChartDataChangeType
  ): ChartDataChangeEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn, EndRow = EndRow, Source = Source, StartColumn = StartColumn, StartRow = StartRow, Type = Type)
  
    __obj.asInstanceOf[ChartDataChangeEvent]
  }
}

