package typings.antd.anon

import typings.antd.cascaderMod.CascaderOptionType
import typings.antd.cascaderMod.CascaderProps
import typings.antd.cascaderMod.CascaderValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/cascader.CascaderState> */
trait PartialCascaderState extends StObject {
  
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.undefined
  
  var inputFocused: js.UndefOr[Boolean] = js.undefined
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  
  var prevProps: js.UndefOr[CascaderProps] = js.undefined
  
  var value: js.UndefOr[CascaderValueType] = js.undefined
}
object PartialCascaderState {
  
  inline def apply(): PartialCascaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCascaderState]
  }
  
  extension [Self <: PartialCascaderState](x: Self) {
    
    inline def setFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
    
    inline def setFlattenOptionsUndefined: Self = StObject.set(x, "flattenOptions", js.undefined)
    
    inline def setFlattenOptionsVarargs(value: js.Array[CascaderOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value :_*))
    
    inline def setInputFocused(value: Boolean): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
    
    inline def setInputFocusedUndefined: Self = StObject.set(x, "inputFocused", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
    
    inline def setPrevProps(value: CascaderProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    inline def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
