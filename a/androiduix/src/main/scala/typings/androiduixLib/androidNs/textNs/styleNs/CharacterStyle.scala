package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.CharacterStyle")
@js.native
abstract class CharacterStyle () extends js.Object {
  var mType: js.Symbol = js.native
  def getUnderlying(): CharacterStyle = js.native
  def updateDrawState(tp: androiduixLib.androidNs.textNs.TextPaint): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.text.style.CharacterStyle")
@js.native
object CharacterStyle extends js.Object {
  var `type`: js.Symbol = js.native
  def wrap(cs: androiduixLib.androidNs.textNs.styleNs.CharacterStyle): androiduixLib.androidNs.textNs.styleNs.CharacterStyle = js.native
}

