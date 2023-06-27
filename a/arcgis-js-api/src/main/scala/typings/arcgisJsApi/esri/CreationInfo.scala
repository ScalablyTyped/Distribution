package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationInfo extends StObject {
  
  /**
  		 * The associated [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html) geometry for the newly-created feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
  		 */
  var geometryToPlace: js.UndefOr[Mesh] = js.undefined
  
  /**
  		 * The initial feature used when you begin creating features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
  		 */
  var initialFeature: js.UndefOr[Graphic] = js.undefined
  
  /**
  		 * The associated layer for newly-created feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
  		 */
  var layer: FeatureLayer | SceneLayer | SubtypeSublayer
  
  /**
  		 * The maximum amount of feature to create in one batch editing operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
  		 */
  var maxFeatures: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The associated feature template used to create new features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo)
  		 */
  var template: FeatureTemplate
}
object CreationInfo {
  
  inline def apply(layer: FeatureLayer | SceneLayer | SubtypeSublayer, template: FeatureTemplate): CreationInfo = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreationInfo] (val x: Self) extends AnyVal {
    
    inline def setGeometryToPlace(value: Mesh): Self = StObject.set(x, "geometryToPlace", value.asInstanceOf[js.Any])
    
    inline def setGeometryToPlaceUndefined: Self = StObject.set(x, "geometryToPlace", js.undefined)
    
    inline def setInitialFeature(value: Graphic): Self = StObject.set(x, "initialFeature", value.asInstanceOf[js.Any])
    
    inline def setInitialFeatureUndefined: Self = StObject.set(x, "initialFeature", js.undefined)
    
    inline def setLayer(value: FeatureLayer | SceneLayer | SubtypeSublayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaxFeatures(value: Double): Self = StObject.set(x, "maxFeatures", value.asInstanceOf[js.Any])
    
    inline def setMaxFeaturesUndefined: Self = StObject.set(x, "maxFeatures", js.undefined)
    
    inline def setTemplate(value: FeatureTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
