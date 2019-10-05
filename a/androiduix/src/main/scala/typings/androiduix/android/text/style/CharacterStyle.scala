package typings.androiduix.android.text.style

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.CharacterStyle")
@js.native
abstract class CharacterStyle () extends js.Object {
  var mType: js.Symbol = js.native
  def getUnderlying(): CharacterStyle = js.native
  def updateDrawState(tp: TextPaint): Unit = js.native
}

/* static members */
@JSGlobal("android.text.style.CharacterStyle")
@js.native
object CharacterStyle extends js.Object {
  @js.native
  class Passthrough_CharacterStyle protected () extends CharacterStyle {
    def this(cs: CharacterStyle) = this()
    var mStyle: js.Any = js.native
  }
  
  var `type`: js.Symbol = js.native
  def wrap(cs: CharacterStyle): CharacterStyle = js.native
}

