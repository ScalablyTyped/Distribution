package typings.antdMobileRn

import typings.antdMobileRn.anon.Checked
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxPropsTypeMod {
  
  trait CheckboxItemPropsType
    extends StObject
       with CheckboxPropsType {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CheckboxItemPropsType {
    
    @scala.inline
    def apply(): CheckboxItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxItemPropsType]
    }
    
    @scala.inline
    implicit class CheckboxItemPropsTypeMutableBuilder[Self <: CheckboxItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  trait CheckboxPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Unit]] = js.undefined
  }
  object CheckboxPropsType {
    
    @scala.inline
    def apply(): CheckboxPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxPropsType]
    }
    
    @scala.inline
    implicit class CheckboxPropsTypeMutableBuilder[Self <: CheckboxPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* params */ OnChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  trait OnChangeParams extends StObject {
    
    var target: Checked
  }
  object OnChangeParams {
    
    @scala.inline
    def apply(target: Checked): OnChangeParams = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeParams]
    }
    
    @scala.inline
    implicit class OnChangeParamsMutableBuilder[Self <: OnChangeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Checked): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
