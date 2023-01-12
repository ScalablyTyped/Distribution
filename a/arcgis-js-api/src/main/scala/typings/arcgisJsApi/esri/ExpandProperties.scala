package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.drawer
import typings.arcgisJsApi.arcgisJsApiStrings.floating
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#autoCollapse)
    */
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, the Expand widget will close after the Escape key is pressed when the keyboard focus is within its content.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#closeOnEsc)
    */
  var closeOnEsc: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseIconClass)
    */
  var collapseIconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Tooltip to display to indicate Expand widget can be collapsed.
    *
    * @default "Collapse" (English locale)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#collapseTooltip)
    */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * The content to display within the expanded Expand widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#content)
    */
  var content: js.UndefOr[Node | String | WidgetProperties] = js.undefined
  
  /**
    * Icon font used to style the Expand button.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandIconClass)
    */
  var expandIconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Tooltip to display to indicate Expand widget can be expanded.
    *
    * @default "Expand" (English locale)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expandTooltip)
    */
  var expandTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the widget is currently expanded or not.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#expanded)
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#group)
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * A number to display at the corner of the widget to indicate the number of, for example, open issues or unread notices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#iconNumber)
    */
  var iconNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * The mode in which the widget displays.
    *
    * @default "auto"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#mode)
    */
  var mode: js.UndefOr[auto | floating | drawer] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand.html#viewModel)
    */
  var viewModel: js.UndefOr[ExpandViewModelProperties] = js.undefined
}
object ExpandProperties {
  
  inline def apply(): ExpandProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandProperties] (val x: Self) extends AnyVal {
    
    inline def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    inline def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    inline def setCloseOnEsc(value: Boolean | js.Function): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
    
    inline def setCollapseIconClass(value: String): Self = StObject.set(x, "collapseIconClass", value.asInstanceOf[js.Any])
    
    inline def setCollapseIconClassUndefined: Self = StObject.set(x, "collapseIconClass", js.undefined)
    
    inline def setCollapseTooltip(value: String): Self = StObject.set(x, "collapseTooltip", value.asInstanceOf[js.Any])
    
    inline def setCollapseTooltipUndefined: Self = StObject.set(x, "collapseTooltip", js.undefined)
    
    inline def setContent(value: Node | String | WidgetProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setExpandIconClass(value: String): Self = StObject.set(x, "expandIconClass", value.asInstanceOf[js.Any])
    
    inline def setExpandIconClassUndefined: Self = StObject.set(x, "expandIconClass", js.undefined)
    
    inline def setExpandTooltip(value: String): Self = StObject.set(x, "expandTooltip", value.asInstanceOf[js.Any])
    
    inline def setExpandTooltipUndefined: Self = StObject.set(x, "expandTooltip", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIconNumber(value: Double): Self = StObject.set(x, "iconNumber", value.asInstanceOf[js.Any])
    
    inline def setIconNumberUndefined: Self = StObject.set(x, "iconNumber", js.undefined)
    
    inline def setMode(value: auto | floating | drawer): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: ExpandViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
