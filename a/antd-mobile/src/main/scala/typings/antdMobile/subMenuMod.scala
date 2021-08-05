package typings.antdMobile

import typings.antdMobile.menuPropsTypeMod.DataItem
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMenuMod {
  
  @JSImport("antd-mobile/lib/menu/SubMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PropsType): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PropsType extends StObject {
    
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    def onSel(dataItem: DataItem): Unit
    
    var radioPrefixCls: js.UndefOr[String] = js.undefined
    
    var selItem: js.Array[DataItem]
    
    var showSelect: Boolean
    
    var subMenuData: js.Array[DataItem]
    
    var subMenuPrefixCls: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    inline def apply(
      onSel: DataItem => Unit,
      selItem: js.Array[DataItem],
      showSelect: Boolean,
      subMenuData: js.Array[DataItem]
    ): PropsType = {
      val __obj = js.Dynamic.literal(onSel = js.Any.fromFunction1(onSel), selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setOnSel(value: DataItem => Unit): Self = StObject.set(x, "onSel", js.Any.fromFunction1(value))
      
      inline def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRadioPrefixClsUndefined: Self = StObject.set(x, "radioPrefixCls", js.undefined)
      
      inline def setSelItem(value: js.Array[DataItem]): Self = StObject.set(x, "selItem", value.asInstanceOf[js.Any])
      
      inline def setSelItemVarargs(value: DataItem*): Self = StObject.set(x, "selItem", js.Array(value :_*))
      
      inline def setShowSelect(value: Boolean): Self = StObject.set(x, "showSelect", value.asInstanceOf[js.Any])
      
      inline def setSubMenuData(value: js.Array[DataItem]): Self = StObject.set(x, "subMenuData", value.asInstanceOf[js.Any])
      
      inline def setSubMenuDataVarargs(value: DataItem*): Self = StObject.set(x, "subMenuData", js.Array(value :_*))
      
      inline def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setSubMenuPrefixClsUndefined: Self = StObject.set(x, "subMenuPrefixCls", js.undefined)
    }
  }
}
