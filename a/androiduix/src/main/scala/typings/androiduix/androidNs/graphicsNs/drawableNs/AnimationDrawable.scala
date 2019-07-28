package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.AnimationDrawableNs.AnimationState
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.AnimationDrawable")
@js.native
class AnimationDrawable ()
  extends DrawableContainer
     with Runnable
     with Animatable {
  def this(state: AnimationState) = this()
  var mAnimationState: js.Any = js.native
  var mCurFrame: js.Any = js.native
  def addFrame(frame: Drawable, duration: Double): Unit = js.native
  def getDuration(i: Double): Double = js.native
  def getFrame(index: Double): Drawable = js.native
  def getNumberOfFrames(): Double = js.native
  def isOneShot(): Boolean = js.native
  /* CompleteClass */
  override def isRunning(): Boolean = js.native
  /* private */ def nextFrame(unschedule: js.Any): js.Any = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
  /* private */ def setFrame(frame: js.Any, unschedule: js.Any, animate: js.Any): js.Any = js.native
  def setOneShot(oneShot: Boolean): Unit = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
  def unscheduleSelf(what: Runnable): Unit = js.native
}

