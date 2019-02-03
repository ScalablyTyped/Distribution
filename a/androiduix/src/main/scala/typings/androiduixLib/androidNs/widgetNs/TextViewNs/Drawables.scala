package typings
package androiduixLib.androidNs.widgetNs.TextViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView.Drawables")
@js.native
class Drawables () extends js.Object {
  def this(context: js.Any) = this()
  var mCompoundRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mDrawableBottom: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableEnd: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableError: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableHeightEnd: scala.Double = js.native
  var mDrawableHeightError: scala.Double = js.native
  var mDrawableHeightLeft: scala.Double = js.native
  var mDrawableHeightRight: scala.Double = js.native
  var mDrawableHeightStart: scala.Double = js.native
  var mDrawableHeightTemp: scala.Double = js.native
  var mDrawableLeft: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableLeftInitial: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawablePadding: scala.Double = js.native
  var mDrawableRight: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableRightInitial: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableSaved: scala.Double = js.native
  var mDrawableSizeBottom: scala.Double = js.native
  var mDrawableSizeEnd: scala.Double = js.native
  var mDrawableSizeError: scala.Double = js.native
  var mDrawableSizeLeft: scala.Double = js.native
  var mDrawableSizeRight: scala.Double = js.native
  var mDrawableSizeStart: scala.Double = js.native
  var mDrawableSizeTemp: scala.Double = js.native
  var mDrawableSizeTop: scala.Double = js.native
  var mDrawableStart: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableTemp: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableTop: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mDrawableWidthBottom: scala.Double = js.native
  var mDrawableWidthTop: scala.Double = js.native
  var mIsRtlCompatibilityMode: scala.Boolean = js.native
  var mOverride: scala.Boolean = js.native
  /* private */ def applyErrorDrawableIfNeeded(layoutDirection: js.Any): js.Any = js.native
  def resolveWithLayoutDirection(layoutDirection: scala.Double): scala.Unit = js.native
  def setErrorDrawable(
    dr: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    tv: androiduixLib.androidNs.widgetNs.TextView
  ): scala.Unit = js.native
  /* private */ def updateDrawablesLayoutDirection(layoutDirection: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.TextView.Drawables")
@js.native
object Drawables extends js.Object {
  var DRAWABLE_LEFT: scala.Double = js.native
  var DRAWABLE_NONE: scala.Double = js.native
  var DRAWABLE_RIGHT: scala.Double = js.native
}

