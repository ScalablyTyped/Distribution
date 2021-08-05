package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.parallel
import typings.antd.formItemInputMod.FormItemInputProps
import typings.antd.formItemLabelMod.FormItemLabelProps
import typings.rcFieldForm.anon.Source
import typings.rcFieldForm.fieldMod.ShouldUpdate
import typings.rcFieldForm.interfaceMod.EventArgs
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formItemMod {
  
  @JSImport("antd/lib/form/FormItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Values](props: FormItemProps[Values]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type ChildrenType[Values] = RenderChildren[Values] | ReactNode
  
  trait FormItemProps[Values]
    extends StObject
       with FormItemLabelProps
       with FormItemInputProps
       with RcFieldProps {
    
    var children: js.UndefOr[ChildrenType[Values]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Auto passed by List render props. User should not use this. */
    var fieldKey: js.UndefOr[Key | js.Array[Key]] = js.undefined
    
    var hasFeedback: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var noStyle: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
  }
  object FormItemProps {
    
    inline def apply[Values](): FormItemProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemProps[Values]]
    }
    
    extension [Self <: FormItemProps[?], Values](x: Self & FormItemProps[Values]) {
      
      inline def setChildren(value: ChildrenType[Values]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* form */ FormInstance[Values] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFieldKey(value: Key | js.Array[Key]): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      inline def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      inline def setFieldKeyVarargs(value: Key*): Self = StObject.set(x, "fieldKey", js.Array(value :_*))
      
      inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      inline def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      inline def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    }
  }
  
  /* Inlined std.Omit<rc-field-form.rc-field-form/es/Field.FieldProps<any>, 'children'> */
  trait RcFieldProps extends StObject {
    
    var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, js.Object]] = js.undefined
    
    var initialValue: js.UndefOr[js.Any] = js.undefined
    
    var isList: js.UndefOr[Boolean] = js.undefined
    
    var isListField: js.UndefOr[Boolean] = js.undefined
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: js.UndefOr[NamePath] = js.undefined
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[js.Any]] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.undefined
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
    
    var valuePropName: js.UndefOr[String] = js.undefined
  }
  object RcFieldProps {
    
    inline def apply(): RcFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RcFieldProps]
    }
    
    extension [Self <: RcFieldProps](x: Self) {
      
      inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      inline def setGetValueProps(value: /* value */ StoreValue => js.Object): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      inline def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      inline def setInitialValue(value: js.Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      inline def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      inline def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      inline def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      inline def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      inline def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      inline def setShouldUpdate(value: ShouldUpdate[js.Any]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateFunction3(value: (js.Any, js.Any, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      inline def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      inline def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
      
      inline def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      inline def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
    }
  }
  
  type RenderChildren[Values] = js.Function1[/* form */ FormInstance[Values], ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.warning
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.validating
    - typings.antd.antdStrings._empty
  */
  trait ValidateStatus extends StObject
}
