package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem & {  isUrl :boolean} */
trait MenuDataItemisUrlboolean
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * @name 子菜单
    */
  var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  
  /**
    * @name disable 菜单选项
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 隐藏自己，并且将子节点提升到与自己平级
    */
  var flatMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 在菜单中隐藏子节点
    */
  var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 在菜单中隐藏自己和子节点
    */
  var hideInMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 菜单的icon
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  
  var isUrl: Boolean
  
  /**
    * @name 用于标定选中的值，默认是 path
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * @name 自定义菜单的国际化 key
    */
  var locale: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * @name 菜单的名字
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @name 自定义父节点
    * @description 当此节点被选中的时候也会选中 parentKeys 的节点
    */
  var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @name 路径
    */
  var path: js.UndefOr[String] = js.undefined
}
object MenuDataItemisUrlboolean {
  
  @scala.inline
  def apply(isUrl: Boolean): MenuDataItemisUrlboolean = {
    val __obj = js.Dynamic.literal(isUrl = isUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDataItemisUrlboolean]
  }
  
  @scala.inline
  implicit class MenuDataItemisUrlbooleanMutableBuilder[Self <: MenuDataItemisUrlboolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFlatMenu(value: Boolean): Self = StObject.set(x, "flatMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatMenuUndefined: Self = StObject.set(x, "flatMenu", js.undefined)
    
    @scala.inline
    def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
    
    @scala.inline
    def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIsUrl(value: Boolean): Self = StObject.set(x, "isUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
    
    @scala.inline
    def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
