package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.view.GestureDetector.OnDoubleTapListener
import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOnDoubleTapListener extends OnDoubleTapListener {
  var photoViewAttacher: js.Any = js.native
  def setPhotoViewAttacher(newPhotoViewAttacher: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher): Unit = js.native
}

object DefaultOnDoubleTapListener {
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => Boolean,
    onDoubleTapEvent: MotionEvent => Boolean,
    onSingleTapConfirmed: MotionEvent => Boolean,
    photoViewAttacher: js.Any,
    setPhotoViewAttacher: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher => Unit
  ): DefaultOnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed), photoViewAttacher = photoViewAttacher.asInstanceOf[js.Any], setPhotoViewAttacher = js.Any.fromFunction1(setPhotoViewAttacher))
    __obj.asInstanceOf[DefaultOnDoubleTapListener]
  }
  @scala.inline
  implicit class DefaultOnDoubleTapListenerOps[Self <: DefaultOnDoubleTapListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhotoViewAttacher(value: js.Any): Self = this.set("photoViewAttacher", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPhotoViewAttacher(value: typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher => Unit): Self = this.set("setPhotoViewAttacher", js.Any.fromFunction1(value))
  }
  
}

