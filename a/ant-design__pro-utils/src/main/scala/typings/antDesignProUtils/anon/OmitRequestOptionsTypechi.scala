package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsStrings.children
import typings.antDesignProUtils.antDesignProUtilsStrings.optionType
import typings.antDesignProUtils.typingMod.RequestOptionsType
import typings.react.mod.ReactNode
import typings.react.mod.ReactText
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@ant-design/pro-utils.@ant-design/pro-utils/es/typing.RequestOptionsType, 'children' | 'optionType'> */
trait OmitRequestOptionsTypechi extends StObject {
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var options: js.UndefOr[js.Array[Omit[RequestOptionsType, children | optionType]]] = js.undefined
  
  var value: js.UndefOr[ReactText] = js.undefined
}
object OmitRequestOptionsTypechi {
  
  inline def apply(): OmitRequestOptionsTypechi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitRequestOptionsTypechi]
  }
  
  extension [Self <: OmitRequestOptionsTypechi](x: Self) {
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOptions(value: js.Array[Omit[RequestOptionsType, children | optionType]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: (Omit[RequestOptionsType, children | optionType])*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
