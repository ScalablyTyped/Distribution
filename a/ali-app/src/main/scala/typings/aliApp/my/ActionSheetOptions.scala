package typings.aliApp.my

import typings.aliApp.anon.Index
import typings.aliApp.anon.PartialBadge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需飘红选项的数组，数组内部对象字段见下表
    */
  var badges: js.UndefOr[js.Array[PartialBadge]] = js.native
  
  /**
    * 取消按钮文案。默认为‘取消’。注：Android平台此字段无效，不会显示取消按钮。
    */
  var cancelButtonText: js.UndefOr[String] = js.native
  
  /**
    * （iOS特殊处理）指定按钮的索引号，从0开始，使用场景：需要删除或清除数据等类似场景，默认红色
    */
  var destructiveBtnIndex: js.UndefOr[Double] = js.native
  
  /**
    * 菜单按钮文字数组
    */
  var items: js.Array[String] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ Index, Unit]] = js.native
  
  /** 菜单标题 */
  var title: js.UndefOr[String] = js.native
}
object ActionSheetOptions {
  
  @scala.inline
  def apply(items: js.Array[String]): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
  
  @scala.inline
  implicit class ActionSheetOptionsMutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadges(value: js.Array[PartialBadge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesUndefined: Self = StObject.set(x, "badges", js.undefined)
    
    @scala.inline
    def setBadgesVarargs(value: PartialBadge*): Self = StObject.set(x, "badges", js.Array(value :_*))
    
    @scala.inline
    def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    @scala.inline
    def setDestructiveBtnIndex(value: Double): Self = StObject.set(x, "destructiveBtnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestructiveBtnIndexUndefined: Self = StObject.set(x, "destructiveBtnIndex", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ Index => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
