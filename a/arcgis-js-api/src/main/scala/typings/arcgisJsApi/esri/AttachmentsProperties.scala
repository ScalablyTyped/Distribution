package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Configures the attachment editing functionality that can be performed by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#capabilities)
  		 */
  var capabilities: js.UndefOr[AttachmentsCapabilities] = js.undefined
  
  /**
  		 * A string value indicating how to display an attachment.
  		 *
  		 * @default "auto"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType)
  		 */
  var displayType: js.UndefOr[auto | preview | list] = js.undefined
  
  /**
  		 * The graphic for the attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#graphic)
  		 */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#viewModel)
  		 */
  var viewModel: js.UndefOr[AttachmentsViewModelProperties] = js.undefined
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[VisibleElements] = js.undefined
}
object AttachmentsProperties {
  
  inline def apply(): AttachmentsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentsProperties] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: AttachmentsCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setDisplayType(value: auto | preview | list): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    inline def setViewModel(value: AttachmentsViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setVisibleElements(value: VisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
