package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEvent extends StObject {
  
  var addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures]
  
  var deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures]
  
  var updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
}
object GeoJSONLayerEditsEvent {
  
  inline def apply(
    addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
  ): GeoJSONLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEvent]
  }
  
  extension [Self <: GeoJSONLayerEditsEvent](x: Self) {
    
    inline def setAddedFeatures(value: js.Array[GeoJSONLayerEditsEventAddedFeatures]): Self = StObject.set(x, "addedFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddedFeaturesVarargs(value: GeoJSONLayerEditsEventAddedFeatures*): Self = StObject.set(x, "addedFeatures", js.Array(value :_*))
    
    inline def setDeletedFeatures(value: js.Array[GeoJSONLayerEditsEventDeletedFeatures]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeletedFeaturesVarargs(value: GeoJSONLayerEditsEventDeletedFeatures*): Self = StObject.set(x, "deletedFeatures", js.Array(value :_*))
    
    inline def setUpdatedFeatures(value: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]): Self = StObject.set(x, "updatedFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFeaturesVarargs(value: GeoJSONLayerEditsEventUpdatedFeatures*): Self = StObject.set(x, "updatedFeatures", js.Array(value :_*))
  }
}
