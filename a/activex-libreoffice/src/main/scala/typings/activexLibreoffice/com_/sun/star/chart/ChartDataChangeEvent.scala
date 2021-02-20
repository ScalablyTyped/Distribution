package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a change that was applied to the data. */
@js.native
trait ChartDataChangeEvent extends EventObject {
  
  /** specifies the column number in which the changes end. */
  var EndColumn: Double = js.native
  
  /** specifies the row number in which the changes end. */
  var EndRow: Double = js.native
  
  /** specifies the column number in which the changes begin. */
  var StartColumn: Double = js.native
  
  /** specifies the row number in which the changes begin. */
  var StartRow: Double = js.native
  
  /** specifies the type of change to the data. */
  var Type: ChartDataChangeType = js.native
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
  
  @scala.inline
  implicit class ChartDataChangeEventMutableBuilder[Self <: ChartDataChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "EndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "EndRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "StartRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartDataChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
