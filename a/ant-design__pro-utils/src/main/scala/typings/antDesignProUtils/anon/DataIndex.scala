package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.antDesignProUtils.antDesignProUtilsStrings.actionRender
import typings.antDesignProUtils.antDesignProUtilsStrings.editableKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.newLineRecord
import typings.antDesignProUtils.antDesignProUtilsStrings.setEditableRowKeys
import typings.antDesignProUtils.antDesignProUtilsStrings.text
import typings.antDesignProUtils.esTypingMod.ProCoreActionType
import typings.antDesignProUtils.esTypingMod.ProFieldProps
import typings.antDesignProUtils.esTypingMod.ProFieldRequestData
import typings.antDesignProUtils.esTypingMod.ProSchema
import typings.antDesignProUtils.esTypingMod.ProSchemaComponentTypes
import typings.antDesignProUtils.esTypingMod.ProSchemaValueEnumMap
import typings.antDesignProUtils.esTypingMod.ProSchemaValueEnumObj
import typings.antDesignProUtils.esTypingMod.ProTableEditableFnType
import typings.antDesignProUtils.esTypingMod.RequestOptionsType
import typings.antDesignProUtils.esUseEditableArrayMod.UseEditableUtilType
import typings.antd.libFormFormItemLabelMod.LabelTooltipType
import typings.antd.libFormFormItemMod.FormItemProps
import typings.antd.libFormHooksUseFormMod.FormInstance
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType] extends StObject {
  
  /**
    * 支持一个数字，[a,b] 会转化为 obj.a.b
    *
    * @name 与实体映射的key
    */
  var dataIndex: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
  
  /** @name request防抖动时间 默认10 单位ms */
  var debounceTime: js.UndefOr[Double] = js.undefined
  
  /** @name 依赖字段的name，暂时只在拥有 request 的项目中生效，会自动注入到 params 中 */
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  
  /**
    *  @name 可编辑表格是否可编辑
    *
    * @example 不允许编辑
    * editable=false
    *
    * @example 如果id=1不允许编辑
    * editable={(value,row,index)=> row.id !==1 }
    */
  var editable: js.UndefOr[`false` | ProTableEditableFnType[Entity]] = js.undefined
  
  /**
    * @name 自定义的 formItemProps
    */
  var formItemProps: js.UndefOr[
    (FormItemProps[Any] & ExtraFormItemProps) | (js.Function2[
      /* form */ FormInstance[Any], 
      /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowKey[ComponentsType, Entity]), 
      FormItemProps[Any] & ExtraFormItemProps
    ])
  ] = js.undefined
  
  /** @name 在 descriptions 隐藏 */
  var hideInDescriptions: js.UndefOr[Boolean] = js.undefined
  
  /** @name 在 Form 中隐藏 */
  var hideInForm: js.UndefOr[Boolean] = js.undefined
  
  /** @name 在 table的查询表单 中隐藏 */
  var hideInSearch: js.UndefOr[Boolean] = js.undefined
  
  /** @name 在 table 中隐藏 */
  var hideInTable: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  @name 忽略 FormItem，必须要和 renderFormItem 组件一起使用
    */
  var ignoreFormItem: js.UndefOr[Boolean] = js.undefined
  
  /** @name 确定这个列的唯一值,一般用于 dataIndex 重复的情况 */
  var key: js.UndefOr[Key] = js.undefined
  
  /** @name 从服务器请求的参数，改变了会触发 reload */
  var params: js.UndefOr[
    (js.Function2[
      /* record */ Entity, 
      /* column */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any], 
      Record[String, Any]
    ]) | (Record[String, Any])
  ] = js.undefined
  
  /** 设置到 ProField 上面的 Props，内部属性 */
  var proFieldProps: js.UndefOr[ProFieldProps & Any] = js.undefined
  
  /**
    * Render 方法只管理的只读模式，编辑模式需要使用 renderFormItem
    *
    * @name 自定义只读模式的dom
    */
  var render: js.UndefOr[
    js.Function5[
      /* dom */ ReactNode, 
      /* entity */ Entity, 
      /* index */ Double, 
      /* action */ js.UndefOr[ProCoreActionType[js.Object]], 
      /* schema */ (ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any]) & Type[ComponentsType], 
      ReactNode | Props
    ]
  ] = js.undefined
  
  /**
    * 返回一个 ReactNode，会自动包裹 value 和 onChange
    *
    * @name 自定义编辑模式
    */
  var renderFormItem: js.UndefOr[
    js.Function4[
      /* schema */ (ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any]) & OriginProps[ComponentsType], 
      /* config */ DefaultRender[ComponentsType, Entity, ExtraProps, ValueType], 
      /* form */ FormInstance[Any], 
      /* action */ js.UndefOr[
        Omit[
          UseEditableUtilType, 
          newLineRecord | editableKeys | actionRender | setEditableRowKeys
        ]
      ], 
      ReactNode
    ]
  ] = js.undefined
  
  /**
    * 修改的数据是会被 valueType 消费
    *
    * @name 自定义 render 内容
    */
  var renderText: js.UndefOr[
    js.Function4[
      /* text */ Any, 
      /* record */ Entity, 
      /* index */ Double, 
      /* action */ ProCoreActionType[js.Object], 
      Any
    ]
  ] = js.undefined
  
  /** @name 从服务器请求枚举 */
  var request: js.UndefOr[ProFieldRequestData[Any]] = js.undefined
  
  /** @deprecated 你可以使用 tooltip，这个更改是为了与 antd 统一 */
  var tip: js.UndefOr[String] = js.undefined
  
  /**
    * 支持 ReactNode 和 方法
    *
    * @name 标题
    */
  var title: js.UndefOr[
    (js.Function3[
      /* schema */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any], 
      /* type */ ComponentsType, 
      /* dom */ ReactNode, 
      ReactNode
    ]) | ReactNode
  ] = js.undefined
  
  /** @name 展示一个 icon，hover 是展示一些提示信息 */
  var tooltip: js.UndefOr[LabelTooltipType | String] = js.undefined
  
  /**
    * 支持 object 和Map，Map 是支持其他基础类型作为 key
    *
    * @name 映射值的类型
    */
  var valueEnum: js.UndefOr[
    (js.Function1[/* row */ Entity, ProSchemaValueEnumObj | ProSchemaValueEnumMap]) | ProSchemaValueEnumObj | ProSchemaValueEnumMap
  ] = js.undefined
}
object DataIndex {
  
  inline def apply[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType](): DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataIndex[?, ?, ?, ?, ?], Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType] (val x: Self & (DataIndex[Entity, ExtraProps, ComponentsType, ExtraFormItemProps, ValueType])) extends AnyVal {
    
    inline def setDataIndex(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value*))
    
    inline def setDebounceTime(value: Double): Self = StObject.set(x, "debounceTime", value.asInstanceOf[js.Any])
    
    inline def setDebounceTimeUndefined: Self = StObject.set(x, "debounceTime", js.undefined)
    
    inline def setDependencies(value: js.Array[NamePath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: NamePath*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setEditable(value: `false` | ProTableEditableFnType[Entity]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableFunction3(value: (/* value */ Any, Entity, /* index */ Double) => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction3(value))
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFormItemProps(
      value: (FormItemProps[Any] & ExtraFormItemProps) | (js.Function2[
          /* form */ FormInstance[Any], 
          /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowKey[ComponentsType, Entity]), 
          FormItemProps[Any] & ExtraFormItemProps
        ])
    ): Self = StObject.set(x, "formItemProps", value.asInstanceOf[js.Any])
    
    inline def setFormItemPropsFunction2(
      value: (/* form */ FormInstance[Any], /* config */ (ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) & (RowKey[ComponentsType, Entity])) => FormItemProps[Any] & ExtraFormItemProps
    ): Self = StObject.set(x, "formItemProps", js.Any.fromFunction2(value))
    
    inline def setFormItemPropsUndefined: Self = StObject.set(x, "formItemProps", js.undefined)
    
    inline def setHideInDescriptions(value: Boolean): Self = StObject.set(x, "hideInDescriptions", value.asInstanceOf[js.Any])
    
    inline def setHideInDescriptionsUndefined: Self = StObject.set(x, "hideInDescriptions", js.undefined)
    
    inline def setHideInForm(value: Boolean): Self = StObject.set(x, "hideInForm", value.asInstanceOf[js.Any])
    
    inline def setHideInFormUndefined: Self = StObject.set(x, "hideInForm", js.undefined)
    
    inline def setHideInSearch(value: Boolean): Self = StObject.set(x, "hideInSearch", value.asInstanceOf[js.Any])
    
    inline def setHideInSearchUndefined: Self = StObject.set(x, "hideInSearch", js.undefined)
    
    inline def setHideInTable(value: Boolean): Self = StObject.set(x, "hideInTable", value.asInstanceOf[js.Any])
    
    inline def setHideInTableUndefined: Self = StObject.set(x, "hideInTable", js.undefined)
    
    inline def setIgnoreFormItem(value: Boolean): Self = StObject.set(x, "ignoreFormItem", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFormItemUndefined: Self = StObject.set(x, "ignoreFormItem", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParams(
      value: (js.Function2[
          /* record */ Entity, 
          /* column */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any], 
          Record[String, Any]
        ]) | (Record[String, Any])
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsFunction2(
      value: (/* record */ Entity, /* column */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any]) => Record[String, Any]
    ): Self = StObject.set(x, "params", js.Any.fromFunction2(value))
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProFieldProps(value: ProFieldProps & Any): Self = StObject.set(x, "proFieldProps", value.asInstanceOf[js.Any])
    
    inline def setProFieldPropsUndefined: Self = StObject.set(x, "proFieldProps", js.undefined)
    
    inline def setRender(
      value: (/* dom */ ReactNode, /* entity */ Entity, /* index */ Double, /* action */ js.UndefOr[ProCoreActionType[js.Object]], /* schema */ (ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any]) & Type[ComponentsType]) => ReactNode | Props
    ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
    
    inline def setRenderFormItem(
      value: (/* schema */ (ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any]) & OriginProps[ComponentsType], /* config */ DefaultRender[ComponentsType, Entity, ExtraProps, ValueType], /* form */ FormInstance[Any], /* action */ js.UndefOr[
          Omit[
            UseEditableUtilType, 
            newLineRecord | editableKeys | actionRender | setEditableRowKeys
          ]
        ]) => ReactNode
    ): Self = StObject.set(x, "renderFormItem", js.Any.fromFunction4(value))
    
    inline def setRenderFormItemUndefined: Self = StObject.set(x, "renderFormItem", js.undefined)
    
    inline def setRenderText(
      value: (/* text */ Any, /* record */ Entity, /* index */ Double, /* action */ ProCoreActionType[js.Object]) => Any
    ): Self = StObject.set(x, "renderText", js.Any.fromFunction4(value))
    
    inline def setRenderTextUndefined: Self = StObject.set(x, "renderText", js.undefined)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRequest(value: (Any, /* props */ Any) => js.Promise[js.Array[RequestOptionsType]]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
    
    inline def setTitle(
      value: (js.Function3[
          /* schema */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any], 
          /* type */ ComponentsType, 
          /* dom */ ReactNode, 
          ReactNode
        ]) | ReactNode
    ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction3(
      value: (/* schema */ ProSchema[Entity, ExtraProps, ProSchemaComponentTypes, text, Any], /* type */ ComponentsType, /* dom */ ReactNode) => ReactNode
    ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: LabelTooltipType | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueEnum(
      value: (js.Function1[/* row */ Entity, ProSchemaValueEnumObj | ProSchemaValueEnumMap]) | ProSchemaValueEnumObj | ProSchemaValueEnumMap
    ): Self = StObject.set(x, "valueEnum", value.asInstanceOf[js.Any])
    
    inline def setValueEnumFunction1(value: /* row */ Entity => ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = StObject.set(x, "valueEnum", js.Any.fromFunction1(value))
    
    inline def setValueEnumUndefined: Self = StObject.set(x, "valueEnum", js.undefined)
  }
}
