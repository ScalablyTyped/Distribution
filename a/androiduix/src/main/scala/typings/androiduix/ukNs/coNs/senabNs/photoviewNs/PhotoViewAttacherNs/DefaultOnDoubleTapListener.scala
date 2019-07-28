package typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import typings.androiduix.androidNs.viewNs.GestureDetectorNs.OnDoubleTapListener
import typings.androiduix.androidNs.viewNs.MotionEvent
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoViewAttacher.DefaultOnDoubleTapListener")
@js.native
class DefaultOnDoubleTapListener protected () extends OnDoubleTapListener {
  def this(photoViewAttacher: PhotoViewAttacher) = this()
  var photoViewAttacher: js.Any = js.native
  /* CompleteClass */
  override def onDoubleTap(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
  def setPhotoViewAttacher(newPhotoViewAttacher: PhotoViewAttacher): Unit = js.native
}

