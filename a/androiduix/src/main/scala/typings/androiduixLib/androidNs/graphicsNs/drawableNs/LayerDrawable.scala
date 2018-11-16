package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.drawable.LayerDrawable")
@js.native
class LayerDrawable protected ()
  extends Drawable
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback {
  def this(layers: js.Array[Drawable]) = this()
  def this(layers: js.Array[Drawable], state: androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawableNs.LayerState) = this()
  var mLayerState: androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawableNs.LayerState = js.native
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
  def createConstantState(state: androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawableNs.LayerState): androiduixLib.androidNs.graphicsNs.drawableNs.LayerDrawableNs.LayerState = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MLayerDrawable(who: Drawable): scala.Unit = js.native
  /* private */ def ensurePadding(): js.Any = js.native
  def findDrawableByLayerId(id: java.lang.String): Drawable = js.native
  def getDrawable(index: scala.Double): Drawable = js.native
  def getId(index: scala.Double): java.lang.String = js.native
  def getNumberOfLayers(): scala.Double = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: Drawable): scala.Unit = js.native
  /* private */ def reapplyPadding(i: js.Any, r: js.Any): js.Any = js.native
  /* CompleteClass */
  override def scheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable, when: scala.Double): scala.Unit = js.native
  def setDrawableByLayerId(id: java.lang.String, drawable: Drawable): scala.Boolean = js.native
  def setId(index: scala.Double, id: java.lang.String): scala.Unit = js.native
  def setLayerInset(index: scala.Double, l: scala.Double, t: scala.Double, r: scala.Double, b: scala.Double): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(who: Drawable, what: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

