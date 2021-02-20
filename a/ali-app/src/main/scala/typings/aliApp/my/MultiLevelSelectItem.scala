package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3
@js.native
trait MultiLevelSelectItem extends StObject {
  
  var name: String = js.native
  
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
}
object MultiLevelSelectItem {
  
  @scala.inline
  def apply(name: String): MultiLevelSelectItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLevelSelectItem]
  }
  
  @scala.inline
  implicit class MultiLevelSelectItemMutableBuilder[Self <: MultiLevelSelectItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    @scala.inline
    def setSubListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "subList", js.Array(value :_*))
  }
}
