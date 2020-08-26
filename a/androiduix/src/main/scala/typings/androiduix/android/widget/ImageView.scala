package typings.androiduix.android.widget

import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.ImageView.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageView extends View {
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

@JSGlobal("android.widget.ImageView")
@js.native
object ImageView extends js.Object {
  @js.native
  sealed trait ScaleType extends js.Object
  
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
    
  }
  
}

