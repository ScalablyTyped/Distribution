package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments
  extends StObject
     with Widget_ {
  
  /**
  		 * Configures the attachment editing functionality that can be performed by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#capabilities)
  		 */
  var capabilities: AttachmentsCapabilities = js.native
  
  /**
  		 * A string value indicating how to display an attachment.
  		 *
  		 * @default "auto"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
  		 */
  var displayType: auto | preview | list = js.native
  
  /**
  		 * The graphic for the attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
  		 */
  var graphic: Graphic = js.native
  
  /**
  		 * Indicates whether there is currently an attachment being added, updated or deleted.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#submitting)
  		 */
  val submitting: Boolean = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
  		 */
  var viewModel: AttachmentsViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#visibleElements)
  		 */
  var visibleElements: VisibleElements = js.native
}
