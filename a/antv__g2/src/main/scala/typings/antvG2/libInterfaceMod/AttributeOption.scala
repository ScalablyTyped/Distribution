package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOption extends StObject {
  
  /**
    * @title 回调函数。
    */
  var callback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  /**
    * @title 映射的属性字段。
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @title 指定常量映射规则。
    */
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object AttributeOption {
  
  inline def apply(): AttributeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeOption]
  }
  
  extension [Self <: AttributeOption](x: Self) {
    
    inline def setCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
