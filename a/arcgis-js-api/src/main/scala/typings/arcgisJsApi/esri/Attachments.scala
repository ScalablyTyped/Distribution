package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends Widget_ {
  /**
    * A string value indicating how to display the attachment.  If `list` is specified, attachments show as links. If `preview` is specified, a thumbnail of each attachment will be shown.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
    *
    * @default "list"
    */
  var displayType: preview | list = js.native
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
    */
  var graphic: Graphic = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AttachmentsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
    */
  var viewModel: AttachmentsViewModel = js.native
}

@JSGlobal("__esri.Attachments")
@js.native
object Attachments extends TopLevel[AttachmentsConstructor]

