package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.ClipDrawable.ClipState
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.java.lang.Runnable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
class ClipDrawable ()
  extends Drawable
     with Callback {
  def this(state: ClipState) = this()
  def this(drawable: Drawable, gravity: Double, orientation: Double) = this()
  var mClipState: js.Any = js.native
  var mTmpRect: js.Any = js.native
  /* InferMemberOverrides */
  override def copyBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def copyBounds(bounds: Rect): Rect = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MClipDrawable(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def getAlpha(): Double = js.native
  /* InferMemberOverrides */
  override def getBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def getCallback(): Callback = js.native
  /* InferMemberOverrides */
  override def getConstantState(): ConstantState = js.native
  /* InferMemberOverrides */
  override def getCurrent(): Drawable = js.native
  /* InferMemberOverrides */
  override def getIntrinsicHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getIntrinsicWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getLevel(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getOpacity(): Double = js.native
  /* InferMemberOverrides */
  override def getPadding(padding: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def getState(): js.Array[Double] = js.native
  /* InferMemberOverrides */
  override def inflate(r: Resources, parser: HTMLElement): Unit = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def invalidateSelf(): Unit = js.native
  /* InferMemberOverrides */
  override def isAutoMirrored(): Boolean = js.native
  /* InferMemberOverrides */
  override def isStateful(): Boolean = js.native
  /* InferMemberOverrides */
  override def isVisible(): Boolean = js.native
  /* InferMemberOverrides */
  override def jumpToCurrentState(): Unit = js.native
  /* InferMemberOverrides */
  override def mutate(): Drawable = js.native
  /* InferMemberOverrides */
  override def notifySizeChangeSelf(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onBoundsChange(bounds: Rect): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onLevelChange(level: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def onStateChange(state: js.Array[Double]): Boolean = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  /* InferMemberOverrides */
  override def scheduleSelf(what: js.Any, when: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setAlpha(alpha: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setAutoMirrored(mirrored: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setBounds(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def setBounds(rect: Rect): js.Any = js.native
  /* InferMemberOverrides */
  override def setCallback(cb: Callback): Unit = js.native
  /* InferMemberOverrides */
  override def setDither(dither: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setLevel(level: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def setState(stateSet: js.Array[Double]): Boolean = js.native
  /* InferMemberOverrides */
  override def setVisible(visible: Boolean, restart: Boolean): Boolean = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
  /* InferMemberOverrides */
  override def unscheduleSelf(what: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.drawable.ClipDrawable")
@js.native
object ClipDrawable extends js.Object {
  @js.native
  class ClipState protected () extends ConstantState {
    def this(orig: ClipState, owner: ClipDrawable) = this()
    var mCanConstantState: js.Any = js.native
    var mCheckedConstantState: js.Any = js.native
    var mDrawable: Drawable = js.native
    var mGravity: Double = js.native
    var mOrientation: Double = js.native
    def canConstantState(): Boolean = js.native
    /* CompleteClass */
    override def newDrawable(): Drawable = js.native
  }
  
  var HORIZONTAL: Double = js.native
  var VERTICAL: Double = js.native
}

