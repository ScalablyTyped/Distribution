package typings.aliApp.my

import typings.aliApp.anon.Index
import typings.aliApp.anon.PartialBadge
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
  implicit class ActionSheetOptionsOps[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesVarargs(value: PartialBadge*): Self = this.set("badges", js.Array(value :_*))
    
    @scala.inline
    def setBadges(value: js.Array[PartialBadge]): Self = this.set("badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadges: Self = this.set("badges", js.undefined)
    
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    
    @scala.inline
    def setDestructiveBtnIndex(value: Double): Self = this.set("destructiveBtnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestructiveBtnIndex: Self = this.set("destructiveBtnIndex", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Index => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
