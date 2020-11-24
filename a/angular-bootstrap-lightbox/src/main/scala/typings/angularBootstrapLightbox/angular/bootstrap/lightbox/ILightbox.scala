package typings.angularBootstrapLightbox.angular.bootstrap.lightbox

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightbox extends js.Object {
  
  def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit = js.native
  def openModal(
    images: js.Array[ILightboxImageInfo],
    index: Double,
     // angular.ui.bootstrap.IModalSettings
  modalParams: StringDictionary[js.Any]
  ): Unit = js.native
}
