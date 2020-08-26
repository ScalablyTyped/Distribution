package typings.androiduix.global.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
class ClipDrawable ()
  extends typings.androiduix.android.graphics.drawable.ClipDrawable {
  def this(state: ClipState) = this()
  def this(
    drawable: typings.androiduix.android.graphics.drawable.Drawable,
    gravity: Double,
    orientation: Double
  ) = this()
}

/* static members */
@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
object ClipDrawable extends js.Object {
  @js.native
  class ClipState protected ()
    extends typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState {
    def this(
      orig: typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState,
      owner: typings.androiduix.android.graphics.drawable.ClipDrawable
    ) = this()
  }
  
  var HORIZONTAL: Double = js.native
  var VERTICAL: Double = js.native
}

