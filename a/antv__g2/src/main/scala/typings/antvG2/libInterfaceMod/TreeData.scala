package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeData
  extends StObject
     with FacetData {
  
  var children: js.UndefOr[js.Array[TreeData]] = js.undefined
  
  var originColIndex: js.UndefOr[Double] = js.undefined
}
object TreeData {
  
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
  ): TreeData = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], columnValue = columnValue.asInstanceOf[js.Any], columnValuesLength = columnValuesLength.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowValue = rowValue.asInstanceOf[js.Any], rowValuesLength = rowValuesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeData]
  }
  
  extension [Self <: TreeData](x: Self) {
    
    inline def setChildren(value: js.Array[TreeData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: TreeData*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOriginColIndex(value: Double): Self = StObject.set(x, "originColIndex", value.asInstanceOf[js.Any])
    
    inline def setOriginColIndexUndefined: Self = StObject.set(x, "originColIndex", js.undefined)
  }
}
