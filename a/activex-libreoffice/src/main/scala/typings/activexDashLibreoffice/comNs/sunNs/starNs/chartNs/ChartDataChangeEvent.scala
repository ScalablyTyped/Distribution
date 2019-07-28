package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a change that was applied to the data. */
trait ChartDataChangeEvent extends EventObject {
  /** specifies the column number in which the changes end. */
  var EndColumn: Double
  /** specifies the row number in which the changes end. */
  var EndRow: Double
  /** specifies the column number in which the changes begin. */
  var StartColumn: Double
  /** specifies the row number in which the changes begin. */
  var StartRow: Double
  /** specifies the type of change to the data. */
  var Type: ChartDataChangeType
}

object ChartDataChangeEvent {
  @scala.inline
  def apply(
    EndColumn: Double,
    EndRow: Double,
    Source: XInterface,
    StartColumn: Double,
    StartRow: Double,
    Type: ChartDataChangeType
  ): ChartDataChangeEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn, EndRow = EndRow, Source = Source, StartColumn = StartColumn, StartRow = StartRow, Type = Type)
  
    __obj.asInstanceOf[ChartDataChangeEvent]
  }
}

