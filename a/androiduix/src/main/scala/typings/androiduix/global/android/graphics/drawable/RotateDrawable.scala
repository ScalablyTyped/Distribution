package typings.androiduix.global.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
class RotateDrawable ()
  extends typings.androiduix.android.graphics.drawable.RotateDrawable {
  def this(rotateState: RotateState) = this()
}

/* static members */
@JSGlobal("android.graphics.drawable.RotateDrawable")
@js.native
object RotateDrawable extends js.Object {
  @js.native
  class RotateState protected ()
    extends typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState {
    def this(
      source: typings.androiduix.android.graphics.drawable.RotateDrawable.RotateState,
      owner: typings.androiduix.android.graphics.drawable.RotateDrawable
    ) = this()
  }
  
  var MAX_LEVEL: js.Any = js.native
}

