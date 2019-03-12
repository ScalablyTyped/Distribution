package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPhotoTapListener extends js.Object {
  def onPhotoTap(view: androiduixLib.androidNs.viewNs.View, x: scala.Double, y: scala.Double): scala.Unit
}

object OnPhotoTapListener {
  @scala.inline
  def apply(onPhotoTap: (androiduixLib.androidNs.viewNs.View, scala.Double, scala.Double) => scala.Unit): OnPhotoTapListener = {
    val __obj = js.Dynamic.literal(onPhotoTap = js.Any.fromFunction3(onPhotoTap))
  
    __obj.asInstanceOf[OnPhotoTapListener]
  }
}

