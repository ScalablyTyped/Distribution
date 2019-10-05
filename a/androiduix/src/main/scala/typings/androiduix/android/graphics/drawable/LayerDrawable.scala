package typings.androiduix.android.graphics.drawable

import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.graphics.drawable.Drawable.ConstantState
import typings.androiduix.android.graphics.drawable.LayerDrawable.ChildDrawable
import typings.androiduix.android.graphics.drawable.LayerDrawable.LayerState
import typings.androiduix.java.lang.Runnable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
class LayerDrawable protected ()
  extends Drawable
     with Callback {
  def this(layers: js.Array[Drawable]) = this()
  def this(layers: js.Array[Drawable], state: LayerState) = this()
  var mLayerState: LayerState = js.native
  var mMutated: js.Any = js.native
  var mOpacityOverride: js.Any = js.native
  var mPaddingB: js.Any = js.native
  var mPaddingL: js.Any = js.native
  var mPaddingR: js.Any = js.native
  var mPaddingT: js.Any = js.native
  var mTmpRect: js.Any = js.native
  /* private */ def addLayer(layer: js.Any, id: js.Any): js.Any = js.native
  /* private */ def addLayer(layer: js.Any, id: js.Any, left: js.Any): js.Any = js.native
  /* private */ def addLayer(layer: js.Any, id: js.Any, left: js.Any, top: js.Any): js.Any = js.native
  /* private */ def addLayer(layer: js.Any, id: js.Any, left: js.Any, top: js.Any, right: js.Any): js.Any = js.native
  /* private */ def addLayer(layer: js.Any, id: js.Any, left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def copyBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def copyBounds(bounds: Rect): Rect = js.native
  def createConstantState(state: LayerState): LayerState = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MLayerDrawable(who: Drawable): Unit = js.native
  /* private */ def ensurePadding(): js.Any = js.native
  def findDrawableByLayerId(id: String): Drawable = js.native
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
  def getDrawable(index: Double): Drawable = js.native
  def getId(index: Double): String = js.native
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
  def getNumberOfLayers(): Double = js.native
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
  /* private */ def reapplyPadding(i: js.Any, r: js.Any): js.Any = js.native
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
  def setDrawableByLayerId(id: String, drawable: Drawable): Boolean = js.native
  def setId(index: Double, id: String): Unit = js.native
  /* InferMemberOverrides */
  override def setIgnoreNotifySizeChange(isIgnore: Boolean): Unit = js.native
  def setLayerInset(index: Double, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setLevel(level: Double): Boolean = js.native
  def setOpacity(opacity: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setState(stateSet: js.Array[Double]): Boolean = js.native
  /* InferMemberOverrides */
  override def setVisible(visible: Boolean, restart: Boolean): Boolean = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
  /* InferMemberOverrides */
  override def unscheduleSelf(what: js.Any): Unit = js.native
}

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
object LayerDrawable extends js.Object {
  @js.native
  class ChildDrawable () extends js.Object {
    var mDrawable: Drawable = js.native
    var mId: String = js.native
    var mInsetB: Double = js.native
    var mInsetL: Double = js.native
    var mInsetR: Double = js.native
    var mInsetT: Double = js.native
  }
  
  @js.native
  class LayerState protected () extends ConstantState {
    def this(orig: LayerState, owner: LayerDrawable) = this()
    var mAutoMirrored: js.Any = js.native
    var mCanConstantState: js.Any = js.native
    var mCheckedConstantState: js.Any = js.native
    var mChildren: js.Array[ChildDrawable] = js.native
    var mHaveOpacity: js.Any = js.native
    var mHaveStateful: js.Any = js.native
    var mNum: Double = js.native
    var mOpacity: js.Any = js.native
    var mStateful: js.Any = js.native
    def canConstantState(): Boolean = js.native
    def getOpacity(): Double = js.native
    def isStateful(): Boolean = js.native
    /* CompleteClass */
    override def newDrawable(): Drawable = js.native
  }
  
}

