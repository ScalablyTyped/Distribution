package typings.antDesignProUtils

import typings.antDesignProUtils.anon.ProFormInstanceTypeanyfor
import typings.antDesignProUtils.antDesignProUtilsBooleans.`true`
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsProFormContextMod {
  
  @JSImport("@ant-design/pro-utils/es/components/ProFormContext", "ProFormContext")
  @js.native
  val ProFormContext: Context[ProFormInstanceTypeanyfor] = js.native
  
  trait ProFormInstanceType[T] extends StObject {
    
    /**
      * 获取被 ProForm 格式化后的单个数据
      * @param nameList (string|number)[]
      * @returns T
      *
      * @example {a:{b:value}} -> getFieldFormatValue(['a', 'b']) -> value
      */
    var getFieldFormatValue: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[NamePath], T]] = js.undefined
    
    /**
      * 获取被 ProForm 格式化后的单个数据, 包含他的 name
      * @param nameList (string|number)[]
      * @returns T
      *
      * @example  {a:{b:value}} -> getFieldFormatValueObject(['a', 'b']) -> {a:{b:value}}
      */
    var getFieldFormatValueObject: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[NamePath], T]] = js.undefined
    
    /**
      * 获取被 ProForm 格式化后的所有数据
      * @param nameList boolean
      * @returns T
      *
      * @example  getFieldsFormatValue() ->返回所有数据
      * @example  getFieldsFormatValue(true) ->返回所有数据，即使没有被 form 托管的
      */
    var getFieldsFormatValue: js.UndefOr[
        js.Function2[/* nameList */ js.UndefOr[`true`], /* omitNil */ js.UndefOr[Boolean], T]
      ] = js.undefined
    
    /**
      *验字段后返回格式化之后的所有数据
      * @param nameList (string|number)[]
      * @returns T
      *
      * @example validateFieldsReturnFormatValue -> {a:{b:value}}
      */
    var validateFieldsReturnFormatValue: js.UndefOr[js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Promise[T]]] = js.undefined
  }
  object ProFormInstanceType {
    
    inline def apply[T](): ProFormInstanceType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProFormInstanceType[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProFormInstanceType[?], T] (val x: Self & ProFormInstanceType[T]) extends AnyVal {
      
      inline def setGetFieldFormatValue(value: /* nameList */ js.UndefOr[NamePath] => T): Self = StObject.set(x, "getFieldFormatValue", js.Any.fromFunction1(value))
      
      inline def setGetFieldFormatValueObject(value: /* nameList */ js.UndefOr[NamePath] => T): Self = StObject.set(x, "getFieldFormatValueObject", js.Any.fromFunction1(value))
      
      inline def setGetFieldFormatValueObjectUndefined: Self = StObject.set(x, "getFieldFormatValueObject", js.undefined)
      
      inline def setGetFieldFormatValueUndefined: Self = StObject.set(x, "getFieldFormatValue", js.undefined)
      
      inline def setGetFieldsFormatValue(value: (/* nameList */ js.UndefOr[`true`], /* omitNil */ js.UndefOr[Boolean]) => T): Self = StObject.set(x, "getFieldsFormatValue", js.Any.fromFunction2(value))
      
      inline def setGetFieldsFormatValueUndefined: Self = StObject.set(x, "getFieldsFormatValue", js.undefined)
      
      inline def setValidateFieldsReturnFormatValue(value: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Promise[T]): Self = StObject.set(x, "validateFieldsReturnFormatValue", js.Any.fromFunction1(value))
      
      inline def setValidateFieldsReturnFormatValueUndefined: Self = StObject.set(x, "validateFieldsReturnFormatValue", js.undefined)
    }
  }
}
