package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.AnimatedZoomRunnable")
@js.native
class AnimatedZoomRunnable protected () extends Runnable {
  def this(
    arg: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher,
    currentZoom: Double,
    targetZoom: Double,
    focalX: Double,
    focalY: Double
  ) = this()
  var _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  var mFocalX: js.Any = js.native
  var mFocalY: js.Any = js.native
  var mStartTime: js.Any = js.native
  var mZoomEnd: js.Any = js.native
  var mZoomStart: js.Any = js.native
  /* private */ def interpolate(): js.Any = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

