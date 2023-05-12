package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsSnappingControlsElements extends StObject {
  
  /**
    * Indicates whether to display the snapping controls' toggle to entirely enable/disable snapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var enabledToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the snapping controls' toggle to enable/disable `Feature to feature` snapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var featureEnabledToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the snapping controls' header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display snapping controls' `Snapping layers`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var layerList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the snapping controls' toggle to enable/disable `Geometry guides`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#VisibleElements)
    */
  var selfEnabledToggle: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsSnappingControlsElements {
  
  inline def apply(): VisibleElementsSnappingControlsElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElementsSnappingControlsElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElementsSnappingControlsElements] (val x: Self) extends AnyVal {
    
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
