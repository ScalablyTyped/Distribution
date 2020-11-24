package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * information about a cell positioned within the result area of a DataPilot table.
  *
  * {@link DataPilotTableResultData} contains information about a particular cell positioned within the result area of a DataPilot table.
  * @see com.sun.star.sheet.DataPilotTablePositionData
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPilotFieldFilter
  * @see com.sun.star.sheet.DataResult
  * @since OOo 3.0
  */
@js.native
trait DataPilotTableResultData extends js.Object {
  
  /**
    * This is a 0-based index that specifies which data field the data displayed in the cell is for; the value of 0 means the cell is for the first data
    * field, 1 for the second, and so on.
    */
  var DataFieldIndex: Double = js.native
  
  /**
    * This is a set of filter criteria that can be used to re-create those data rows that contribute to the value shown in the cell.
    * @see com.sun.star.sheet.DataPilotFieldFilter
    */
  var FieldFilters: SafeArray[DataPilotFieldFilter] = js.native
  
  /**
    * more information about the result contained in the {@link DataResult} type.
    * @see com.sun.star.sheet.DataResult
    */
  var Result: DataResult = js.native
}
object DataPilotTableResultData {
  
  @scala.inline
  def apply(DataFieldIndex: Double, FieldFilters: SafeArray[DataPilotFieldFilter], Result: DataResult): DataPilotTableResultData = {
    val __obj = js.Dynamic.literal(DataFieldIndex = DataFieldIndex.asInstanceOf[js.Any], FieldFilters = FieldFilters.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableResultData]
  }
  
  @scala.inline
  implicit class DataPilotTableResultDataOps[Self <: DataPilotTableResultData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataFieldIndex(value: Double): Self = this.set("DataFieldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFilters(value: SafeArray[DataPilotFieldFilter]): Self = this.set("FieldFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: DataResult): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
}
