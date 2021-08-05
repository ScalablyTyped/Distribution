package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3
trait MultiLevelSelectItem extends StObject {
  
  var name: String
  
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
}
object MultiLevelSelectItem {
  
  inline def apply(name: String): MultiLevelSelectItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectItem]
  }
  
  extension [Self <: MultiLevelSelectItem](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    inline def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    inline def setSubListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "subList", js.Array(value :_*))
  }
}
