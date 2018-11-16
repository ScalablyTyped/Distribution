package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.FlingRunnable")
@js.native
class FlingRunnable protected ()
  extends androiduixLib.javaNs.langNs.Runnable {
  def this(arg: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacher) = this()
  var _PhotoViewAttacher_this: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacher = js.native
  var mCurrentX: js.Any = js.native
  var mCurrentY: js.Any = js.native
  var mScroller: js.Any = js.native
  def cancelFling(): scala.Unit = js.native
  def fling(
    viewWidth: scala.Double,
    viewHeight: scala.Double,
    velocityX: scala.Double,
    velocityY: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

