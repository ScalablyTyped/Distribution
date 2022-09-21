package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsSnappingControlsElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether to display the `enabledToggle` (Enable snapping).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var enabledToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the `featureEnabledToggle` (Feature to feature).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var featureEnabledToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the [FeatureSnappingLayerSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-FeatureSnappingLayerSource.html) layerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var layerList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the `selfEnabledToggle` (Geometry guides).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var selfEnabledToggle: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsSnappingControlsElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VisibleElementsSnappingControlsElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VisibleElementsSnappingControlsElements]
  }
  
  extension [Self <: VisibleElementsSnappingControlsElements](x: Self) {
    
    inline def setEnabledToggle(value: Boolean): Self = StObject.set(x, "enabledToggle", value.asInstanceOf[js.Any])
    
    inline def setEnabledToggleUndefined: Self = StObject.set(x, "enabledToggle", js.undefined)
    
    inline def setFeatureEnabledToggle(value: Boolean): Self = StObject.set(x, "featureEnabledToggle", value.asInstanceOf[js.Any])
    
    inline def setFeatureEnabledToggleUndefined: Self = StObject.set(x, "featureEnabledToggle", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLayerList(value: Boolean): Self = StObject.set(x, "layerList", value.asInstanceOf[js.Any])
    
    inline def setLayerListUndefined: Self = StObject.set(x, "layerList", js.undefined)
    
    inline def setSelfEnabledToggle(value: Boolean): Self = StObject.set(x, "selfEnabledToggle", value.asInstanceOf[js.Any])
    
    inline def setSelfEnabledToggleUndefined: Self = StObject.set(x, "selfEnabledToggle", js.undefined)
  }
}
