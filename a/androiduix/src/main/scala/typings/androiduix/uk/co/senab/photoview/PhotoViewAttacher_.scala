package typings.androiduix.uk.co.senab.photoview

import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.widget.ImageView
import typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoViewAttacher_
  extends IPhotoView
     with OnTouchListener
     with OnGestureListener
     with OnGlobalLayoutListener {
  
  var ZOOM_DURATION: Double = js.native
  
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
  
  /* private */ def resetMatrix(): js.Any = js.native
  
  /* private */ def setImageViewMatrix(matrix: js.Any): js.Any = js.native
  
  def setScale(scale: Double, focalX: Double, focalY: Double): Unit = js.native
  
  /* private */ def setScale_2(scale: js.Any, animate: js.Any): js.Any = js.native
  
  /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any, animate: js.Any): js.Any = js.native
  
  def update(): Unit = js.native
  
  /* private */ def updateBaseMatrix(d: js.Any): js.Any = js.native
}
