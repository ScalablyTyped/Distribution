package typings.androiduix.androidNs.widgetNs.TextViewNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.widgetNs.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView.Drawables")
@js.native
class Drawables () extends js.Object {
  def this(context: js.Any) = this()
  var mCompoundRect: Rect = js.native
  var mDrawableBottom: Drawable = js.native
  var mDrawableEnd: Drawable = js.native
  var mDrawableError: Drawable = js.native
  var mDrawableHeightEnd: Double = js.native
  var mDrawableHeightError: Double = js.native
  var mDrawableHeightLeft: Double = js.native
  var mDrawableHeightRight: Double = js.native
  var mDrawableHeightStart: Double = js.native
  var mDrawableHeightTemp: Double = js.native
  var mDrawableLeft: Drawable = js.native
  var mDrawableLeftInitial: Drawable = js.native
  var mDrawablePadding: Double = js.native
  var mDrawableRight: Drawable = js.native
  var mDrawableRightInitial: Drawable = js.native
  var mDrawableSaved: Double = js.native
  var mDrawableSizeBottom: Double = js.native
  var mDrawableSizeEnd: Double = js.native
  var mDrawableSizeError: Double = js.native
  var mDrawableSizeLeft: Double = js.native
  var mDrawableSizeRight: Double = js.native
  var mDrawableSizeStart: Double = js.native
  var mDrawableSizeTemp: Double = js.native
  var mDrawableSizeTop: Double = js.native
  var mDrawableStart: Drawable = js.native
  var mDrawableTemp: Drawable = js.native
  var mDrawableTop: Drawable = js.native
  var mDrawableWidthBottom: Double = js.native
  var mDrawableWidthTop: Double = js.native
  var mIsRtlCompatibilityMode: Boolean = js.native
  var mOverride: Boolean = js.native
  /* private */ def applyErrorDrawableIfNeeded(layoutDirection: js.Any): js.Any = js.native
  def resolveWithLayoutDirection(layoutDirection: Double): Unit = js.native
  def setErrorDrawable(dr: Drawable, tv: TextView): Unit = js.native
  /* private */ def updateDrawablesLayoutDirection(layoutDirection: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.TextView.Drawables")
@js.native
object Drawables extends js.Object {
  var DRAWABLE_LEFT: Double = js.native
  var DRAWABLE_NONE: Double = js.native
  var DRAWABLE_RIGHT: Double = js.native
}

