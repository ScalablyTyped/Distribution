package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.parallel
import typings.antd.formContextMod.ReportMetaChange
import typings.antd.formFormMod.RequiredMark
import typings.antd.formInterfaceMod.FormLabelAlign
import typings.antd.formItemLabelMod.LabelTooltipType
import typings.antd.formItemMod.ValidateStatus
import typings.antd.gridColMod.ColProps
import typings.rcFieldForm.anon.Metadestroybooleanundefin
import typings.rcFieldForm.anon.Source
import typings.rcFieldForm.fieldMod.ShouldUpdate
import typings.rcFieldForm.interfaceMod.EventArgs
import typings.rcFieldForm.interfaceMod.Meta
import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemHolderMod {
  
  @JSImport("antd/lib/form/FormItem/ItemHolder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ItemHolderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent antd.antd/lib/form/FormItem.FormItemProps<any> */
  trait ItemHolderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
    
    var errors: js.Array[ReactNode]
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var fieldId: js.UndefOr[String] = js.undefined
    
    /** @deprecated No need anymore */
    var fieldKey: js.UndefOr[Key | js.Array[Key]] = js.undefined
    
    var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.undefined
    
    var getValueProps: js.UndefOr[js.Function1[/* value */ StoreValue, Record[String, Any]]] = js.undefined
    
    var hasFeedback: js.UndefOr[Boolean] = js.undefined
    
    var help: js.UndefOr[ReactNode] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialValue: js.UndefOr[Any] = js.undefined
    
    var isList: js.UndefOr[Boolean] = js.undefined
    
    var isListField: js.UndefOr[Boolean] = js.undefined
    
    var isRequired: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
    
    var labelCol: js.UndefOr[ColProps] = js.undefined
    
    var messageVariables: js.UndefOr[Record[String, String]] = js.undefined
    
    var meta: Meta
    
    var name: js.UndefOr[NamePath] = js.undefined
    
    var noStyle: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[
        js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
      ] = js.undefined
    
    var onMetaChange: js.UndefOr[js.Function1[/* meta */ Metadestroybooleanundefin, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSubItemMetaChange: ReportMetaChange
    
    var prefixCls: String
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var requiredMark: js.UndefOr[RequiredMark] = js.undefined
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var shouldUpdate: js.UndefOr[ShouldUpdate[Any]] = js.undefined
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltip: js.UndefOr[LabelTooltipType] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var validateFirst: js.UndefOr[Boolean | parallel] = js.undefined
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
    
    var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
    
    var valuePropName: js.UndefOr[String] = js.undefined
    
    var warnings: js.Array[ReactNode]
    
    var wrapperCol: js.UndefOr[ColProps] = js.undefined
  }
  object ItemHolderProps {
    
    inline def apply(
      errors: js.Array[ReactNode],
      meta: Meta,
      onSubItemMetaChange: (/* meta */ Meta, /* uniqueKeys */ js.Array[Key]) => Unit,
      prefixCls: String,
      warnings: js.Array[ReactNode]
    ): ItemHolderProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], onSubItemMetaChange = js.Any.fromFunction2(onSubItemMetaChange), prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHolderProps]
    }
    
    extension [Self <: ItemHolderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setErrors(value: js.Array[ReactNode]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ReactNode*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setFieldKey(value: Key | js.Array[Key]): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      inline def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      inline def setFieldKeyVarargs(value: Key*): Self = StObject.set(x, "fieldKey", js.Array(value*))
      
      inline def setGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = StObject.set(x, "getValueFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetValueFromEventUndefined: Self = StObject.set(x, "getValueFromEvent", js.undefined)
      
      inline def setGetValueProps(value: /* value */ StoreValue => Record[String, Any]): Self = StObject.set(x, "getValueProps", js.Any.fromFunction1(value))
      
      inline def setGetValuePropsUndefined: Self = StObject.set(x, "getValueProps", js.undefined)
      
      inline def setHasFeedback(value: Boolean): Self = StObject.set(x, "hasFeedback", value.asInstanceOf[js.Any])
      
      inline def setHasFeedbackUndefined: Self = StObject.set(x, "hasFeedback", js.undefined)
      
      inline def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialValue(value: Any): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
      
      inline def setIsListField(value: Boolean): Self = StObject.set(x, "isListField", value.asInstanceOf[js.Any])
      
      inline def setIsListFieldUndefined: Self = StObject.set(x, "isListField", js.undefined)
      
      inline def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      inline def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMessageVariables(value: Record[String, String]): Self = StObject.set(x, "messageVariables", value.asInstanceOf[js.Any])
      
      inline def setMessageVariablesUndefined: Self = StObject.set(x, "messageVariables", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      inline def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      inline def setNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = StObject.set(x, "normalize", js.Any.fromFunction3(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOnMetaChange(value: /* meta */ Metadestroybooleanundefin => Unit): Self = StObject.set(x, "onMetaChange", js.Any.fromFunction1(value))
      
      inline def setOnMetaChangeUndefined: Self = StObject.set(x, "onMetaChange", js.undefined)
      
      inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubItemMetaChange(value: (/* meta */ Meta, /* uniqueKeys */ js.Array[Key]) => Unit): Self = StObject.set(x, "onSubItemMetaChange", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setShouldUpdate(value: ShouldUpdate[Any]): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
      
      inline def setShouldUpdateFunction3(value: (Any, Any, /* info */ Source) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction3(value))
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: LabelTooltipType): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setValidateFirst(value: Boolean | parallel): Self = StObject.set(x, "validateFirst", value.asInstanceOf[js.Any])
      
      inline def setValidateFirstUndefined: Self = StObject.set(x, "validateFirst", js.undefined)
      
      inline def setValidateStatus(value: ValidateStatus): Self = StObject.set(x, "validateStatus", value.asInstanceOf[js.Any])
      
      inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      inline def setValidateTrigger(value: String | js.Array[String] | `false`): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
      
      inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
      
      inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value*))
      
      inline def setValuePropName(value: String): Self = StObject.set(x, "valuePropName", value.asInstanceOf[js.Any])
      
      inline def setValuePropNameUndefined: Self = StObject.set(x, "valuePropName", js.undefined)
      
      inline def setWarnings(value: js.Array[ReactNode]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: ReactNode*): Self = StObject.set(x, "warnings", js.Array(value*))
      
      inline def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      inline def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
}
