package typings.androiduix.androidNs.graphicsNs.drawableNs

import typings.androiduix.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
import typings.androiduix.androidNs.graphicsNs.drawableNs.LayerDrawableNs.LayerState
import typings.androiduix.javaNs.langNs.Runnable
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
  def createConstantState(state: LayerState): LayerState = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MLayerDrawable(who: Drawable): Unit = js.native
  /* private */ def ensurePadding(): js.Any = js.native
  def findDrawableByLayerId(id: String): Drawable = js.native
  def getDrawable(index: Double): Drawable = js.native
  def getId(index: Double): String = js.native
  def getNumberOfLayers(): Double = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): Unit = js.native
  /* private */ def reapplyPadding(i: js.Any, r: js.Any): js.Any = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: Runnable, when: Double): Unit = js.native
  def setDrawableByLayerId(id: String, drawable: Drawable): Boolean = js.native
  def setId(index: Double, id: String): Unit = js.native
  def setLayerInset(index: Double, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: Runnable): Unit = js.native
}

