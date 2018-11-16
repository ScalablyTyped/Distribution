package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlImageView")
@js.native
class HtmlImageView protected () extends HtmlBaseView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  /* private */ def configureBounds(): js.Any = js.native
  def getAdjustViewBounds(): scala.Boolean = js.native
  def getImageAlpha(): scala.Double = js.native
  def getMaxHeight(): scala.Double = js.native
  def getMaxWidth(): scala.Double = js.native
  def getScaleType(): androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType = js.native
  /* private */ def initImageView(): js.Any = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): scala.Unit = js.native
  /* private */ def resolveAdjustedSize(desiredSize: js.Any, maxSize: js.Any, measureSpec: js.Any): js.Any = js.native
  def setAdjustViewBounds(adjustViewBounds: scala.Boolean): scala.Unit = js.native
  def setImageAlpha(alpha: scala.Double): scala.Unit = js.native
  def setImageURI(uri: java.lang.String): scala.Unit = js.native
  def setMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  def setMaxWidth(maxWidth: scala.Double): scala.Unit = js.native
  def setScaleType(scaleType: androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType): scala.Unit = js.native
}

