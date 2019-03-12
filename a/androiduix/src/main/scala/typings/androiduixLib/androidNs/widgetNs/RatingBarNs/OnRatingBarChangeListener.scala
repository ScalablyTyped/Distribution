package typings
package androiduixLib.androidNs.widgetNs.RatingBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRatingBarChangeListener extends js.Object {
  def onRatingChanged(
    ratingBar: androiduixLib.androidNs.widgetNs.RatingBar,
    rating: scala.Double,
    fromUser: scala.Boolean
  ): scala.Unit
}

object OnRatingBarChangeListener {
  @scala.inline
  def apply(
    onRatingChanged: (androiduixLib.androidNs.widgetNs.RatingBar, scala.Double, scala.Boolean) => scala.Unit
  ): OnRatingBarChangeListener = {
    val __obj = js.Dynamic.literal(onRatingChanged = js.Any.fromFunction3(onRatingChanged))
  
    __obj.asInstanceOf[OnRatingBarChangeListener]
  }
}

