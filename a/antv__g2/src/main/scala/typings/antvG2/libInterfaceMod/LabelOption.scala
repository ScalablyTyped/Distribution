package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOption extends StObject {
  
  /**
    * @title 回调函数。
    */
  var callback: js.UndefOr[LabelCallback] = js.undefined
  
  var cfg: js.UndefOr[GeometryLabelCfg] = js.undefined
  
  /**
    * @title 映射的字段。
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}
object LabelOption {
  
  inline def apply(): LabelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOption]
  }
  
  extension [Self <: LabelOption](x: Self) {
    
    inline def setCallback(value: LabelCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCfg(value: GeometryLabelCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
