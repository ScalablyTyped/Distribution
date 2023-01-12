package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOption extends StObject {
  
  /**
    * @title 回调函数。
    */
  val callback: js.UndefOr[js.Function1[/* repeated */ Any, LooseObject]] = js.undefined
  
  /**
    * @title 图形样式配置。
    */
  val cfg: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title 映射的字段。
    */
  val fields: js.UndefOr[js.Array[String]] = js.undefined
}
object StyleOption {
  
  inline def apply(): StyleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleOption] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* repeated */ Any => LooseObject): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCfg(value: LooseObject): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
