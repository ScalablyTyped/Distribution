package typings.androiduix

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.RectF
import typings.androiduix.android.view.GestureDetector.OnDoubleTapListener
import typings.androiduix.android.view.GestureDetector.OnGestureListener
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.ScaleGestureDetector
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.OnLongClickListener
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typings.androiduix.android.widget.ImageView
import typings.androiduix.android.widget.ImageView.ScaleType
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.OnMatrixChangedListener
import typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.OnPhotoTapListener
import typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.OnScaleChangeListener
import typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.OnViewTapListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uk {
  
  object co {
    
    object senab {
      
      object photoview {
        
        @js.native
        trait GestureDetector extends StObject {
          
          def getActiveX(ev: MotionEvent): Double = js.native
          
          def getActiveY(ev: MotionEvent): Double = js.native
          
          def isDragging(): Boolean = js.native
          
          def isScaling(): Boolean = js.native
          
          var mActivePointerId: js.Any = js.native
          
          var mActivePointerIndex: js.Any = js.native
          
          var mIsDragging: js.Any = js.native
          
          var mLastTouchX: Double = js.native
          
          var mLastTouchY: Double = js.native
          
          var mListener: OnGestureListener = js.native
          
          var mMinimumVelocity: Double = js.native
          
          var mScaleDetector: ScaleGestureDetector = js.native
          
          var mTouchSlop: Double = js.native
          
          var mVelocityTracker: js.Any = js.native
          
          def onTouchEvent(ev: MotionEvent): Boolean = js.native
          
          def setOnGestureListener(listener: OnGestureListener): Unit = js.native
        }
        object GestureDetector {
          
          @scala.inline
          def apply(
            getActiveX: MotionEvent => Double,
            getActiveY: MotionEvent => Double,
            isDragging: () => Boolean,
            isScaling: () => Boolean,
            mActivePointerId: js.Any,
            mActivePointerIndex: js.Any,
            mIsDragging: js.Any,
            mLastTouchX: Double,
            mLastTouchY: Double,
            mListener: typings.androiduix.android.view.GestureDetector.OnGestureListener,
            mMinimumVelocity: Double,
            mScaleDetector: ScaleGestureDetector,
            mTouchSlop: Double,
            mVelocityTracker: js.Any,
            onTouchEvent: MotionEvent => Boolean,
            setOnGestureListener: typings.androiduix.android.view.GestureDetector.OnGestureListener => Unit
          ): GestureDetector = {
            val __obj = js.Dynamic.literal(getActiveX = js.Any.fromFunction1(getActiveX), getActiveY = js.Any.fromFunction1(getActiveY), isDragging = js.Any.fromFunction0(isDragging), isScaling = js.Any.fromFunction0(isScaling), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mActivePointerIndex = mActivePointerIndex.asInstanceOf[js.Any], mIsDragging = mIsDragging.asInstanceOf[js.Any], mLastTouchX = mLastTouchX.asInstanceOf[js.Any], mLastTouchY = mLastTouchY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinimumVelocity = mMinimumVelocity.asInstanceOf[js.Any], mScaleDetector = mScaleDetector.asInstanceOf[js.Any], mTouchSlop = mTouchSlop.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setOnGestureListener = js.Any.fromFunction1(setOnGestureListener))
            __obj.asInstanceOf[GestureDetector]
          }
          
          @scala.inline
          implicit class GestureDetectorMutableBuilder[Self <: GestureDetector] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setGetActiveX(value: MotionEvent => Double): Self = StObject.set(x, "getActiveX", js.Any.fromFunction1(value))
            
            @scala.inline
            def setGetActiveY(value: MotionEvent => Double): Self = StObject.set(x, "getActiveY", js.Any.fromFunction1(value))
            
            @scala.inline
            def setIsDragging(value: () => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction0(value))
            
            @scala.inline
            def setIsScaling(value: () => Boolean): Self = StObject.set(x, "isScaling", js.Any.fromFunction0(value))
            
            @scala.inline
            def setMActivePointerId(value: js.Any): Self = StObject.set(x, "mActivePointerId", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMActivePointerIndex(value: js.Any): Self = StObject.set(x, "mActivePointerIndex", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMIsDragging(value: js.Any): Self = StObject.set(x, "mIsDragging", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMLastTouchX(value: Double): Self = StObject.set(x, "mLastTouchX", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMLastTouchY(value: Double): Self = StObject.set(x, "mLastTouchY", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMListener(value: typings.androiduix.android.view.GestureDetector.OnGestureListener): Self = StObject.set(x, "mListener", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMMinimumVelocity(value: Double): Self = StObject.set(x, "mMinimumVelocity", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMScaleDetector(value: ScaleGestureDetector): Self = StObject.set(x, "mScaleDetector", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMTouchSlop(value: Double): Self = StObject.set(x, "mTouchSlop", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMVelocityTracker(value: js.Any): Self = StObject.set(x, "mVelocityTracker", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setOnTouchEvent(value: MotionEvent => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSetOnGestureListener(value: typings.androiduix.android.view.GestureDetector.OnGestureListener => Unit): Self = StObject.set(x, "setOnGestureListener", js.Any.fromFunction1(value))
          }
          
          @js.native
          trait OnGestureListener extends StObject {
            
            def onDrag(dx: Double, dy: Double): Unit = js.native
            
            def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit = js.native
            
            def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
          }
          object OnGestureListener {
            
            @scala.inline
            def apply(
              onDrag: (Double, Double) => Unit,
              onFling: (Double, Double, Double, Double) => Unit,
              onScale: (Double, Double, Double) => Unit
            ): typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener = {
              val __obj = js.Dynamic.literal(onDrag = js.Any.fromFunction2(onDrag), onFling = js.Any.fromFunction4(onFling), onScale = js.Any.fromFunction3(onScale))
              __obj.asInstanceOf[typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener]
            }
            
            @scala.inline
            implicit class OnGestureListenerMutableBuilder[Self <: typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setOnDrag(value: (Double, Double) => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
              
              @scala.inline
              def setOnFling(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onFling", js.Any.fromFunction4(value))
              
              @scala.inline
              def setOnScale(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onScale", js.Any.fromFunction3(value))
            }
          }
        }
        
        @js.native
        trait IPhotoView extends StObject {
          
          def canZoom(): Boolean = js.native
          
          def getDisplayMatrix(): Matrix = js.native
          
          def getDisplayRect(): RectF = js.native
          
          def getIPhotoViewImplementation(): IPhotoView = js.native
          
          def getMaxScale(): Double = js.native
          
          def getMaximumScale(): Double = js.native
          
          def getMediumScale(): Double = js.native
          
          def getMidScale(): Double = js.native
          
          def getMinScale(): Double = js.native
          
          def getMinimumScale(): Double = js.native
          
          def getOnPhotoTapListener(): OnPhotoTapListener = js.native
          
          def getOnViewTapListener(): OnViewTapListener = js.native
          
          def getScale(): Double = js.native
          
          def getScaleType(): ScaleType = js.native
          
          def getVisibleRectangleBitmap(): Canvas = js.native
          
          def setAllowParentInterceptOnEdge(allow: Boolean): Unit = js.native
          
          def setDisplayMatrix(finalMatrix: Matrix): Boolean = js.native
          
          def setMaxScale(maxScale: Double): Unit = js.native
          
          def setMaximumScale(maximumScale: Double): Unit = js.native
          
          def setMediumScale(mediumScale: Double): Unit = js.native
          
          def setMidScale(midScale: Double): Unit = js.native
          
          def setMinScale(minScale: Double): Unit = js.native
          
          def setMinimumScale(minimumScale: Double): Unit = js.native
          
          def setOnDoubleTapListener(newOnDoubleTapListener: OnDoubleTapListener): Unit = js.native
          
          def setOnLongClickListener(listener: OnLongClickListener): Unit = js.native
          
          def setOnMatrixChangeListener(listener: OnMatrixChangedListener): Unit = js.native
          
          def setOnPhotoTapListener(listener: OnPhotoTapListener): Unit = js.native
          
          def setOnScaleChangeListener(onScaleChangeListener: OnScaleChangeListener): Unit = js.native
          
          def setOnViewTapListener(listener: OnViewTapListener): Unit = js.native
          
          def setPhotoViewRotation(rotationDegree: Double): Unit = js.native
          
          def setRotationBy(rotationDegree: Double): Unit = js.native
          
          def setRotationTo(rotationDegree: Double): Unit = js.native
          
          def setScale(scale: Double): Unit = js.native
          def setScale(scale: Double, animate: Boolean): Unit = js.native
          def setScale(scale: Double, focalX: Double, focalY: Double, animate: Boolean): Unit = js.native
          
          def setScaleLevels(minimumScale: Double, mediumScale: Double, maximumScale: Double): Unit = js.native
          
          def setScaleType(scaleType: ScaleType): Unit = js.native
          
          def setZoomTransitionDuration(milliseconds: Double): Unit = js.native
          
          def setZoomable(zoomable: Boolean): Unit = js.native
        }
        
        @js.native
        trait PhotoView
          extends ImageView
             with IPhotoView {
          
          /* InferMemberOverrides */
          override def getScaleType(): ScaleType = js.native
          
          /* protected */ def init(): Unit = js.native
          
          var mAttacher: js.Any = js.native
          
          var mPendingScaleType: js.Any = js.native
          
          /* InferMemberOverrides */
          override def setOnLongClickListener(listener: OnLongClickListener): Unit = js.native
          
          def setScale(scale: Double, focalX: Double, focalY: Double): Unit = js.native
          
          /* InferMemberOverrides */
          override def setScaleType(scaleType: ScaleType): Unit = js.native
        }
        
        @js.native
        trait PhotoViewAttacher
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
          
          def onDrag(dx: Double, dy: Double): Unit = js.native
          
          def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit = js.native
          
          def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
          
          /* private */ def resetMatrix(): js.Any = js.native
          
          /* private */ def setImageViewMatrix(matrix: js.Any): js.Any = js.native
          
          def setScale(scale: Double, focalX: Double, focalY: Double): Unit = js.native
          
          /* private */ def setScale_2(scale: js.Any, animate: js.Any): js.Any = js.native
          
          /* private */ def setScale_4(scale: js.Any, focalX: js.Any, focalY: js.Any, animate: js.Any): js.Any = js.native
          
          def update(): Unit = js.native
          
          /* private */ def updateBaseMatrix(d: js.Any): js.Any = js.native
        }
        object PhotoViewAttacher {
          
          @js.native
          trait AnimatedZoomRunnable extends Runnable {
            
            var _PhotoViewAttacher_this: PhotoViewAttacher = js.native
            
            /* private */ def interpolate(): js.Any = js.native
            
            var mFocalX: js.Any = js.native
            
            var mFocalY: js.Any = js.native
            
            var mStartTime: js.Any = js.native
            
            var mZoomEnd: js.Any = js.native
            
            var mZoomStart: js.Any = js.native
          }
          object AnimatedZoomRunnable {
            
            @scala.inline
            def apply(
              _PhotoViewAttacher_this: PhotoViewAttacher,
              interpolate: () => js.Any,
              mFocalX: js.Any,
              mFocalY: js.Any,
              mStartTime: js.Any,
              mZoomEnd: js.Any,
              mZoomStart: js.Any,
              run: () => js.Any
            ): AnimatedZoomRunnable = {
              val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], interpolate = js.Any.fromFunction0(interpolate), mFocalX = mFocalX.asInstanceOf[js.Any], mFocalY = mFocalY.asInstanceOf[js.Any], mStartTime = mStartTime.asInstanceOf[js.Any], mZoomEnd = mZoomEnd.asInstanceOf[js.Any], mZoomStart = mZoomStart.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
              __obj.asInstanceOf[AnimatedZoomRunnable]
            }
            
            @scala.inline
            implicit class AnimatedZoomRunnableMutableBuilder[Self <: AnimatedZoomRunnable] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setInterpolate(value: () => js.Any): Self = StObject.set(x, "interpolate", js.Any.fromFunction0(value))
              
              @scala.inline
              def setMFocalX(value: js.Any): Self = StObject.set(x, "mFocalX", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMFocalY(value: js.Any): Self = StObject.set(x, "mFocalY", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMStartTime(value: js.Any): Self = StObject.set(x, "mStartTime", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMZoomEnd(value: js.Any): Self = StObject.set(x, "mZoomEnd", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMZoomStart(value: js.Any): Self = StObject.set(x, "mZoomStart", value.asInstanceOf[js.Any])
              
              @scala.inline
              def set_PhotoViewAttacher_this(value: PhotoViewAttacher): Self = StObject.set(x, "_PhotoViewAttacher_this", value.asInstanceOf[js.Any])
            }
          }
          
          @js.native
          trait DefaultOnDoubleTapListener extends OnDoubleTapListener {
            
            var photoViewAttacher: js.Any = js.native
            
            def setPhotoViewAttacher(newPhotoViewAttacher: PhotoViewAttacher): Unit = js.native
          }
          object DefaultOnDoubleTapListener {
            
            @scala.inline
            def apply(
              onDoubleTap: MotionEvent => Boolean,
              onDoubleTapEvent: MotionEvent => Boolean,
              onSingleTapConfirmed: MotionEvent => Boolean,
              photoViewAttacher: js.Any,
              setPhotoViewAttacher: PhotoViewAttacher => Unit
            ): DefaultOnDoubleTapListener = {
              val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed), photoViewAttacher = photoViewAttacher.asInstanceOf[js.Any], setPhotoViewAttacher = js.Any.fromFunction1(setPhotoViewAttacher))
              __obj.asInstanceOf[DefaultOnDoubleTapListener]
            }
            
            @scala.inline
            implicit class DefaultOnDoubleTapListenerMutableBuilder[Self <: DefaultOnDoubleTapListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setPhotoViewAttacher(value: js.Any): Self = StObject.set(x, "photoViewAttacher", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setSetPhotoViewAttacher(value: PhotoViewAttacher => Unit): Self = StObject.set(x, "setPhotoViewAttacher", js.Any.fromFunction1(value))
            }
          }
          
          @js.native
          trait FlingRunnable extends Runnable {
            
            var _PhotoViewAttacher_this: PhotoViewAttacher = js.native
            
            def cancelFling(): Unit = js.native
            
            def fling(viewWidth: Double, viewHeight: Double, velocityX: Double, velocityY: Double): Unit = js.native
            
            var mCurrentX: js.Any = js.native
            
            var mCurrentY: js.Any = js.native
            
            var mScroller: js.Any = js.native
          }
          object FlingRunnable {
            
            @scala.inline
            def apply(
              _PhotoViewAttacher_this: PhotoViewAttacher,
              cancelFling: () => Unit,
              fling: (Double, Double, Double, Double) => Unit,
              mCurrentX: js.Any,
              mCurrentY: js.Any,
              mScroller: js.Any,
              run: () => js.Any
            ): FlingRunnable = {
              val __obj = js.Dynamic.literal(_PhotoViewAttacher_this = _PhotoViewAttacher_this.asInstanceOf[js.Any], cancelFling = js.Any.fromFunction0(cancelFling), fling = js.Any.fromFunction4(fling), mCurrentX = mCurrentX.asInstanceOf[js.Any], mCurrentY = mCurrentY.asInstanceOf[js.Any], mScroller = mScroller.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
              __obj.asInstanceOf[FlingRunnable]
            }
            
            @scala.inline
            implicit class FlingRunnableMutableBuilder[Self <: FlingRunnable] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setCancelFling(value: () => Unit): Self = StObject.set(x, "cancelFling", js.Any.fromFunction0(value))
              
              @scala.inline
              def setFling(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "fling", js.Any.fromFunction4(value))
              
              @scala.inline
              def setMCurrentX(value: js.Any): Self = StObject.set(x, "mCurrentX", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMCurrentY(value: js.Any): Self = StObject.set(x, "mCurrentY", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setMScroller(value: js.Any): Self = StObject.set(x, "mScroller", value.asInstanceOf[js.Any])
              
              @scala.inline
              def set_PhotoViewAttacher_this(value: PhotoViewAttacher): Self = StObject.set(x, "_PhotoViewAttacher_this", value.asInstanceOf[js.Any])
            }
          }
          
          @js.native
          trait OnMatrixChangedListener extends StObject {
            
            def onMatrixChanged(rect: RectF): Unit = js.native
          }
          object OnMatrixChangedListener {
            
            @scala.inline
            def apply(onMatrixChanged: RectF => Unit): OnMatrixChangedListener = {
              val __obj = js.Dynamic.literal(onMatrixChanged = js.Any.fromFunction1(onMatrixChanged))
              __obj.asInstanceOf[OnMatrixChangedListener]
            }
            
            @scala.inline
            implicit class OnMatrixChangedListenerMutableBuilder[Self <: OnMatrixChangedListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setOnMatrixChanged(value: RectF => Unit): Self = StObject.set(x, "onMatrixChanged", js.Any.fromFunction1(value))
            }
          }
          
          @js.native
          trait OnPhotoTapListener extends StObject {
            
            def onPhotoTap(view: View, x: Double, y: Double): Unit = js.native
          }
          object OnPhotoTapListener {
            
            @scala.inline
            def apply(onPhotoTap: (View, Double, Double) => Unit): OnPhotoTapListener = {
              val __obj = js.Dynamic.literal(onPhotoTap = js.Any.fromFunction3(onPhotoTap))
              __obj.asInstanceOf[OnPhotoTapListener]
            }
            
            @scala.inline
            implicit class OnPhotoTapListenerMutableBuilder[Self <: OnPhotoTapListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setOnPhotoTap(value: (View, Double, Double) => Unit): Self = StObject.set(x, "onPhotoTap", js.Any.fromFunction3(value))
            }
          }
          
          @js.native
          trait OnScaleChangeListener extends StObject {
            
            def onScaleChange(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
          }
          object OnScaleChangeListener {
            
            @scala.inline
            def apply(onScaleChange: (Double, Double, Double) => Unit): OnScaleChangeListener = {
              val __obj = js.Dynamic.literal(onScaleChange = js.Any.fromFunction3(onScaleChange))
              __obj.asInstanceOf[OnScaleChangeListener]
            }
            
            @scala.inline
            implicit class OnScaleChangeListenerMutableBuilder[Self <: OnScaleChangeListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setOnScaleChange(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onScaleChange", js.Any.fromFunction3(value))
            }
          }
          
          @js.native
          trait OnViewTapListener extends StObject {
            
            def onViewTap(view: View, x: Double, y: Double): Unit = js.native
          }
          object OnViewTapListener {
            
            @scala.inline
            def apply(onViewTap: (View, Double, Double) => Unit): OnViewTapListener = {
              val __obj = js.Dynamic.literal(onViewTap = js.Any.fromFunction3(onViewTap))
              __obj.asInstanceOf[OnViewTapListener]
            }
            
            @scala.inline
            implicit class OnViewTapListenerMutableBuilder[Self <: OnViewTapListener] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setOnViewTap(value: (View, Double, Double) => Unit): Self = StObject.set(x, "onViewTap", js.Any.fromFunction3(value))
            }
          }
        }
      }
    }
  }
}
