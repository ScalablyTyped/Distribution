package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem & {  isUrl :boolean} */
@js.native
trait MenuDataItemisUrlboolean
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * @name 子菜单
    */
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  /**
    * @name disable 菜单选项
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 隐藏自己，并且将子节点提升到与自己平级
    */
  var flatMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 在菜单中隐藏子节点
    */
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 在菜单中隐藏自己和子节点
    */
  var hideInMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 菜单的icon
    */
  var icon: js.UndefOr[ReactNode] = js.native
  
  var isUrl: Boolean = js.native
  
  /**
    * @name 用于标定选中的值，默认是 path
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * @name 自定义菜单的国际化 key
    */
  var locale: js.UndefOr[String | `false`] = js.native
  
  /**
    * @name 菜单的名字
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * @name 自定义父节点
    * @description 当此节点被选中的时候也会选中 parentKeys 的节点
    */
  var parentKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @name 路径
    */
  var path: js.UndefOr[String] = js.native
}
object MenuDataItemisUrlboolean {
  
  @scala.inline
  def apply(isUrl: Boolean): MenuDataItemisUrlboolean = {
    val __obj = js.Dynamic.literal(isUrl = isUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDataItemisUrlboolean]
  }
  
  @scala.inline
  implicit class MenuDataItemisUrlbooleanOps[Self <: MenuDataItemisUrlboolean] (val x: Self) extends AnyVal {
    
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
    def setIsUrl(value: Boolean): Self = this.set("isUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: MenuDataItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[MenuDataItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFlatMenu(value: Boolean): Self = this.set("flatMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatMenu: Self = this.set("flatMenu", js.undefined)
    
    @scala.inline
    def setHideChildrenInMenu(value: Boolean): Self = this.set("hideChildrenInMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideChildrenInMenu: Self = this.set("hideChildrenInMenu", js.undefined)
    
    @scala.inline
    def setHideInMenu(value: Boolean): Self = this.set("hideInMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInMenu: Self = this.set("hideInMenu", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLocale(value: String | `false`): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentKeysVarargs(value: String*): Self = this.set("parentKeys", js.Array(value :_*))
    
    @scala.inline
    def setParentKeys(value: js.Array[String]): Self = this.set("parentKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentKeys: Self = this.set("parentKeys", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
