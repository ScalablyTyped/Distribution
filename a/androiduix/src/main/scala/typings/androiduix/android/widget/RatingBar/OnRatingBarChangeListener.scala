package typings.androiduix.android.widget.RatingBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRatingBarChangeListener extends js.Object {
  def onRatingChanged(ratingBar: typings.androiduix.android.widget.RatingBar, rating: Double, fromUser: Boolean): Unit = js.native
}

object OnRatingBarChangeListener {
  @scala.inline
  def apply(onRatingChanged: (typings.androiduix.android.widget.RatingBar, Double, Boolean) => Unit): OnRatingBarChangeListener = {
    val __obj = js.Dynamic.literal(onRatingChanged = js.Any.fromFunction3(onRatingChanged))
    __obj.asInstanceOf[OnRatingBarChangeListener]
  }
  @scala.inline
  implicit class OnRatingBarChangeListenerOps[Self <: OnRatingBarChangeListener] (val x: Self) extends AnyVal {
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
    def setOnRatingChanged(value: (typings.androiduix.android.widget.RatingBar, Double, Boolean) => Unit): Self = this.set("onRatingChanged", js.Any.fromFunction3(value))
  }
  
}

