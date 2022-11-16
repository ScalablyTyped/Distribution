package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditedFeatureResultEditedFeatures extends StObject {
  
  /**
    * Newly added features as a result of editing a feature that participates in a composite relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var adds: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * Deleted features as a result of editing a feature that participates in a composite relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var deletes: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * Edited features are returned in the spatial reference of the feature service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
  
  /**
    * Object containing original and updated features as a result of editing a feature that participates in a composite relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var updates: js.UndefOr[js.Array[EditedFeatureResultEditedFeaturesUpdates]] = js.undefined
}
object EditedFeatureResultEditedFeatures {
  
  inline def apply(): EditedFeatureResultEditedFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditedFeatureResultEditedFeatures]
  }
  
  extension [Self <: EditedFeatureResultEditedFeatures](x: Self) {
    
    inline def setAdds(value: js.Array[Graphic]): Self = StObject.set(x, "adds", value.asInstanceOf[js.Any])
    
    inline def setAddsUndefined: Self = StObject.set(x, "adds", js.undefined)
    
    inline def setAddsVarargs(value: Graphic*): Self = StObject.set(x, "adds", js.Array(value*))
    
    inline def setDeletes(value: js.Array[Graphic]): Self = StObject.set(x, "deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesUndefined: Self = StObject.set(x, "deletes", js.undefined)
    
    inline def setDeletesVarargs(value: Graphic*): Self = StObject.set(x, "deletes", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setUpdates(value: js.Array[EditedFeatureResultEditedFeaturesUpdates]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: EditedFeatureResultEditedFeaturesUpdates*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
