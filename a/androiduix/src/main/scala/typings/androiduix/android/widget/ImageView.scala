package typings.androiduix.android.widget

import org.scalablytyped.runtime.TopLevel
import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.ImageView.ScaleType
import typings.androiduix.android.widget.ImageView.ScaleType.CENTER
import typings.androiduix.android.widget.ImageView.ScaleType.CENTER_CROP
import typings.androiduix.android.widget.ImageView.ScaleType.CENTER_INSIDE
import typings.androiduix.android.widget.ImageView.ScaleType.FIT_CENTER
import typings.androiduix.android.widget.ImageView.ScaleType.FIT_END
import typings.androiduix.android.widget.ImageView.ScaleType.FIT_START
import typings.androiduix.android.widget.ImageView.ScaleType.FIT_XY
import typings.androiduix.android.widget.ImageView.ScaleType.MATRIX
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ImageView")
@js.native
class ImageView protected () extends View {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
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
  def drawableSizeChange_MImageView(who: Drawable): Unit = js.native
  def getAdjustViewBounds(): Boolean = js.native
  def getBaselineAlignBottom(): Boolean = js.native
  def getCropToPadding(): Boolean = js.native
  def getDrawable(): Drawable = js.native
  def getImageAlpha(): Double = js.native
  def getImageMatrix(): Matrix = js.native
  def getMaxHeight(): Double = js.native
  def getMaxWidth(): Double = js.native
  def getScaleType(): ScaleType = js.native
  /* private */ def initImageView(): js.Any = js.native
  /* protected */ def resizeFromDrawable(): Boolean = js.native
  /* private */ def resolveAdjustedSize(desiredSize: js.Any, maxSize: js.Any, measureSpec: js.Any): js.Any = js.native
  /* private */ def resolveUri(): js.Any = js.native
  def setAdjustViewBounds(adjustViewBounds: Boolean): Unit = js.native
  def setBaseline(baseline: Double): Unit = js.native
  def setBaselineAlignBottom(aligned: Boolean): Unit = js.native
  def setCropToPadding(cropToPadding: Boolean): Unit = js.native
  def setImageAlpha(alpha: Double): Unit = js.native
  def setImageDrawable(drawable: Drawable): Unit = js.native
  def setImageLevel(level: Double): Unit = js.native
  def setImageMatrix(matrix: Matrix): Unit = js.native
  def setImageState(state: js.Array[Double], merge: Boolean): Unit = js.native
  def setImageURI(uri: String): Unit = js.native
  def setMaxHeight(maxHeight: Double): Unit = js.native
  def setMaxWidth(maxWidth: Double): Unit = js.native
  def setScaleType(scaleType: ScaleType): Unit = js.native
  /* private */ def updateDrawable(d: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ImageView")
@js.native
object ImageView extends js.Object {
  @js.native
  sealed trait ScaleType extends js.Object
  
  var sS2FArray: js.Any = js.native
  def parseScaleType(s: String, defaultType: ScaleType): ScaleType = js.native
  /* private */ def scaleTypeToScaleToFit(st: js.Any): js.Any = js.native
  @js.native
  object ScaleType extends js.Object {
    @js.native
    sealed trait CENTER extends ScaleType
    
    @js.native
    sealed trait CENTER_CROP extends ScaleType
    
    @js.native
    sealed trait CENTER_INSIDE extends ScaleType
    
    @js.native
    sealed trait FIT_CENTER extends ScaleType
    
    @js.native
    sealed trait FIT_END extends ScaleType
    
    @js.native
    sealed trait FIT_START extends ScaleType
    
    @js.native
    sealed trait FIT_XY extends ScaleType
    
    @js.native
    sealed trait MATRIX extends ScaleType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScaleType with Double] = js.native
    /* 5 */ @js.native
    object CENTER extends TopLevel[CENTER with Double]
    
    /* 6 */ @js.native
    object CENTER_CROP extends TopLevel[CENTER_CROP with Double]
    
    /* 7 */ @js.native
    object CENTER_INSIDE extends TopLevel[CENTER_INSIDE with Double]
    
    /* 3 */ @js.native
    object FIT_CENTER extends TopLevel[FIT_CENTER with Double]
    
    /* 4 */ @js.native
    object FIT_END extends TopLevel[FIT_END with Double]
    
    /* 2 */ @js.native
    object FIT_START extends TopLevel[FIT_START with Double]
    
    /* 1 */ @js.native
    object FIT_XY extends TopLevel[FIT_XY with Double]
    
    /* 0 */ @js.native
    object MATRIX extends TopLevel[MATRIX with Double]
    
  }
  
}

