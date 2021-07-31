package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureViewModelProperties extends StObject {
  
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#defaultPopupTemplateEnabled)
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.undefined
  
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object FeatureViewModelProperties {
  
  @scala.inline
  def apply(): FeatureViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureViewModelProperties]
  }
  
  @scala.inline
  implicit class FeatureViewModelPropertiesMutableBuilder[Self <: FeatureViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPopupTemplateEnabled(value: Boolean): Self = StObject.set(x, "defaultPopupTemplateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPopupTemplateEnabledUndefined: Self = StObject.set(x, "defaultPopupTemplateEnabled", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    @scala.inline
    def setMap(value: MapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
