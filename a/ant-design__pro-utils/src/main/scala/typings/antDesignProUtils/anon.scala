package typings.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.typingMod.ProCoreActionType
import typings.antDesignProUtils.typingMod.ProFieldRequestData
import typings.antDesignProUtils.typingMod.ProSchemaComponentTypes
import typings.antDesignProUtils.typingMod.ProSchemaValueEnumMap
import typings.antDesignProUtils.typingMod.ProSchemaValueEnumObj
import typings.antd.tooltipMod.TooltipProps
import typings.antd.useFormMod.FormInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Constructor extends StObject {
    
    var constructor: js.Any
  }
  object Constructor {
    
    inline def apply(constructor: js.Any): Constructor = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataIndex[T, U] extends StObject {
    
    /**
      * @name 与实体映射的key
      * @description 支持一个数字，[a,b] 会转化为 obj.a.b
      */
    var dataIndex: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
    
    var fieldProps: js.UndefOr[js.Any] = js.undefined
    
    /**
      * @name 隐藏在 descriptions
      */
    var hideInDescriptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 确定这个列的唯一值
      */
    var key: js.UndefOr[ReactText] = js.undefined
    
    /**
      * @name 从服务器请求的参数，改变了会触发 reload
      */
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var render: js.UndefOr[
        js.Function5[
          /* dom */ ReactNode, 
          /* entity */ T, 
          /* index */ Double, 
          /* action */ ProCoreActionType, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * @name 自定义编辑模式
      * @description 返回一个node，会自动包裹 value 和 onChange
      */
    var renderFormItem: js.UndefOr[
        js.Function3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, 
          /* config */ DefaultRender, 
          /* form */ FormInstance[js.Any], 
          ReactNode
        ]
      ] = js.undefined
    
    /**
      * @name 自定义 render
      * @description 必须要返回 string
      */
    var renderText: js.UndefOr[
        js.Function4[
          /* text */ js.Any, 
          /* record */ T, 
          /* index */ Double, 
          /* action */ ProCoreActionType, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * @name 从服务器请求枚举
      */
    var request: js.UndefOr[
        ProFieldRequestData[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object, 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * @deprecated 你可以使用 tooltip，这个更改是为了与 antd 统一
      */
    var tip: js.UndefOr[String] = js.undefined
    
    /**
      * @name 标题
      * @description 支持 ReactNode 和 方法
      */
    var title: js.UndefOr[
        (js.Function3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
          /* type */ ProSchemaComponentTypes, 
          /* dom */ ReactNode, 
          ReactNode
        ]) | ReactNode
      ] = js.undefined
    
    /**
      *@name 展示一个 icon，hover 是展示一些提示信息
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * @name 映射值的类型
      */
    var valueEnum: js.UndefOr[ProSchemaValueEnumObj | ProSchemaValueEnumMap] = js.undefined
    
    /**
      * 选择如何渲染相应的模式
      */
    var valueType: js.UndefOr[(js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U] = js.undefined
  }
  object DataIndex {
    
    inline def apply[T, U](): DataIndex[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataIndex[T, U]]
    }
    
    extension [Self <: DataIndex[?, ?], T, U](x: Self & (DataIndex[T, U])) {
      
      inline def setDataIndex(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      inline def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      inline def setFieldProps(value: js.Any): Self = StObject.set(x, "fieldProps", value.asInstanceOf[js.Any])
      
      inline def setFieldPropsUndefined: Self = StObject.set(x, "fieldProps", js.undefined)
      
      inline def setHideInDescriptions(value: Boolean): Self = StObject.set(x, "hideInDescriptions", value.asInstanceOf[js.Any])
      
      inline def setHideInDescriptionsUndefined: Self = StObject.set(x, "hideInDescriptions", js.undefined)
      
      inline def setKey(value: ReactText): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRender(
        value: (/* dom */ ReactNode, /* entity */ T, /* index */ Double, /* action */ ProCoreActionType, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object) => ReactNode
      ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
      
      inline def setRenderFormItem(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, /* config */ DefaultRender, /* form */ FormInstance[js.Any]) => ReactNode
      ): Self = StObject.set(x, "renderFormItem", js.Any.fromFunction3(value))
      
      inline def setRenderFormItemUndefined: Self = StObject.set(x, "renderFormItem", js.undefined)
      
      inline def setRenderText(
        value: (/* text */ js.Any, /* record */ T, /* index */ Double, /* action */ ProCoreActionType) => js.Any
      ): Self = StObject.set(x, "renderText", js.Any.fromFunction4(value))
      
      inline def setRenderTextUndefined: Self = StObject.set(x, "renderText", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRequest(
        value: (js.Any, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object) => js.Promise[js.Array[Dictkey]]
      ): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setTitle(
        value: (js.Function3[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
              /* type */ ProSchemaComponentTypes, 
              /* dom */ ReactNode, 
              ReactNode
            ]) | ReactNode
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction3(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, /* type */ ProSchemaComponentTypes, /* dom */ ReactNode) => ReactNode
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValueEnum(value: ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = StObject.set(x, "valueEnum", value.asInstanceOf[js.Any])
      
      inline def setValueEnumUndefined: Self = StObject.set(x, "valueEnum", js.undefined)
      
      inline def setValueType(value: (js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeFunction2(value: (/* entity */ T, /* type */ ProSchemaComponentTypes) => U): Self = StObject.set(x, "valueType", js.Any.fromFunction2(value))
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  trait DefaultRender extends StObject {
    
    def defaultRender(
      newItem: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object
    ): Element | Null
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var `type`: ProSchemaComponentTypes
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object DefaultRender {
    
    inline def apply(
      defaultRender: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => Element | Null
    ): DefaultRender = {
      val __obj = js.Dynamic.literal(defaultRender = js.Any.fromFunction1(defaultRender))
      __obj.asInstanceOf[DefaultRender]
    }
    
    extension [Self <: DefaultRender](x: Self) {
      
      inline def setDefaultRender(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => Element | Null
      ): Self = StObject.set(x, "defaultRender", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSelect(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setType(value: ProSchemaComponentTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var label: ReactNode
    
    var value: ReactText
  }
  object Dictkey {
    
    inline def apply(value: ReactText): Dictkey = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var pageName: String
    
    var title: String
  }
  object Id {
    
    inline def apply(id: String, pageName: String, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var label: ReactNode
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    var tooltip: js.UndefOr[String | TooltipProps] = js.undefined
  }
  object Label {
    
    inline def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTooltip(value: String | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
