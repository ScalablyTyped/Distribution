package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable")
@js.native
class FlingRunnable protected () extends Runnable {
  def this(arg: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher) = this()
  var _PhotoViewAttacher_this: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher = js.native
  var mCurrentX: js.Any = js.native
  var mCurrentY: js.Any = js.native
  var mScroller: js.Any = js.native
  def cancelFling(): Unit = js.native
  def fling(viewWidth: Double, viewHeight: Double, velocityX: Double, velocityY: Double): Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

