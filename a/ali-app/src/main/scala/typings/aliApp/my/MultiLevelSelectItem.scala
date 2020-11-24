package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 级联选择 https://docs.alipay.com/mini/api/ewdxl3
@js.native
trait MultiLevelSelectItem extends js.Object {
  
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
  implicit class MultiLevelSelectItemOps[Self <: MultiLevelSelectItem] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubListVarargs(value: MultiLevelSelectItem*): Self = this.set("subList", js.Array(value :_*))
    
    @scala.inline
    def setSubList(value: js.Array[MultiLevelSelectItem]): Self = this.set("subList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubList: Self = this.set("subList", js.undefined)
  }
}
