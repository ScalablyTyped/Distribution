package typings.antvG2.libInterfaceMod

import typings.antvG2.libChartViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetData extends StObject {
  
  /**
    * @title 分面列字段。
    */
  val columnField: String
  
  /**
    * @title 当前列索引。
    */
  val columnIndex: Double
  
  /**
    * @title 当前列分面的枚举值。
    */
  val columnValue: String
  
  /**
    * @title 当前列字段的枚举值长度。
    */
  val columnValuesLength: Double
  
  /**
    * @title 当前分面子 view 的数据。
    */
  val data: js.Array[js.Object]
  
  /**
    * @title 当前分面子 view 的 padding。
    */
  val padding: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 当前分面子 view 的范围。
    */
  val region: Region
  
  /**
    * @title 分面行字段。
    */
  val rowField: String
  
  /**
    * @title 当前行索引。
    */
  val rowIndex: Double
  
  /**
    * @title 当前行分面的枚举值。
    */
  val rowValue: String
  
  /**
    * @title 当前行字段的枚举值长度。
    */
  val rowValuesLength: Double
  
  /**
    * @title 分面类型。
    */
  val `type`: String
  
  /**
    * @title 当前 facet 对应生成的 view。
    */
  var view: js.UndefOr[View] = js.undefined
}
object FacetData {
  
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
  ): FacetData = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], columnValue = columnValue.asInstanceOf[js.Any], columnValuesLength = columnValuesLength.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowValue = rowValue.asInstanceOf[js.Any], rowValuesLength = rowValuesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacetData] (val x: Self) extends AnyVal {
    
    inline def setColumnField(value: String): Self = StObject.set(x, "columnField", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnValue(value: String): Self = StObject.set(x, "columnValue", value.asInstanceOf[js.Any])
    
    inline def setColumnValuesLength(value: Double): Self = StObject.set(x, "columnValuesLength", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRowField(value: String): Self = StObject.set(x, "rowField", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowValue(value: String): Self = StObject.set(x, "rowValue", value.asInstanceOf[js.Any])
    
    inline def setRowValuesLength(value: Double): Self = StObject.set(x, "rowValuesLength", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
