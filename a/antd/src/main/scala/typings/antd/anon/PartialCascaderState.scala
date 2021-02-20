package typings.antd.anon

import typings.antd.cascaderMod.CascaderOptionType
import typings.antd.cascaderMod.CascaderProps
import typings.antd.cascaderMod.CascaderValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/cascader.CascaderState> */
@js.native
trait PartialCascaderState extends StObject {
  
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.native
  
  var inputFocused: js.UndefOr[Boolean] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  var popupVisible: js.UndefOr[Boolean] = js.native
  
  var prevProps: js.UndefOr[CascaderProps] = js.native
  
  var value: js.UndefOr[CascaderValueType] = js.native
}
object PartialCascaderState {
  
  @scala.inline
  def apply(): PartialCascaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCascaderState]
  }
  
  @scala.inline
  implicit class PartialCascaderStateMutableBuilder[Self <: PartialCascaderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlattenOptions(value: js.Array[js.Array[CascaderOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenOptionsUndefined: Self = StObject.set(x, "flattenOptions", js.undefined)
    
    @scala.inline
    def setFlattenOptionsVarargs(value: js.Array[CascaderOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value :_*))
    
    @scala.inline
    def setInputFocused(value: Boolean): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFocusedUndefined: Self = StObject.set(x, "inputFocused", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
    
    @scala.inline
    def setPrevProps(value: CascaderProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    @scala.inline
    def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
