package typings.androiduix.android.widget.RatingBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRatingBarChangeListener extends js.Object {
  def onRatingChanged(ratingBar: typings.androiduix.android.widget.RatingBar, rating: Double, fromUser: Boolean): Unit
}

object OnRatingBarChangeListener {
  @scala.inline
  def apply(onRatingChanged: (typings.androiduix.android.widget.RatingBar, Double, Boolean) => Unit): OnRatingBarChangeListener = {
    val __obj = js.Dynamic.literal(onRatingChanged = js.Any.fromFunction3(onRatingChanged))
  
    __obj.asInstanceOf[OnRatingBarChangeListener]
  }
}

