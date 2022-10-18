package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Checked
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxPropsTypeMod {
  
  trait CheckboxForwardedRef extends StObject {
    
    def onPress(): Unit
  }
  object CheckboxForwardedRef {
    
    inline def apply(onPress: () => Unit): CheckboxForwardedRef = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[CheckboxForwardedRef]
    }
    
    extension [Self <: CheckboxForwardedRef](x: Self) {
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    }
  }
  
  trait CheckboxItemPropsType
    extends StObject
       with CheckboxPropsType {
    
    var left: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
  }
  object CheckboxItemPropsType {
    
    inline def apply(): CheckboxItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemPropsType]
    }
    
    extension [Self <: CheckboxItemPropsType](x: Self) {
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  trait CheckboxPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* _e */ OnChangeParams, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CheckboxPropsType {
    
    inline def apply(): CheckboxPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxPropsType]
    }
    
    extension [Self <: CheckboxPropsType](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOnChange(value: /* _e */ OnChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
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
