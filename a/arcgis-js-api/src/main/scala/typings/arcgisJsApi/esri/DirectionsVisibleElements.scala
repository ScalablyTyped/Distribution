package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsVisibleElements extends StObject {
  
  /**
    * Indicates whether to a link to the route layer portal-item (if any) will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#VisibleElements)
    */
  var layerDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to the Save As button will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#VisibleElements)
    */
  var saveAsButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to the Save button will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#VisibleElements)
    */
  var saveButton: js.UndefOr[Boolean] = js.undefined
}
object DirectionsVisibleElements {
  
  inline def apply(): DirectionsVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setLayerDetails(value: Boolean): Self = StObject.set(x, "layerDetails", value.asInstanceOf[js.Any])
    
    inline def setLayerDetailsUndefined: Self = StObject.set(x, "layerDetails", js.undefined)
    
    inline def setSaveAsButton(value: Boolean): Self = StObject.set(x, "saveAsButton", value.asInstanceOf[js.Any])
    
    inline def setSaveAsButtonUndefined: Self = StObject.set(x, "saveAsButton", js.undefined)
    
    inline def setSaveButton(value: Boolean): Self = StObject.set(x, "saveButton", value.asInstanceOf[js.Any])
    
    inline def setSaveButtonUndefined: Self = StObject.set(x, "saveButton", js.undefined)
  }
}
