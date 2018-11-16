package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ImageView")
@js.native
class ImageView protected ()
  extends androiduixLib.androidNs.viewNs.View {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mAdjustViewBounds: js.Any = js.native
  var mAdjustViewBoundsCompat: js.Any = js.native
  var mAlpha: js.Any = js.native
  var mBaseline: js.Any = js.native
  var mBaselineAlignBottom: js.Any = js.native
  var mColorMod: js.Any = js.native
  var mCropToPadding: js.Any = js.native
  var mDrawMatrix: js.Any = js.native
  var mDrawable: js.Any = js.native
  var mDrawableHeight: js.Any = js.native
  var mDrawableWidth: js.Any = js.native
  var mHaveFrame: js.Any = js.native
  var mLevel: js.Any = js.native
  var mMatrix: js.Any = js.native
  var mMaxHeight: js.Any = js.native
  var mMaxWidth: js.Any = js.native
  var mMergeState: js.Any = js.native
  var mScaleType: js.Any = js.native
  var mState: js.Any = js.native
  var mTempDst: js.Any = js.native
  var mTempSrc: js.Any = js.native
  var mUri: js.Any = js.native
  var mViewAlphaScale: js.Any = js.native
  /* private */ def applyColorMod(): js.Any = js.native
  /* private */ def configureBounds(): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MImageView(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def getAdjustViewBounds(): scala.Boolean = js.native
  def getBaselineAlignBottom(): scala.Boolean = js.native
  def getCropToPadding(): scala.Boolean = js.native
  def getDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getImageAlpha(): scala.Double = js.native
  def getImageMatrix(): androiduixLib.androidNs.graphicsNs.Matrix = js.native
  def getMaxHeight(): scala.Double = js.native
  def getMaxWidth(): scala.Double = js.native
  def getScaleType(): androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType = js.native
  /* private */ def initImageView(): js.Any = js.native
  /* protected */ def resizeFromDrawable(): scala.Boolean = js.native
  /* private */ def resolveAdjustedSize(desiredSize: js.Any, maxSize: js.Any, measureSpec: js.Any): js.Any = js.native
  /* private */ def resolveUri(): js.Any = js.native
  def setAdjustViewBounds(adjustViewBounds: scala.Boolean): scala.Unit = js.native
  def setBaseline(baseline: scala.Double): scala.Unit = js.native
  def setBaselineAlignBottom(aligned: scala.Boolean): scala.Unit = js.native
  def setCropToPadding(cropToPadding: scala.Boolean): scala.Unit = js.native
  def setImageAlpha(alpha: scala.Double): scala.Unit = js.native
  def setImageDrawable(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setImageLevel(level: scala.Double): scala.Unit = js.native
  def setImageMatrix(matrix: androiduixLib.androidNs.graphicsNs.Matrix): scala.Unit = js.native
  def setImageState(state: js.Array[scala.Double], merge: scala.Boolean): scala.Unit = js.native
  def setImageURI(uri: java.lang.String): scala.Unit = js.native
  def setMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  def setMaxWidth(maxWidth: scala.Double): scala.Unit = js.native
  def setScaleType(scaleType: androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType): scala.Unit = js.native
  /* private */ def updateDrawable(d: js.Any): js.Any = js.native
}

@JSGlobal("android.widget.ImageView")
@js.native
object ImageView extends js.Object {
  var sS2FArray: js.Any = js.native
  def parseScaleType(s: java.lang.String, defaultType: androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType): androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType = js.native
  /* private */ def scaleTypeToScaleToFit(st: js.Any): js.Any = js.native
}

