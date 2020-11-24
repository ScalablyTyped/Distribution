package typings.androiduix.global.android.graphics.drawable

import typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.graphics.drawable.AnimationDrawable")
@js.native
class AnimationDrawable ()
  extends typings.androiduix.android.graphics.drawable.AnimationDrawable {
  def this(state: AnimationState) = this()
}
@JSGlobal("android.graphics.drawable.AnimationDrawable")
@js.native
object AnimationDrawable extends js.Object {
  
  @js.native
  class AnimationState protected ()
    extends typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState {
    def this(
      orig: typings.androiduix.android.graphics.drawable.AnimationDrawable.AnimationState,
      owner: typings.androiduix.android.graphics.drawable.AnimationDrawable
    ) = this()
  }
}
