package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
@js.native
class PhotoViewAttacher protected ()
  extends IPhotoView
     with androiduixLib.androidNs.viewNs.ViewNs.OnTouchListener
     with androiduixLib.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs.OnGestureListener
     with androiduixLib.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener {
  def this(imageView: androiduixLib.androidNs.widgetNs.ImageView) = this()
  def this(imageView: androiduixLib.androidNs.widgetNs.ImageView, zoomable: scala.Boolean) = this()
  var ZOOM_DURATION: scala.Double = js.native
  var mAllowParentInterceptOnEdge: js.Any = js.native
  var mBaseMatrix: js.Any = js.native
  var mBlockParentIntercept: js.Any = js.native
  var mCurrentFlingRunnable: js.Any = js.native
  var mDisplayRect: js.Any = js.native
  var mDrawMatrix: js.Any = js.native
  var mGestureDetector: js.Any = js.native
  var mImageView: js.Any = js.native
  var mIvBottom: js.Any = js.native
  var mIvLeft: js.Any = js.native
  var mIvRight: js.Any = js.native
  var mIvTop: js.Any = js.native
  var mLongClickListener: js.Any = js.native
  var mMatrixChangeListener: js.Any = js.native
  var mMatrixValues: js.Any = js.native
  var mMaxScale: js.Any = js.native
  var mMidScale: js.Any = js.native
  var mMinScale: js.Any = js.native
  var mPhotoTapListener: js.Any = js.native
  var mScaleChangeListener: js.Any = js.native
  var mScaleDragDetector: js.Any = js.native
  var mScaleType: js.Any = js.native
  var mScrollEdge: js.Any = js.native
  var mSuppMatrix: js.Any = js.native
  var mViewTapListener: js.Any = js.native
  var mZoomEnabled: js.Any = js.native
  /* private */ def _getDisplayRect(matrix: js.Any): js.Any = js.native
  /* private */ def cancelFling(): js.Any = js.native
  /* private */ def checkAndDisplayMatrix(): js.Any = js.native
  /* private */ def checkImageViewScaleType(): js.Any = js.native
  /* private */ def checkMatrixBounds(): js.Any = js.native
  def cleanup(): scala.Unit = js.native
  def getDrawMatrix(): androiduixLib.androidNs.graphicsNs.Matrix = js.native
  def getImageView(): androiduixLib.androidNs.widgetNs.ImageView = js.native
  /* private */ def getImageViewHeight(imageView: js.Any): js.Any = js.native
  /* private */ def getImageViewWidth(imageView: js.Any): js.Any = js.native
  /* private */ def getValue(matrix: js.Any, whichValue: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onDrag(dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def onFling(startX: scala.Double, startY: scala.Double, velocityX: scala.Double, velocityY: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def onGlobalLayout(): js.Any = js.native
  /* CompleteClass */
  override def onScale(scaleFactor: scala.Double, focusX: scala.Double, focusY: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def onTouch(v: androiduixLib.androidNs.viewNs.View, event: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit = js.native
  /* private */ def resetMatrix(): js.Any = js.native
  /* private */ def setImageViewMatrix(matrix: js.Any): js.Any = js.native
  def setScale(scale: scala.Double, focalX: scala.Double, focalY: scala.Double): scala.Unit = js.native
  /* private */ def setScale_2(scale: js.Any): js.Any = js.native
  /* private */ def setScale_2(scale: js.Any, animate: js.Any): js.Any = js.native
  /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any): js.Any = js.native
  /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any, animate: js.Any): js.Any = js.native
  def update(): scala.Unit = js.native
  /* private */ def updateBaseMatrix(d: js.Any): js.Any = js.native
}

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
@js.native
object PhotoViewAttacher extends js.Object {
  var DEBUG: js.Any = js.native
  var EDGE_BOTH: scala.Double = js.native
  var EDGE_LEFT: scala.Double = js.native
  var EDGE_NONE: scala.Double = js.native
  var EDGE_RIGHT: scala.Double = js.native
  var LOG_TAG: js.Any = js.native
  var sInterpolator: androiduixLib.androidNs.viewNs.animationNs.Interpolator = js.native
  /* private */ def checkZoomLevels(minZoom: js.Any, midZoom: js.Any, maxZoom: js.Any): js.Any = js.native
  /* private */ def hasDrawable(imageView: js.Any): js.Any = js.native
  /* private */ def isSupportedScaleType(scaleType: js.Any): js.Any = js.native
  /* private */ def setImageViewScaleTypeMatrix(imageView: js.Any): js.Any = js.native
}

