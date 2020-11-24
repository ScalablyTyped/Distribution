package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsProperties extends WidgetProperties {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.native
  
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
    */
  var viewModel: js.UndefOr[AttachmentsViewModelProperties] = js.native
}
object AttachmentsProperties {
  
  @scala.inline
  def apply(): AttachmentsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsProperties]
  }
  
  @scala.inline
  implicit class AttachmentsPropertiesOps[Self <: AttachmentsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayType(value: preview | list): Self = this.set("displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = this.set("graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphic: Self = this.set("graphic", js.undefined)
    
    @scala.inline
    def setViewModel(value: AttachmentsViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
