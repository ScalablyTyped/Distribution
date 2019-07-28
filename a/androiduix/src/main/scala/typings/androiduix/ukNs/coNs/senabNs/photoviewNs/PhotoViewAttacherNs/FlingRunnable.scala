package typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import typings.androiduix.javaNs.langNs.Runnable
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable")
@js.native
class FlingRunnable protected () extends Runnable {
  def this(arg: PhotoViewAttacher) = this()
  var _PhotoViewAttacher_this: PhotoViewAttacher = js.native
  var mCurrentX: js.Any = js.native
  var mCurrentY: js.Any = js.native
  var mScroller: js.Any = js.native
  def cancelFling(): Unit = js.native
  def fling(viewWidth: Double, viewHeight: Double, velocityX: Double, velocityY: Double): Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

