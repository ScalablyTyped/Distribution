package typings.angularDashBootstrapDashLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightbox extends js.Object {
  def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit
}

object ILightbox {
  @scala.inline
  def apply(openModal: (js.Array[ILightboxImageInfo], Double) => Unit): ILightbox = {
    val __obj = js.Dynamic.literal(openModal = js.Any.fromFunction2(openModal))
  
    __obj.asInstanceOf[ILightbox]
  }
}

