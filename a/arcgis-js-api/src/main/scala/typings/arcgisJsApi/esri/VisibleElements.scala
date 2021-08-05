package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether to the base layers will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#VisibleElements)
    */
  var baseLayers: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElements]
  }
  
  extension [Self <: VisibleElements](x: Self) {
    
    inline def setBaseLayers(value: Boolean): Self = StObject.set(x, "baseLayers", value.asInstanceOf[js.Any])
    
    inline def setBaseLayersUndefined: Self = StObject.set(x, "baseLayers", js.undefined)
    
    inline def setReferenceLayers(value: Boolean): Self = StObject.set(x, "referenceLayers", value.asInstanceOf[js.Any])
    
    inline def setReferenceLayersUndefined: Self = StObject.set(x, "referenceLayers", js.undefined)
    
    inline def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
