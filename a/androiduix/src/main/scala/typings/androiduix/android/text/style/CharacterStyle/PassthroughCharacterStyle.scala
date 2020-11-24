package typings.androiduix.android.text.style.CharacterStyle

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassthroughCharacterStyle
  extends typings.androiduix.android.text.style.CharacterStyle {
  
  var mStyle: js.Any = js.native
}
object PassthroughCharacterStyle {
  
  @scala.inline
  def apply(
    getUnderlying: () => typings.androiduix.android.text.style.CharacterStyle,
    mStyle: js.Any,
    mType: js.Symbol,
    updateDrawState: TextPaint => Unit
  ): PassthroughCharacterStyle = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mStyle = mStyle.asInstanceOf[js.Any], mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState))
    __obj.asInstanceOf[PassthroughCharacterStyle]
  }
  
  @scala.inline
  implicit class PassthroughCharacterStyleOps[Self <: PassthroughCharacterStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMStyle(value: js.Any): Self = this.set("mStyle", value.asInstanceOf[js.Any])
  }
}
