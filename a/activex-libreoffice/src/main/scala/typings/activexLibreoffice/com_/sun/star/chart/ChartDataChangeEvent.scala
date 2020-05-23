package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndRow = EndRow.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartRow = StartRow.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataChangeEvent]
  }
}

