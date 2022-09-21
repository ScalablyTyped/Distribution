package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListData
  extends StObject
     with FacetData {
  
  val total: js.UndefOr[Double] = js.undefined
}
object ListData {
  
  inline def apply(
    columnField: String,
    columnIndex: Double,
    columnValue: String,
    columnValuesLength: Double,
    data: js.Array[js.Object],
    region: Region,
    rowField: String,
    rowIndex: Double,
    rowValue: String,
    rowValuesLength: Double,
    `type`: String
  ): ListData = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], columnValue = columnValue.asInstanceOf[js.Any], columnValuesLength = columnValuesLength.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowValue = rowValue.asInstanceOf[js.Any], rowValuesLength = rowValuesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListData]
  }
  
  extension [Self <: ListData](x: Self) {
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
