package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.drawer
import typings.arcgisJsApi.arcgisJsApiStrings.floating
import typings.std.Node
import org.scalablytyped.runtime.StObject
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
  implicit class ExpandPropertiesMutableBuilder[Self <: ExpandProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    @scala.inline
    def setCollapseIconClass(value: String): Self = StObject.set(x, "collapseIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseIconClassUndefined: Self = StObject.set(x, "collapseIconClass", js.undefined)
    
    @scala.inline
    def setCollapseTooltip(value: String): Self = StObject.set(x, "collapseTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTooltipUndefined: Self = StObject.set(x, "collapseTooltip", js.undefined)
    
    @scala.inline
    def setContent(value: Node | String | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setExpandIconClass(value: String): Self = StObject.set(x, "expandIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconClassUndefined: Self = StObject.set(x, "expandIconClass", js.undefined)
    
    @scala.inline
    def setExpandTooltip(value: String): Self = StObject.set(x, "expandTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTooltipUndefined: Self = StObject.set(x, "expandTooltip", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setIconNumber(value: Double): Self = StObject.set(x, "iconNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNumberUndefined: Self = StObject.set(x, "iconNumber", js.undefined)
    
    @scala.inline
    def setMode(value: auto | floating | drawer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: ExpandViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
