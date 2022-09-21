package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryTooltipOption extends StObject {
  
  /**
    * @title 回调函数。
    */
  val callback: js.UndefOr[js.Function1[/* repeated */ Any, LooseObject]] = js.undefined
  
  /**
    * @title 参与映射的字段。
    */
  val fields: js.Array[String]
}
object GeometryTooltipOption {
  
  inline def apply(fields: js.Array[String]): GeometryTooltipOption = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryTooltipOption]
  }
  
  extension [Self <: GeometryTooltipOption](x: Self) {
    
    inline def setCallback(value: /* repeated */ Any => LooseObject): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
