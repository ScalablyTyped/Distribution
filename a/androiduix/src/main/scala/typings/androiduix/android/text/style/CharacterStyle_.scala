package typings.androiduix.android.text.style

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterStyle_ extends js.Object {
  var mType: js.Symbol = js.native
  def getUnderlying(): CharacterStyle = js.native
  def updateDrawState(tp: TextPaint): Unit = js.native
}

object CharacterStyle_ {
  @scala.inline
  def apply(getUnderlying: () => CharacterStyle, mType: js.Symbol, updateDrawState: TextPaint => Unit): CharacterStyle_ = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState))
    __obj.asInstanceOf[CharacterStyle_]
  }
  @scala.inline
  implicit class CharacterStyle_Ops[Self <: CharacterStyle_] (val x: Self) extends AnyVal {
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
    def setGetUnderlying(value: () => CharacterStyle): Self = this.set("getUnderlying", js.Any.fromFunction0(value))
    @scala.inline
    def setMType(value: js.Symbol): Self = this.set("mType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDrawState(value: TextPaint => Unit): Self = this.set("updateDrawState", js.Any.fromFunction1(value))
  }
  
}

