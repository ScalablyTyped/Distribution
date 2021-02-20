package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.checkboxCheckboxMod.CheckboxChangeEvent
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxGroupMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox/Group", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[CheckboxGroupProps] = js.native
  
  @JSImport("antd/lib/checkbox/Group", "GroupContext")
  @js.native
  val GroupContext: Context[CheckboxGroupContext | Null] = js.native
  
  @js.native
  trait AbstractCheckboxGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[js.Array[CheckboxOptionType | String]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AbstractCheckboxGroupProps {
    
    @scala.inline
    def apply(): AbstractCheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractCheckboxGroupProps]
    }
    
    @scala.inline
    implicit class AbstractCheckboxGroupPropsMutableBuilder[Self <: AbstractCheckboxGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CheckboxOptionType | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (CheckboxOptionType | String)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxGroupContext extends StObject {
    
    def cancelValue(`val`: String): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def registerValue(`val`: String): Unit = js.native
    
    var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object CheckboxGroupContext {
    
    @scala.inline
    def apply(cancelValue: String => Unit, registerValue: String => Unit): CheckboxGroupContext = {
      val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue))
      __obj.asInstanceOf[CheckboxGroupContext]
    }
    
    @scala.inline
    implicit class CheckboxGroupContextMutableBuilder[Self <: CheckboxGroupContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelValue(value: String => Unit): Self = StObject.set(x, "cancelValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegisterValue(value: String => Unit): Self = StObject.set(x, "registerValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleOption(value: /* option */ CheckboxOptionType => Unit): Self = StObject.set(x, "toggleOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleOptionUndefined: Self = StObject.set(x, "toggleOption", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CheckboxGroupProps extends AbstractCheckboxGroupProps {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.native
    
    var value: js.UndefOr[js.Array[CheckboxValueType]] = js.native
  }
  object CheckboxGroupProps {
    
    @scala.inline
    def apply(): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    @scala.inline
    implicit class CheckboxGroupPropsMutableBuilder[Self <: CheckboxGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CheckboxOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var label: ReactNode = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: CheckboxValueType = js.native
  }
  object CheckboxOptionType {
    
    @scala.inline
    def apply(value: CheckboxValueType): CheckboxOptionType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxOptionType]
    }
    
    @scala.inline
    implicit class CheckboxOptionTypeMutableBuilder[Self <: CheckboxOptionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ CheckboxChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: CheckboxValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxValueType = String | Double | Boolean
  
  type _To = NamedExoticComponent[CheckboxGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxGroupMod.foo` */
  override def _to: NamedExoticComponent[CheckboxGroupProps] = default
}
