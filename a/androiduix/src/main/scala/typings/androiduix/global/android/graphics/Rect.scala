package typings.androiduix.global.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Rect")
@js.native
class Rect ()
  extends typings.androiduix.android.graphics.Rect {
  def this(r: typings.androiduix.android.graphics.Rect) = this()
  def this(left: Double, top: Double, right: Double, bottom: Double) = this()
}

/* static members */
@JSGlobal("android.graphics.Rect")
@js.native
object Rect extends js.Object {
  def intersects(a: typings.androiduix.android.graphics.Rect, b: typings.androiduix.android.graphics.Rect): Boolean = js.native
  def unflattenFromString(str: String): typings.androiduix.android.graphics.Rect = js.native
}

