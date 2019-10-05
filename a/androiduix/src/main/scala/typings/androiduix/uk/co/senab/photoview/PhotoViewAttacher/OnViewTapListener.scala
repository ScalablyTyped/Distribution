package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnViewTapListener extends js.Object {
  def onViewTap(view: View, x: Double, y: Double): Unit
}

object OnViewTapListener {
  @scala.inline
  def apply(onViewTap: (View, Double, Double) => Unit): OnViewTapListener = {
    val __obj = js.Dynamic.literal(onViewTap = js.Any.fromFunction3(onViewTap))
  
    __obj.asInstanceOf[OnViewTapListener]
  }
}

