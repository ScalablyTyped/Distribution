package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Attachments
import typings.arcgisJsApi.esri.AttachmentsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAttachmentsMod {
  
  @JSImport("esri/widgets/Attachments", JSImport.Namespace)
  @js.native
  /**
  		 * This widget allows users to view and edit attachments associated with a feature and is considered a standalone experience that can be utilized in widgets such [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) and [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html)
  		 */
  open class ^ ()
    extends StObject
       with Attachments {
    def this(properties: AttachmentsProperties) = this()
  }
}
