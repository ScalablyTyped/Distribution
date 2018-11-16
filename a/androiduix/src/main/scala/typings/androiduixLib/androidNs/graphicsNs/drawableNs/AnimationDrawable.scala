package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.AnimationDrawable")
@js.native
class AnimationDrawable ()
  extends DrawableContainer
     with androiduixLib.javaNs.langNs.Runnable
     with Animatable {
  def this(state: androiduixLib.androidNs.graphicsNs.drawableNs.AnimationDrawableNs.AnimationState) = this()
  var mAnimationState: js.Any = js.native
  var mCurFrame: js.Any = js.native
  def addFrame(frame: Drawable, duration: scala.Double): scala.Unit = js.native
  def getDuration(i: scala.Double): scala.Double = js.native
  def getFrame(index: scala.Double): Drawable = js.native
  def getNumberOfFrames(): scala.Double = js.native
  def isOneShot(): scala.Boolean = js.native
  /* CompleteClass */
  override def isRunning(): scala.Boolean = js.native
  /* private */ def nextFrame(unschedule: js.Any): js.Any = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
  /* private */ def setFrame(frame: js.Any, unschedule: js.Any, animate: js.Any): js.Any = js.native
  def setOneShot(oneShot: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def start(): scala.Unit = js.native
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
  def unscheduleSelf(what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

