package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxGroupMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox/Group", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  
  @JSImport("antd/lib/checkbox/Group", "GroupContext")
  @js.native
  val GroupContext: Context[CheckboxGroupContext | Null] = js.native
  
  trait AbstractCheckboxGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Array[CheckboxOptionType | String | Double]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AbstractCheckboxGroupProps {
    
    inline def apply(): AbstractCheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractCheckboxGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractCheckboxGroupProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOptions(value: js.Array[CheckboxOptionType | String | Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (CheckboxOptionType | String | Double)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CheckboxGroupContext extends StObject {
    
    def cancelValue(`val`: String): Unit
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def registerValue(`val`: String): Unit
    
    var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object CheckboxGroupContext {
    
    inline def apply(cancelValue: String => Unit, registerValue: String => Unit): CheckboxGroupContext = {
      val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue))
      __obj.asInstanceOf[CheckboxGroupContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxGroupContext] (val x: Self) extends AnyVal {
      
      inline def setCancelValue(value: String => Unit): Self = StObject.set(x, "cancelValue", js.Any.fromFunction1(value))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegisterValue(value: String => Unit): Self = StObject.set(x, "registerValue", js.Any.fromFunction1(value))
      
      inline def setToggleOption(value: /* option */ CheckboxOptionType => Unit): Self = StObject.set(x, "toggleOption", js.Any.fromFunction1(value))
      
      inline def setToggleOptionUndefined: Self = StObject.set(x, "toggleOption", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxGroupProps
    extends StObject
       with AbstractCheckboxGroupProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.undefined
    
    var value: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
  }
  object CheckboxGroupProps {
    
    inline def apply(): CheckboxGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxGroupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: js.Array[CheckboxValueType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CheckboxValueType*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait CheckboxOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactNode
    
    var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: CheckboxValueType
  }
  object CheckboxOptionType {
    
    inline def apply(value: CheckboxValueType): CheckboxOptionType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxOptionType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxOptionType] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: /* e */ CheckboxChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: CheckboxValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxValueType = String | Double | Boolean
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxGroupMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = default
}
