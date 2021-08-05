package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait DataPilotTableResultData extends StObject {
  
  /**
    * This is a 0-based index that specifies which data field the data displayed in the cell is for; the value of 0 means the cell is for the first data
    * field, 1 for the second, and so on.
    */
  var DataFieldIndex: Double
  
  /**
    * This is a set of filter criteria that can be used to re-create those data rows that contribute to the value shown in the cell.
    * @see com.sun.star.sheet.DataPilotFieldFilter
    */
  var FieldFilters: SafeArray[DataPilotFieldFilter]
  
  /**
    * more information about the result contained in the {@link DataResult} type.
    * @see com.sun.star.sheet.DataResult
    */
  var Result: DataResult
}
object DataPilotTableResultData {
  
  inline def apply(DataFieldIndex: Double, FieldFilters: SafeArray[DataPilotFieldFilter], Result: DataResult): DataPilotTableResultData = {
    val __obj = js.Dynamic.literal(DataFieldIndex = DataFieldIndex.asInstanceOf[js.Any], FieldFilters = FieldFilters.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableResultData]
  }
  
  extension [Self <: DataPilotTableResultData](x: Self) {
    
    inline def setDataFieldIndex(value: Double): Self = StObject.set(x, "DataFieldIndex", value.asInstanceOf[js.Any])
    
    inline def setFieldFilters(value: SafeArray[DataPilotFieldFilter]): Self = StObject.set(x, "FieldFilters", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DataResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
