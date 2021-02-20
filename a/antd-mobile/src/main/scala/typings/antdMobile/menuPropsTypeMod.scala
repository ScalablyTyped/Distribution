package typings.antdMobile

import org.scalablytyped.runtime.StringDictionary
import typings.antdMobile.antdMobileNumbers.`1`
import typings.antdMobile.antdMobileNumbers.`2`
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuPropsTypeMod {
  
  @js.native
  trait DataItem
    extends /* key */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object DataItem {
    
    @scala.inline
    def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MenuProps extends StObject {
    
    var MenuSelectContanerPrefixCls: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Array[DataItem]] = js.native
    
    var defaultValue: js.UndefOr[ValueType] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var level: js.UndefOr[`1` | `2`] = js.native
    
    var multiSelect: js.UndefOr[Boolean] = js.native
    
    var multiSelectMenuBtnsCls: js.UndefOr[String] = js.native
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.native
    
    var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var radioPrefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subMenuPrefixCls: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[ValueType] = js.native
  }
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[DataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: DataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLevel(value: `1` | `2`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMenuSelectContanerPrefixCls(value: String): Self = StObject.set(x, "MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuSelectContanerPrefixClsUndefined: Self = StObject.set(x, "MenuSelectContanerPrefixCls", js.undefined)
      
      @scala.inline
      def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectMenuBtnsCls(value: String): Self = StObject.set(x, "multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiSelectMenuBtnsClsUndefined: Self = StObject.set(x, "multiSelectMenuBtnsCls", js.undefined)
      
      @scala.inline
      def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[ValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[ValueType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioPrefixClsUndefined: Self = StObject.set(x, "radioPrefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuPrefixClsUndefined: Self = StObject.set(x, "subMenuPrefixCls", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type ValueType = js.Array[String | js.Array[String]]
}
