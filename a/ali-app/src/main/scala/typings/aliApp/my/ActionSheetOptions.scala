package typings.aliApp.my

import typings.aliApp.anon.Index
import typings.aliApp.anon.PartialBadge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需飘红选项的数组，数组内部对象字段见下表
    */
  var badges: js.UndefOr[js.Array[PartialBadge]] = js.undefined
  
  /**
    * 取消按钮文案。默认为‘取消’。注：Android平台此字段无效，不会显示取消按钮。
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * （iOS特殊处理）指定按钮的索引号，从0开始，使用场景：需要删除或清除数据等类似场景，默认红色
    */
  var destructiveBtnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * 菜单按钮文字数组
    */
  var items: js.Array[String]
  
  /**
    * 接口调用成功的回调函数
    */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ Index, Unit]] = js.undefined
  
  /** 菜单标题 */
  var title: js.UndefOr[String] = js.undefined
}
object ActionSheetOptions {
  
  inline def apply(items: js.Array[String]): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    
    inline def setBadges(value: js.Array[PartialBadge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    inline def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    inline def setBadgesVarargs(value: PartialBadge*): Self = StObject.set(x, "badges", js.Array(value*))
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setDestructiveBtnIndex(value: Double): Self = StObject.set(x, "destructiveBtnIndex", value.asInstanceOf[js.Any])
    
    inline def setDestructiveBtnIndexUndefined: Self = StObject.set(x, "destructiveBtnIndex", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSuccess(value: /* res */ Index => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
