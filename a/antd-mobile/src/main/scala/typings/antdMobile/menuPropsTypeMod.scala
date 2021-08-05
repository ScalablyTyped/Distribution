package typings.antdMobile

import org.scalablytyped.runtime.StringDictionary
import typings.antdMobile.antdMobileNumbers.`1`
import typings.antdMobile.antdMobileNumbers.`2`
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuPropsTypeMod {
  
  trait DataItem
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object DataItem {
    
    inline def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    extension [Self <: DataItem](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MenuProps extends StObject {
    
    var MenuSelectContanerPrefixCls: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[DataItem]] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[`1` | `2`] = js.undefined
    
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    var multiSelectMenuBtnsCls: js.UndefOr[String] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var radioPrefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subMenuPrefixCls: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[DataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: DataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLevel(value: `1` | `2`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMenuSelectContanerPrefixCls(value: String): Self = StObject.set(x, "MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setMenuSelectContanerPrefixClsUndefined: Self = StObject.set(x, "MenuSelectContanerPrefixCls", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectMenuBtnsCls(value: String): Self = StObject.set(x, "multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectMenuBtnsClsUndefined: Self = StObject.set(x, "multiSelectMenuBtnsCls", js.undefined)
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[ValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnOk(value: /* value */ js.UndefOr[ValueType] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRadioPrefixCls(value: String): Self = StObject.set(x, "radioPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRadioPrefixClsUndefined: Self = StObject.set(x, "radioPrefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubMenuPrefixCls(value: String): Self = StObject.set(x, "subMenuPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setSubMenuPrefixClsUndefined: Self = StObject.set(x, "subMenuPrefixCls", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type ValueType = js.Array[String | js.Array[String]]
}
