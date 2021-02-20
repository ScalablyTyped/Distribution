package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AttachmentInfo
import typings.arcgisJsApi.esri.AttachmentInfoConstructor
import typings.arcgisJsApi.esri.AttachmentInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachmentInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  val ^ : AttachmentInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/AttachmentInfo", JSImport.Namespace)
  @js.native
  /**
    * The `AttachmentInfo` class returns information about attachments associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html)
    */
  class Class () extends AttachmentInfo {
    def this(properties: AttachmentInfoProperties) = this()
  }
  
  type _To = AttachmentInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `attachmentInfoMod.foo` */
  override def _to: AttachmentInfoConstructor = ^
}
