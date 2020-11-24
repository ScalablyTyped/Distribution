package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.drawer
import typings.arcgisJsApi.arcgisJsApiStrings.floating
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandProperties extends WidgetProperties {
  
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
    */
  var autoCollapse: js.UndefOr[Boolean] = js.native
  
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
    */
  var collapseIconClass: js.UndefOr[String] = js.native
  
  /**
    * Tooltip to display to indicate Expand widget can be collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
    */
  var collapseTooltip: js.UndefOr[String] = js.native
  
  /**
    * The content to display within the expanded Expand widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
    */
  var content: js.UndefOr[Node | String | WidgetProperties] = js.native
  
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
    */
  var expandIconClass: js.UndefOr[String] = js.native
  
  /**
    * Tooltip to display to indicate Expand widget can be expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
    */
  var expandTooltip: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the widget is currently expanded or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
    */
  var iconNumber: js.UndefOr[Double] = js.native
  
  /**
    * The mode in which the widget displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#mode)
    */
  var mode: js.UndefOr[auto | floating | drawer] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
    */
  var viewModel: js.UndefOr[ExpandViewModelProperties] = js.native
}
object ExpandProperties {
  
  @scala.inline
  def apply(): ExpandProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandProperties]
  }
  
  @scala.inline
  implicit class ExpandPropertiesOps[Self <: ExpandProperties] (val x: Self) extends AnyVal {
    
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
    def setAutoCollapse(value: Boolean): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    
    @scala.inline
    def setCollapseIconClass(value: String): Self = this.set("collapseIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseIconClass: Self = this.set("collapseIconClass", js.undefined)
    
    @scala.inline
    def setCollapseTooltip(value: String): Self = this.set("collapseTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseTooltip: Self = this.set("collapseTooltip", js.undefined)
    
    @scala.inline
    def setContent(value: Node | String | WidgetProperties): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setExpandIconClass(value: String): Self = this.set("expandIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIconClass: Self = this.set("expandIconClass", js.undefined)
    
    @scala.inline
    def setExpandTooltip(value: String): Self = this.set("expandTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandTooltip: Self = this.set("expandTooltip", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setIconNumber(value: Double): Self = this.set("iconNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconNumber: Self = this.set("iconNumber", js.undefined)
    
    @scala.inline
    def setMode(value: auto | floating | drawer): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: ExpandViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
