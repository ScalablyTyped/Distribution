package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.textNs.TextPaint
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
  var `type`: js.Symbol = js.native
  def wrap(cs: CharacterStyle): CharacterStyle = js.native
}

