package typings.androiduix.androidNs.graphicsNs.drawableNs.AnimationDrawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.AnimationDrawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableContainerNs.DrawableContainerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.AnimationDrawable.AnimationState")
@js.native
class AnimationState protected () extends DrawableContainerState {
  def this(orig: AnimationState, owner: AnimationDrawable) = this()
  var mDurations: js.Any = js.native
  var mOneShot: js.Any = js.native
  def addFrame(dr: Drawable, dur: Double): Unit = js.native
}

