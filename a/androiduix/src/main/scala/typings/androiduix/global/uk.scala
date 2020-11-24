package typings.androiduix.global

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.animation.Interpolator
import typings.androiduix.android.widget.ImageView
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("uk")
@js.native
object uk extends js.Object {
  
  @js.native
  object co extends js.Object {
    
    @js.native
    object senab extends js.Object {
      
      @js.native
      object photoview extends js.Object {
        
        @js.native
        class GestureDetector ()
          extends typings.androiduix.uk.co.senab.photoview.GestureDetector
        /* static members */
        @js.native
        object GestureDetector extends js.Object {
          
          var INVALID_POINTER_ID: js.Any = js.native
          
          var LOG_TAG: js.Any = js.native
        }
        
        @js.native
        object IPhotoView extends js.Object {
          
          var DEFAULT_MAX_SCALE: Double = js.native
          
          var DEFAULT_MID_SCALE: Double = js.native
          
          var DEFAULT_MIN_SCALE: Double = js.native
          
          var DEFAULT_ZOOM_DURATION: Double = js.native
          
          def isImpl(obj: js.Any): Boolean = js.native
        }
        
        @js.native
        class PhotoView protected ()
          extends typings.androiduix.uk.co.senab.photoview.PhotoView {
          def this(context: Context) = this()
          def this(context: Context, bindElement: HTMLElement) = this()
          def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
          def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
        }
        
        @js.native
        class PhotoViewAttacher protected ()
          extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher {
          def this(imageView: ImageView) = this()
          def this(imageView: ImageView, zoomable: Boolean) = this()
        }
        /* static members */
        @js.native
        object PhotoViewAttacher extends js.Object {
          
          var DEBUG: js.Any = js.native
          
          var EDGE_BOTH: Double = js.native
          
          var EDGE_LEFT: Double = js.native
          
          var EDGE_NONE: Double = js.native
          
          var EDGE_RIGHT: Double = js.native
          
          var LOG_TAG: js.Any = js.native
          
          /* private */ def checkZoomLevels(minZoom: js.Any, midZoom: js.Any, maxZoom: js.Any): js.Any = js.native
          
          /* private */ def hasDrawable(imageView: js.Any): js.Any = js.native
          
          /* private */ def isSupportedScaleType(scaleType: js.Any): js.Any = js.native
          
          var sInterpolator: Interpolator = js.native
          
          /* private */ def setImageViewScaleTypeMatrix(imageView: js.Any): js.Any = js.native
          
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
          
          @js.native
          class DefaultOnDoubleTapListener protected ()
            extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.DefaultOnDoubleTapListener {
            def this(photoViewAttacher: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
          }
          
          @js.native
          class FlingRunnable protected ()
            extends typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable {
            def this(arg: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
          }
        }
      }
    }
  }
}
