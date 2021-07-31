package typings.aliApp.my

import typings.aliApp.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiLevelSelectOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  
  // 选择数据列表
  var name: js.UndefOr[String] = js.undefined
  
  // 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.undefined
  
  // 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ Result, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MultiLevelSelectOptions {
  
  @scala.inline
  def apply(): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
  
  @scala.inline
  implicit class MultiLevelSelectOptionsMutableBuilder[Self <: MultiLevelSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "list", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    @scala.inline
    def setSubListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "subList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ Result => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
