package typings.aliApp.my

import typings.aliApp.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiLevelSelectOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
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
  
  inline def apply(): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
  
  extension [Self <: MultiLevelSelectOptions](x: Self) {
    
    inline def setList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubList(value: js.Array[MultiLevelSelectItem]): Self = StObject.set(x, "subList", value.asInstanceOf[js.Any])
    
    inline def setSubListUndefined: Self = StObject.set(x, "subList", js.undefined)
    
    inline def setSubListVarargs(value: MultiLevelSelectItem*): Self = StObject.set(x, "subList", js.Array(value*))
    
    inline def setSuccess(value: /* res */ Result => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
