package typings.androiduix.global.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.Drawable")
@js.native
abstract class Drawable ()
  extends typings.androiduix.android.graphics.drawable.Drawable

/* static members */
@JSGlobal("android.graphics.drawable.Drawable")
@js.native
object Drawable extends js.Object {
  var ZERO_BOUNDS_RECT: js.Any = js.native
  def createFromXml(r: Resources, parser: HTMLElement): typings.androiduix.android.graphics.drawable.Drawable = js.native
  def resolveOpacity(op1: Double, op2: Double): Double = js.native
}

