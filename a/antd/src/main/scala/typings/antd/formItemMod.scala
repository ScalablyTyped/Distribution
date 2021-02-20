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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formItemMod {
  
  @JSImport("antd/lib/form/FormItem", JSImport.Default)
  @js.native
  def default[Values](props: FormItemProps[Values]): ReactElement = js.native
  
  type ChildrenType[Values] = RenderChildren[Values] | ReactNode
  
  @js.native
  trait FormItemProps[Values]
    extends FormItemLabelProps
       with FormItemInputProps
       with RcFieldProps {
    
    var children: js.UndefOr[ChildrenType[Values]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** Auto passed by List render props. User should not use this. */
    var fieldKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var hasFeedback: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var noStyle: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.native
  }
  object FormItemProps {
    
    @scala.inline
    def apply[Values](): FormItemProps[Values] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemProps[Values]]
    }
    
    @scala.inline
    implicit class FormItemPropsMutableBuilder[Self <: FormItemProps[_], Values] (val x: Self with FormItemProps[Values]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ChildrenType[Values]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* form */ FormInstance[Values] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFieldKey(value: Key | js.Array[Key]): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      @scala.inline
      def setFieldKeyVarargs(value: Key*): Self = StObject.set(x, "fieldKey", js.Array(value :_*))
      
      @scala.inline
      def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    }
  }
  
  /* Inlined std.Omit<rc-field-form.rc-field-form/es/Field.FieldProps<any>, 'children'> */
  @js.native
  trait RcFieldProps extends StObject {
    
    var dependencies: js.UndefOr[js.Array[NamePath]] = js.native
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, js.Object]] = js.native
    
    var initialValue: js.UndefOr[js.Any] = js.native
    
    var isList: js.UndefOr[Boolean] = js.native
    
    var isListField: js.UndefOr[Boolean] = js.native
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.native
    
    var name: js.UndefOr[NamePath] = js.native
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.native
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.native
    
    var preserve: js.UndefOr[Boolean] = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[_]] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.native
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
    
    var valuePropName: js.UndefOr[String] = js.native
  }
  object RcFieldProps {
    
    @scala.inline
    def apply(): RcFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RcFieldProps]
    }
    
    @scala.inline
    implicit class RcFieldPropsMutableBuilder[Self <: RcFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      @scala.inline
      def setGetValueProps(value: /* value */ StoreValue => js.Object): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      @scala.inline
      def setInitialValue(value: js.Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      @scala.inline
      def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      @scala.inline
      def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      @scala.inline
      def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setShouldUpdate(value: ShouldUpdate[_]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateFunction3(value: (_, _, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      @scala.inline
      def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      @scala.inline
      def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value :_*))
      
      @scala.inline
      def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
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
