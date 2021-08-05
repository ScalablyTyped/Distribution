package typings.antvG2.anon

import typings.antvG2.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoSetAxis extends StObject {
  
  /**
    * 自动设置坐标轴的文本，避免重复和遮挡
    */
  var autoSetAxis: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 列标题
    */
  var colTitle: js.UndefOr[OffsetY | Null] = js.undefined
  
  /**
    * 创建每个分面中的视图
    * @param view 视图对象
    * @param facet 行列等信息，常见属性：data rows cols rowIndex colIndex rowField colField
    */
  var eachView: js.UndefOr[js.Function2[/* view */ View, /* facet */ js.Any, Unit]] = js.undefined
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 每个 view 之间的间距
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * 行标题
    */
  var rowTitle: js.UndefOr[OffsetX | Null] = js.undefined
  
  /**
    * 显示标题
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
}
object AutoSetAxis {
  
  inline def apply(): AutoSetAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSetAxis]
  }
  
  extension [Self <: AutoSetAxis](x: Self) {
    
    inline def setAutoSetAxis(value: Boolean): Self = StObject.set(x, "autoSetAxis", value.asInstanceOf[js.Any])
    
    inline def setAutoSetAxisUndefined: Self = StObject.set(x, "autoSetAxis", js.undefined)
    
    inline def setColTitle(value: OffsetY): Self = StObject.set(x, "colTitle", value.asInstanceOf[js.Any])
    
    inline def setColTitleNull: Self = StObject.set(x, "colTitle", null)
    
    inline def setColTitleUndefined: Self = StObject.set(x, "colTitle", js.undefined)
    
    inline def setEachView(value: (/* view */ View, /* facet */ js.Any) => Unit): Self = StObject.set(x, "eachView", js.Any.fromFunction2(value))
    
    inline def setEachViewUndefined: Self = StObject.set(x, "eachView", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRowTitle(value: OffsetX): Self = StObject.set(x, "rowTitle", value.asInstanceOf[js.Any])
    
    inline def setRowTitleNull: Self = StObject.set(x, "rowTitle", null)
    
    inline def setRowTitleUndefined: Self = StObject.set(x, "rowTitle", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
  }
}
