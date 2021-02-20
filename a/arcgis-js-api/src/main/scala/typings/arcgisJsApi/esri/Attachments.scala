package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends Widget_ {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
    */
  var displayType: preview | list = js.native
  
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
    */
  var graphic: Graphic = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
    */
  var viewModel: AttachmentsViewModel = js.native
}
