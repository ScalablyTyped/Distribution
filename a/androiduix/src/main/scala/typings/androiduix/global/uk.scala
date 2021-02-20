package typings.androiduix.global

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.android.widget.ImageView
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uk {
  
  object co {
    
    object senab {
      
      object photoview {
        
        @JSGlobal("uk.co.senab.photoview.GestureDetector")
        @js.native
        class GestureDetector ()
          extends typings.androiduix.uk.co.senab.photoview.GestureDetector
        object GestureDetector {
          
          @JSGlobal("uk.co.senab.photoview.GestureDetector")
          @js.native
          val ^ : js.Any = js.native
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.GestureDetector.INVALID_POINTER_ID")
          @js.native
          def INVALID_POINTER_ID: js.Any = js.native
          @scala.inline
          def INVALID_POINTER_ID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER_ID")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.GestureDetector.LOG_TAG")
          @js.native
          def LOG_TAG: js.Any = js.native
          @scala.inline
          def LOG_TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_TAG")(x.asInstanceOf[js.Any])
        }
        
        object IPhotoView {
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView.DEFAULT_MAX_SCALE")
          @js.native
          def DEFAULT_MAX_SCALE: Double = js.native
          @scala.inline
          def DEFAULT_MAX_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_SCALE")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView.DEFAULT_MID_SCALE")
          @js.native
          def DEFAULT_MID_SCALE: Double = js.native
          @scala.inline
          def DEFAULT_MID_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MID_SCALE")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView.DEFAULT_MIN_SCALE")
          @js.native
          def DEFAULT_MIN_SCALE: Double = js.native
          @scala.inline
          def DEFAULT_MIN_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_SCALE")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView.DEFAULT_ZOOM_DURATION")
          @js.native
          def DEFAULT_ZOOM_DURATION: Double = js.native
          @scala.inline
          def DEFAULT_ZOOM_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ZOOM_DURATION")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.IPhotoView.isImpl")
          @js.native
          def isImpl(obj: js.Any): Boolean = js.native
        }
        
        @JSGlobal("uk.co.senab.photoview.PhotoView")
        @js.native
        class PhotoView protected ()
          extends typings.androiduix.uk.co.senab.photoview.PhotoView {
          def this(context: Context) = this()
          def this(context: Context, bindElement: HTMLElement) = this()
          def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
          def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
        }
        
        @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
        @js.native
        class PhotoViewAttacher protected ()
          extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher {
          def this(imageView: ImageView) = this()
          def this(imageView: ImageView, zoomable: Boolean) = this()
        }
        object PhotoViewAttacher {
          
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.AnimatedZoomRunnable")
          @js.native
          class AnimatedZoomRunnable protected ()
            extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.AnimatedZoomRunnable {
            def this(
              arg: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
              currentZoom: Double,
              targetZoom: Double,
              focalX: Double,
              focalY: Double
            ) = this()
          }
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.DEBUG")
          @js.native
          def DEBUG: js.Any = js.native
          @scala.inline
          def DEBUG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.DefaultOnDoubleTapListener")
          @js.native
          class DefaultOnDoubleTapListener protected ()
            extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.DefaultOnDoubleTapListener {
            def this(photoViewAttacher: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
          }
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.EDGE_BOTH")
          @js.native
          def EDGE_BOTH: Double = js.native
          @scala.inline
          def EDGE_BOTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_BOTH")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.EDGE_LEFT")
          @js.native
          def EDGE_LEFT: Double = js.native
          @scala.inline
          def EDGE_LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_LEFT")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.EDGE_NONE")
          @js.native
          def EDGE_NONE: Double = js.native
          @scala.inline
          def EDGE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_NONE")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.EDGE_RIGHT")
          @js.native
          def EDGE_RIGHT: Double = js.native
          @scala.inline
          def EDGE_RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDGE_RIGHT")(x.asInstanceOf[js.Any])
          
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable")
          @js.native
          class FlingRunnable protected ()
            extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable {
            def this(arg: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
          }
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.LOG_TAG")
          @js.native
          def LOG_TAG: js.Any = js.native
          @scala.inline
          def LOG_TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_TAG")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.checkZoomLevels")
          @js.native
          def checkZoomLevels(minZoom: js.Any, midZoom: js.Any, maxZoom: js.Any): js.Any = js.native
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.hasDrawable")
          @js.native
          def hasDrawable(imageView: js.Any): js.Any = js.native
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.isSupportedScaleType")
          @js.native
          def isSupportedScaleType(scaleType: js.Any): js.Any = js.native
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.sInterpolator")
          @js.native
          def sInterpolator: Interpolator = js.native
          @scala.inline
          def sInterpolator_=(x: Interpolator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sInterpolator")(x.asInstanceOf[js.Any])
          
          /* static member */
          @JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.setImageViewScaleTypeMatrix")
          @js.native
          def setImageViewScaleTypeMatrix(imageView: js.Any): js.Any = js.native
        }
      }
    }
  }
}
