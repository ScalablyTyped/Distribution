package typings.androiduix.ukNs.coNs.senabNs.photoviewNs

import typings.androiduix.androidNs.graphicsNs.Matrix
import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewNs.OnTouchListener
import typings.androiduix.androidNs.viewNs.ViewTreeObserverNs.OnGlobalLayoutListener
import typings.androiduix.androidNs.viewNs.animationNs.Interpolator
import typings.androiduix.androidNs.widgetNs.ImageView
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
@js.native
class PhotoViewAttacher protected ()
  extends IPhotoView
     with OnTouchListener
     with OnGestureListener
     with OnGlobalLayoutListener {
  def this(imageView: ImageView) = this()
  def this(imageView: ImageView, zoomable: Boolean) = this()
  var ZOOM_DURATION: Double = js.native
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
  def cleanup(): Unit = js.native
  def getDrawMatrix(): Matrix = js.native
  def getImageView(): ImageView = js.native
  /* private */ def getImageViewHeight(imageView: js.Any): js.Any = js.native
  /* private */ def getImageViewWidth(imageView: js.Any): js.Any = js.native
  /* private */ def getValue(matrix: js.Any, whichValue: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onDrag(dx: Double, dy: Double): Unit = js.native
  /* CompleteClass */
  override def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit = js.native
  /* CompleteClass */
  override def onGlobalLayout(): js.Any = js.native
  /* CompleteClass */
  override def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
  /* CompleteClass */
  override def onTouch(v: View, event: MotionEvent): Unit = js.native
  /* private */ def resetMatrix(): js.Any = js.native
  /* private */ def setImageViewMatrix(matrix: js.Any): js.Any = js.native
  def setScale(scale: Double, focalX: Double, focalY: Double): Unit = js.native
  /* private */ def setScale_2(scale: js.Any): js.Any = js.native
  /* private */ def setScale_2(scale: js.Any, animate: js.Any): js.Any = js.native
  /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any): js.Any = js.native
  /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any, animate: js.Any): js.Any = js.native
  def update(): Unit = js.native
  /* private */ def updateBaseMatrix(d: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
@js.native
object PhotoViewAttacher extends js.Object {
  var DEBUG: js.Any = js.native
  var EDGE_BOTH: Double = js.native
  var EDGE_LEFT: Double = js.native
  var EDGE_NONE: Double = js.native
  var EDGE_RIGHT: Double = js.native
  var LOG_TAG: js.Any = js.native
  var sInterpolator: Interpolator = js.native
  /* private */ def checkZoomLevels(minZoom: js.Any, midZoom: js.Any, maxZoom: js.Any): js.Any = js.native
  /* private */ def hasDrawable(imageView: js.Any): js.Any = js.native
  /* private */ def isSupportedScaleType(scaleType: js.Any): js.Any = js.native
  /* private */ def setImageViewScaleTypeMatrix(imageView: js.Any): js.Any = js.native
}

