package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.attachments
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import typings.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
  		 * Describes the attachment's content in detail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#description)
  		 */
  var description: String = js.native
  
  /**
  		 * A string value indicating how to display an attachment.
  		 *
  		 * @default "auto"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
  		 */
  var displayType: auto | preview | list = js.native
  
  /**
  		 * A heading indicating what the attachment's content represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * The type of popup element displayed.
  		 *
  		 * @default attachments
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#type)
  		 */
  @JSName("type")
  val type_AttachmentsContent: attachments = js.native
}
