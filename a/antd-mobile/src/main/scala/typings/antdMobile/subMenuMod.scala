package typings.antdMobile

import typings.antdMobile.menuPropsTypeMod.DataItem
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMenuMod {
  
  @JSImport("antd-mobile/lib/menu/SubMenu", JSImport.Default)
  @js.native
  def default(props: PropsType): Element = js.native
  
  @js.native
  trait PropsType extends StObject {
    
    var multiSelect: js.UndefOr[Boolean] = js.native
    
    def onSel(dataItem: DataItem): Unit = js.native
    
    var radioPrefixCls: js.UndefOr[String] = js.native
    
    var selItem: js.Array[DataItem] = js.native
    
    var showSelect: Boolean = js.native
    
    var subMenuData: js.Array[DataItem] = js.native
    
    var subMenuPrefixCls: js.UndefOr[String] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(
      onSel: DataItem => Unit,
      selItem: js.Array[DataItem],
      showSelect: Boolean,
      subMenuData: js.Array[DataItem]
    ): PropsType = {
      val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setOnSel(value: DataItem => Unit): Self = StObject.set(x, "onSel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioPrefixClsUndefined: Self = StObject.set(x, "radioPrefixCls", js.undefined)
      
      @scala.inline
      def setSelItem(value: js.Array[DataItem]): Self = StObject.set(x, "selItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelItemVarargs(value: DataItem*): Self = StObject.set(x, "selItem", js.Array(value :_*))
      
      @scala.inline
      def setShowSelect(value: Boolean): Self = StObject.set(x, "showSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuData(value: js.Array[DataItem]): Self = StObject.set(x, "subMenuData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuDataVarargs(value: DataItem*): Self = StObject.set(x, "subMenuData", js.Array(value :_*))
      
      @scala.inline
      def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuPrefixClsUndefined: Self = StObject.set(x, "subMenuPrefixCls", js.undefined)
    }
  }
}
