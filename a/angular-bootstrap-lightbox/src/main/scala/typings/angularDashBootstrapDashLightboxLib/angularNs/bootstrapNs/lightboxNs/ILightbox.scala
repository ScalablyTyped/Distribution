package typings
package angularDashBootstrapDashLightboxLib.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightbox extends js.Object {
  def openModal(images: js.Array[ILightboxImageInfo], index: scala.Double): scala.Unit
}

object ILightbox {
  @scala.inline
  def apply(openModal: (js.Array[ILightboxImageInfo], scala.Double) => scala.Unit): ILightbox = {
    val __obj = js.Dynamic.literal(openModal = js.Any.fromFunction2(openModal))
  
    __obj.asInstanceOf[ILightbox]
  }
}

