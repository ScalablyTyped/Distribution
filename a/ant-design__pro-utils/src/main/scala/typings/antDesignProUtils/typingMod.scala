package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.anon.ClearSelected
import typings.antDesignProUtils.anon.DataIndex
import typings.antDesignProUtils.anon.OmitRequestOptionsTypechi
import typings.antDesignProUtils.anon.PartialInputProps
import typings.antDesignProUtils.antDesignProUtilsStrings.actionRender
import typings.antDesignProUtils.antDesignProUtilsStrings.active
import typings.antDesignProUtils.antDesignProUtilsStrings.edit
import typings.antDesignProUtils.antDesignProUtilsStrings.editableKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.exception
import typings.antDesignProUtils.antDesignProUtilsStrings.image
import typings.antDesignProUtils.antDesignProUtilsStrings.money
import typings.antDesignProUtils.antDesignProUtilsStrings.newLineRecord
import typings.antDesignProUtils.antDesignProUtilsStrings.normal
import typings.antDesignProUtils.antDesignProUtilsStrings.optGroup
import typings.antDesignProUtils.antDesignProUtilsStrings.option
import typings.antDesignProUtils.antDesignProUtilsStrings.percent
import typings.antDesignProUtils.antDesignProUtilsStrings.progress
import typings.antDesignProUtils.antDesignProUtilsStrings.read
import typings.antDesignProUtils.antDesignProUtilsStrings.setEditableRowKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.success
import typings.antDesignProUtils.typesMod.ProFieldValueType
import typings.antDesignProUtils.typesMod.ValueTypeWithFieldProps
import typings.antDesignProUtils.useEditableArrayMod.UseEditableUtilType
import typings.rcFieldForm.interfaceMod.NamePath
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.std.Map
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingMod {
  
  trait PageInfo extends StObject {
    
    var current: Double
    
    var pageSize: Double
    
    var total: Double
  }
  object PageInfo {
    
    inline def apply(current: Double, pageSize: Double, total: Double): PageInfo = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    extension [Self <: PageInfo](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type ProCoreActionType[T] = ClearSelected & (Omit[
    UseEditableUtilType, 
    newLineRecord | editableKeys | actionRender | setEditableRowKeys
  ]) & T
  
  trait ProFieldProps extends StObject {
    
    var emptyText: js.UndefOr[ReactNode] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[read | edit] = js.undefined
    
    /** 这个属性可以设置useSwr的key */
    var proFieldKey: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[Any] = js.undefined
  }
  object ProFieldProps {
    
    inline def apply(): ProFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProFieldProps]
    }
    
    extension [Self <: ProFieldProps](x: Self) {
      
      inline def setEmptyText(value: ReactNode): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setMode(value: read | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setProFieldKey(value: String): Self = StObject.set(x, "proFieldKey", value.asInstanceOf[js.Any])
      
      inline def setProFieldKeyUndefined: Self = StObject.set(x, "proFieldKey", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type ProFieldRequestData[U] = js.Function2[/* params */ U, /* props */ Any, js.Promise[js.Array[RequestOptionsType]]]
  
  type ProFieldTextType = ReactNode | (js.Array[ReactNode | (Record[String, Any])]) | (Record[String, Any])
  
  type ProFieldValueEnumType = ProSchemaValueEnumMap | ProSchemaValueEnumObj
  
  trait ProFieldValueObjectType extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var moneySymbol: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var request: js.UndefOr[ProFieldRequestData[Any]] = js.undefined
    
    var showColor: js.UndefOr[Boolean] = js.undefined
    
    /** Percent */
    var showSymbol: js.UndefOr[(js.Function1[/* value */ Any, Boolean]) | Boolean] = js.undefined
    
    var status: js.UndefOr[normal | active | success | exception] = js.undefined
    
    var `type`: progress | money | percent | image
    
    /** Image */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ProFieldValueObjectType {
    
    inline def apply(`type`: progress | money | percent | image): ProFieldValueObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProFieldValueObjectType]
    }
    
    extension [Self <: ProFieldValueObjectType](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMoneySymbol(value: Boolean): Self = StObject.set(x, "moneySymbol", value.asInstanceOf[js.Any])
      
      inline def setMoneySymbolUndefined: Self = StObject.set(x, "moneySymbol", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRequest(value: (Any, /* props */ Any) => js.Promise[js.Array[RequestOptionsType]]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setShowColor(value: Boolean): Self = StObject.set(x, "showColor", value.asInstanceOf[js.Any])
      
      inline def setShowColorUndefined: Self = StObject.set(x, "showColor", js.undefined)
      
      inline def setShowSymbol(value: (js.Function1[/* value */ Any, Boolean]) | Boolean): Self = StObject.set(x, "showSymbol", value.asInstanceOf[js.Any])
      
      inline def setShowSymbolFunction1(value: /* value */ Any => Boolean): Self = StObject.set(x, "showSymbol", js.Any.fromFunction1(value))
      
      inline def setShowSymbolUndefined: Self = StObject.set(x, "showSymbol", js.undefined)
      
      inline def setStatus(value: normal | active | success | exception): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: progress | money | percent | image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ProSchema[Entity, ExtraProps, ComponentsType, ValueType, ExtraFormItemProps] = (DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType]) & ExtraProps & (ValueTypeWithFieldProps[Entity, ComponentsType, ExtraProps, ValueType])
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignProUtils.antDesignProUtilsStrings.form
    - typings.antDesignProUtils.antDesignProUtilsStrings.list
    - typings.antDesignProUtils.antDesignProUtilsStrings.descriptions
    - typings.antDesignProUtils.antDesignProUtilsStrings.table
    - typings.antDesignProUtils.antDesignProUtilsStrings.cardList
    - scala.Unit
  */
  type ProSchemaComponentTypes = js.UndefOr[_ProSchemaComponentTypes]
  
  type ProSchemaFieldProps[T] = (Record[String, Any]) | T | PartialInputProps
  
  type ProSchemaValueEnumMap = Map[ReactText, ProSchemaValueEnumType | ReactNode]
  
  type ProSchemaValueEnumObj = Record[String, ProSchemaValueEnumType | ReactNode]
  
  trait ProSchemaValueEnumType extends StObject {
    
    /** @name 自定义的颜色 */
    var color: js.UndefOr[String] = js.undefined
    
    /** @name 是否禁用 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** @name 预定的颜色 */
    var status: js.UndefOr[String] = js.undefined
    
    /** @name 演示的文案 */
    var text: ReactNode
  }
  object ProSchemaValueEnumType {
    
    inline def apply(): ProSchemaValueEnumType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProSchemaValueEnumType]
    }
    
    extension [Self <: ProSchemaValueEnumType](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ProSchemaValueType[ValueType] = ValueType | ProFieldValueType | ProFieldValueObjectType
  
  type ProTableEditableFnType[T] = js.Function3[/* value */ Any, /* record */ T, /* index */ Double, Boolean]
  
  trait RequestOptionsType
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /** 渲染的节点类型 */
    var optionType: js.UndefOr[optGroup | option] = js.undefined
    
    var options: js.UndefOr[js.Array[OmitRequestOptionsTypechi]] = js.undefined
    
    var value: js.UndefOr[ReactText] = js.undefined
  }
  object RequestOptionsType {
    
    inline def apply(): RequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptionsType]
    }
    
    extension [Self <: RequestOptionsType](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOptionType(value: optGroup | option): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
      
      inline def setOptionTypeUndefined: Self = StObject.set(x, "optionType", js.undefined)
      
      inline def setOptions(value: js.Array[OmitRequestOptionsTypechi]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: OmitRequestOptionsTypechi*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SearchConvertKeyFn = js.Function2[/* value */ Any, /* field */ NamePath, String | (Record[String, Any])]
  
  type SearchTransformKeyFn = js.Function3[
    /* value */ Any, 
    /* namePath */ String, 
    /* allValues */ Any, 
    String | (Record[String, Any])
  ]
  
  trait _ProSchemaComponentTypes extends StObject
}
