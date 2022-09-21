package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsBooleans.`true`
import typings.antd.useFormMod.FormInstance
import typings.rcFieldForm.interfaceMod.NamePath
import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-utils.@ant-design/pro-utils/es/components/ProFormContext.ProFormInstanceType<any> & {  formRef :react.react.MutableRefObject<antd.antd.FormInstance<any>> | undefined} */
trait ProFormInstanceTypeanyfor extends StObject {
  
  var formRef: js.UndefOr[MutableRefObject[FormInstance[Any]]] = js.undefined
  
  /**
    * 获取被 ProForm 格式化后的单个数据
    * @param nameList (string|number)[]
    * @returns T
    *
    * @example {a:{b:value}} -> getFieldFormatValue(['a', 'b']) -> value
    */
  var getFieldFormatValue: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[NamePath], Any]] = js.undefined
  
  /**
    * 获取被 ProForm 格式化后的单个数据, 包含他的 name
    * @param nameList (string|number)[]
    * @returns T
    *
    * @example  {a:{b:value}} -> getFieldFormatValueObject(['a', 'b']) -> {a:{b:value}}
    */
  var getFieldFormatValueObject: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[NamePath], Any]] = js.undefined
  
  /**
    * 获取被 ProForm 格式化后的所有数据
    * @param nameList boolean
    * @returns T
    *
    * @example  getFieldsFormatValue() ->返回所有数据
    * @example  getFieldsFormatValue(true) ->返回所有数据，即使没有被 form 托管的
    */
  var getFieldsFormatValue: js.UndefOr[
    js.Function2[/* nameList */ js.UndefOr[`true`], /* omitNil */ js.UndefOr[Boolean], Any]
  ] = js.undefined
  
  /**
    *验字段后返回格式化之后的所有数据
    * @param nameList (string|number)[]
    * @returns T
    *
    * @example validateFieldsReturnFormatValue -> {a:{b:value}}
    */
  var validateFieldsReturnFormatValue: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Promise[Any]]] = js.undefined
}
object ProFormInstanceTypeanyfor {
  
  inline def apply(): ProFormInstanceTypeanyfor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProFormInstanceTypeanyfor]
  }
  
  extension [Self <: ProFormInstanceTypeanyfor](x: Self) {
    
    inline def setFormRef(value: MutableRefObject[FormInstance[Any]]): Self = StObject.set(x, "formRef", value.asInstanceOf[js.Any])
    
    inline def setFormRefUndefined: Self = StObject.set(x, "formRef", js.undefined)
    
    inline def setGetFieldFormatValue(value: /* nameList */ js.UndefOr[NamePath] => Any): Self = StObject.set(x, "getFieldFormatValue", js.Any.fromFunction1(value))
    
    inline def setGetFieldFormatValueObject(value: /* nameList */ js.UndefOr[NamePath] => Any): Self = StObject.set(x, "getFieldFormatValueObject", js.Any.fromFunction1(value))
    
    inline def setGetFieldFormatValueObjectUndefined: Self = StObject.set(x, "getFieldFormatValueObject", js.undefined)
    
    inline def setGetFieldFormatValueUndefined: Self = StObject.set(x, "getFieldFormatValue", js.undefined)
    
    inline def setGetFieldsFormatValue(value: (/* nameList */ js.UndefOr[`true`], /* omitNil */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "getFieldsFormatValue", js.Any.fromFunction2(value))
    
    inline def setGetFieldsFormatValueUndefined: Self = StObject.set(x, "getFieldsFormatValue", js.undefined)
    
    inline def setValidateFieldsReturnFormatValue(value: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Promise[Any]): Self = StObject.set(x, "validateFieldsReturnFormatValue", js.Any.fromFunction1(value))
    
    inline def setValidateFieldsReturnFormatValueUndefined: Self = StObject.set(x, "validateFieldsReturnFormatValue", js.undefined)
  }
}
