package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONLayerEditsEvent extends StObject {
  
  var addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures] = js.native
  
  var deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures] = js.native
  
  var updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures] = js.native
}
object GeoJSONLayerEditsEvent {
  
  @scala.inline
  def apply(
    addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
  ): GeoJSONLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEvent]
  }
  
  @scala.inline
  implicit class GeoJSONLayerEditsEventMutableBuilder[Self <: GeoJSONLayerEditsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedFeatures(value: js.Array[GeoJSONLayerEditsEventAddedFeatures]): Self = StObject.set(x, "addedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedFeaturesVarargs(value: GeoJSONLayerEditsEventAddedFeatures*): Self = StObject.set(x, "addedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFeatures(value: js.Array[GeoJSONLayerEditsEventDeletedFeatures]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFeaturesVarargs(value: GeoJSONLayerEditsEventDeletedFeatures*): Self = StObject.set(x, "deletedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFeatures(value: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]): Self = StObject.set(x, "updatedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFeaturesVarargs(value: GeoJSONLayerEditsEventUpdatedFeatures*): Self = StObject.set(x, "updatedFeatures", js.Array(value :_*))
  }
}
