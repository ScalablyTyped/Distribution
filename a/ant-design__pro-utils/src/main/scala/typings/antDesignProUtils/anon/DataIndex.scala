package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProUtils.typingMod.ProCoreActionType
import typings.antDesignProUtils.typingMod.ProFieldRequestData
import typings.antDesignProUtils.typingMod.ProSchemaComponentTypes
import typings.antDesignProUtils.typingMod.ProSchemaValueEnumMap
import typings.antDesignProUtils.typingMod.ProSchemaValueEnumObj
import typings.antd.useFormMod.FormInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataIndex[T, U] extends js.Object {
  
  /**
    * @name 与实体映射的key
    * @description 支持一个数字，[a,b] 会转化为 obj.a.b
    */
  var dataIndex: js.UndefOr[String | Double | (js.Array[String | Double])] = js.native
  
  var fieldProps: js.UndefOr[js.Any] = js.native
  
  /**
    * @name 隐藏在 descriptions
    */
  var hideInDescriptions: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 确定这个列的唯一值
    */
  var key: js.UndefOr[ReactText] = js.native
  
  /**
    * @name 从服务器请求的参数，改变了会触发 reload
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var render: js.UndefOr[
    js.Function5[
      /* dom */ ReactNode, 
      /* entity */ T, 
      /* index */ Double, 
      /* action */ ProCoreActionType, 
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
      ReactNode
    ]
  ] = js.native
  
  /**
    * @name 自定义编辑模式
    * @description 返回一个node，会自动包裹 value 和 onChange
    */
  var renderFormItem: js.UndefOr[
    js.Function3[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, 
      /* config */ DefaultRender, 
      /* form */ FormInstance[_], 
      ReactNode
    ]
  ] = js.native
  
  /**
    * @name 自定义 render
    * @description 必须要返回 string
    */
  var renderText: js.UndefOr[
    js.Function4[/* text */ js.Any, /* record */ T, /* index */ Double, /* action */ ProCoreActionType, _]
  ] = js.native
  
  /**
    * @name 从服务器请求枚举
    */
  var request: js.UndefOr[
    ProFieldRequestData[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object, 
      _
    ]
  ] = js.native
  
  /**
    * @deprecated 你可以使用 tooltip，这个更改是为了与 antd 统一
    */
  var tip: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  /**
    *@name 展示一个 icon，hover 是展示一些提示信息
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * @name 映射值的类型
    */
  var valueEnum: js.UndefOr[ProSchemaValueEnumObj | ProSchemaValueEnumMap] = js.native
  
  /**
    * 选择如何渲染相应的模式
    */
  var valueType: js.UndefOr[(js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U] = js.native
}
object DataIndex {
  
  @scala.inline
  def apply[T, U](): DataIndex[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataIndex[T, U]]
  }
  
  @scala.inline
  implicit class DataIndexOps[Self <: DataIndex[_, _], T, U] (val x: Self with (DataIndex[T, U])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataIndexVarargs(value: (String | Double)*): Self = this.set("dataIndex", js.Array(value :_*))
    
    @scala.inline
    def setDataIndex(value: String | Double | (js.Array[String | Double])): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    
    @scala.inline
    def setFieldProps(value: js.Any): Self = this.set("fieldProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldProps: Self = this.set("fieldProps", js.undefined)
    
    @scala.inline
    def setHideInDescriptions(value: Boolean): Self = this.set("hideInDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInDescriptions: Self = this.set("hideInDescriptions", js.undefined)
    
    @scala.inline
    def setKey(value: ReactText): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* dom */ ReactNode, /* entity */ T, /* index */ Double, /* action */ ProCoreActionType, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object) => ReactNode
    ): Self = this.set("render", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRenderFormItem(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* item */ js.Object, /* config */ DefaultRender, /* form */ FormInstance[_]) => ReactNode
    ): Self = this.set("renderFormItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderFormItem: Self = this.set("renderFormItem", js.undefined)
    
    @scala.inline
    def setRenderText(
      value: (/* text */ js.Any, /* record */ T, /* index */ Double, /* action */ ProCoreActionType) => _
    ): Self = this.set("renderText", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteRenderText: Self = this.set("renderText", js.undefined)
    
    @scala.inline
    def setRequest(
      value: (_, /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<unknown, string, unknown> */ js.Object) => js.Promise[js.Array[Dictkey]]
    ): Self = this.set("request", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setTip(value: String): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    
    @scala.inline
    def setTitleFunction3(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, /* type */ ProSchemaComponentTypes, /* dom */ ReactNode) => ReactNode
    ): Self = this.set("title", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitle(
      value: (js.Function3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ /* schema */ js.Object, 
          /* type */ ProSchemaComponentTypes, 
          /* dom */ ReactNode, 
          ReactNode
        ]) | ReactNode
    ): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValueEnum(value: ProSchemaValueEnumObj | ProSchemaValueEnumMap): Self = this.set("valueEnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueEnum: Self = this.set("valueEnum", js.undefined)
    
    @scala.inline
    def setValueTypeFunction2(value: (/* entity */ T, /* type */ ProSchemaComponentTypes) => U): Self = this.set("valueType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueType(value: (js.Function2[/* entity */ T, /* type */ ProSchemaComponentTypes, U]) | U): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
