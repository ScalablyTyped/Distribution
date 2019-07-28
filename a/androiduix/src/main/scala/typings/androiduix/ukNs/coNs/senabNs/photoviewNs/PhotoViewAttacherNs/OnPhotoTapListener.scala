package typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPhotoTapListener extends js.Object {
  def onPhotoTap(view: View, x: Double, y: Double): Unit
}

object OnPhotoTapListener {
  @scala.inline
  def apply(onPhotoTap: (View, Double, Double) => Unit): OnPhotoTapListener = {
    val __obj = js.Dynamic.literal(onPhotoTap = js.Any.fromFunction3(onPhotoTap))
  
    __obj.asInstanceOf[OnPhotoTapListener]
  }
}

