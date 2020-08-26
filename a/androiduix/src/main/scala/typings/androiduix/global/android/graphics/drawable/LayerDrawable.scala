package typings.androiduix.global.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
class LayerDrawable protected ()
  extends typings.androiduix.android.graphics.drawable.LayerDrawable {
  def this(layers: js.Array[typings.androiduix.android.graphics.drawable.Drawable]) = this()
  def this(layers: js.Array[typings.androiduix.android.graphics.drawable.Drawable], state: LayerState) = this()
}

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
object LayerDrawable extends js.Object {
  @js.native
  class ChildDrawable ()
    extends typings.androiduix.android.graphics.drawable.LayerDrawable.ChildDrawable
  
  @js.native
  class LayerState protected ()
    extends typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState {
    def this(
      orig: typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState,
      owner: typings.androiduix.android.graphics.drawable.LayerDrawable
    ) = this()
  }
  
}

