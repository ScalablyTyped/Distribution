package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/input/Input.InputState> */
@js.native
trait PartialInputState extends StObject {
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var prevValue: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object PartialInputState {
  
  @scala.inline
  def apply(): PartialInputState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInputState]
  }
  
  @scala.inline
  implicit class PartialInputStateMutableBuilder[Self <: PartialInputState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    @scala.inline
    def setPrevValue(value: js.Any): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
