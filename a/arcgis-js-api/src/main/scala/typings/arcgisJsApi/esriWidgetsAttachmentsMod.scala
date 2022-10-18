package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Attachments
import typings.arcgisJsApi.esri.AttachmentsConstructor
import typings.arcgisJsApi.esri.AttachmentsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttachmentsMod extends Shortcut {
  
  @JSImport("esri/widgets/Attachments", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AttachmentsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Attachments", JSImport.Namespace)
  @js.native
  /**
    * This widget allows users to view and edit attachments associated with a feature and is considered a standalone experience that can be utilized in widgets such [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) and [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html)
    */
  open class Class ()
    extends StObject
       with Attachments {
    def this(properties: AttachmentsProperties) = this()
  }
  
  type _To = js.Object & AttachmentsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsAttachmentsMod.foo` */
  override def _to: js.Object & AttachmentsConstructor = ^
}
