package typings.androiduix.androidui.widget

import typings.androiduix.android.widget.ImageView.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlImageView extends HtmlBaseView {
  
  /* private */ def configureBounds(): js.Any = js.native
  
  def getAdjustViewBounds(): Boolean = js.native
  
  def getImageAlpha(): Double = js.native
  
  def getMaxHeight(): Double = js.native
  
  def getMaxWidth(): Double = js.native
  
  def getScaleType(): ScaleType = js.native
  
  /* private */ def initImageView(): js.Any = js.native
  
  var mAdjustViewBounds: js.Any = js.native
  
  var mAdjustViewBoundsCompat: js.Any = js.native
  
  var mAlpha: js.Any = js.native
  
  var mDrawableHeight: js.Any = js.native
  
  var mDrawableWidth: js.Any = js.native
  
  var mHaveFrame: js.Any = js.native
  
  var mImgElement: js.Any = js.native
  
  var mMaxHeight: js.Any = js.native
  
  var mMaxWidth: js.Any = js.native
  
  var mScaleType: js.Any = js.native
  
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
  
  /* private */ def resolveAdjustedSize(desiredSize: js.Any, maxSize: js.Any, measureSpec: js.Any): js.Any = js.native
  
  def setAdjustViewBounds(adjustViewBounds: Boolean): Unit = js.native
  
  def setImageAlpha(alpha: Double): Unit = js.native
  
  def setImageURI(uri: String): Unit = js.native
  
  def setMaxHeight(maxHeight: Double): Unit = js.native
  
  def setMaxWidth(maxWidth: Double): Unit = js.native
  
  def setScaleType(scaleType: ScaleType): Unit = js.native
}
