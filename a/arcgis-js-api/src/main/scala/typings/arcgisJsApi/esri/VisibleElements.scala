package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElements extends StObject {
  
  /**
    * Indicates whether to the base layers will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var baseLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * _Since 4.25_ Indicates whether layer load errors will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to the reference layers will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var referenceLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to the status indicators will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}
object VisibleElements {
  
  inline def apply(): VisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElements] (val x: Self) extends AnyVal {
    
    inline def setBaseLayers(value: Boolean): Self = StObject.set(x, "baseLayers", value.asInstanceOf[js.Any])
    
    inline def setBaseLayersUndefined: Self = StObject.set(x, "baseLayers", js.undefined)
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setReferenceLayers(value: Boolean): Self = StObject.set(x, "referenceLayers", value.asInstanceOf[js.Any])
    
    inline def setReferenceLayersUndefined: Self = StObject.set(x, "referenceLayers", js.undefined)
    
    inline def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
