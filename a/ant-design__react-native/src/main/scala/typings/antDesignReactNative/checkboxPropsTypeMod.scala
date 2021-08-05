package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Checked
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxPropsTypeMod {
  
  trait CheckboxItemPropsType
    extends StObject
       with CheckboxPropsType {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CheckboxItemPropsType {
    
    inline def apply(): CheckboxItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemPropsType]
    }
    
    extension [Self <: CheckboxItemPropsType](x: Self) {
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setOnPress(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait CheckboxPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Unit]] = js.undefined
  }
  object CheckboxPropsType {
    
    inline def apply(): CheckboxPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxPropsType]
    }
    
    extension [Self <: CheckboxPropsType](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* params */ OnChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait OnChangeParams extends StObject {
    
    var target: Checked
  }
  object OnChangeParams {
    
    inline def apply(target: Checked): OnChangeParams = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeParams]
    }
    
    extension [Self <: OnChangeParams](x: Self) {
      
      inline def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
