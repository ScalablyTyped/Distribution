package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AttachmentsViewModel
import typings.arcgisJsApi.esri.AttachmentsViewModelConstructor
import typings.arcgisJsApi.esri.AttachmentsViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentsViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Attachments/AttachmentsViewModel", JSImport.Namespace)
  @js.native
  val ^ : AttachmentsViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attachments/AttachmentsViewModel", JSImport.Namespace)
  @js.native
  class Class () extends AttachmentsViewModel {
    def this(properties: AttachmentsViewModelProperties) = this()
  }
  
  type _To = AttachmentsViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentsViewModelMod.foo` */
  override def _to: AttachmentsViewModelConstructor = ^
}
