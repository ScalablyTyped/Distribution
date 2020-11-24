package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONLayerEditsEvent extends js.Object {
  
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
  implicit class GeoJSONLayerEditsEventOps[Self <: GeoJSONLayerEditsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddedFeaturesVarargs(value: GeoJSONLayerEditsEventAddedFeatures*): Self = this.set("addedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAddedFeatures(value: js.Array[GeoJSONLayerEditsEventAddedFeatures]): Self = this.set("addedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFeaturesVarargs(value: GeoJSONLayerEditsEventDeletedFeatures*): Self = this.set("deletedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFeatures(value: js.Array[GeoJSONLayerEditsEventDeletedFeatures]): Self = this.set("deletedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFeaturesVarargs(value: GeoJSONLayerEditsEventUpdatedFeatures*): Self = this.set("updatedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFeatures(value: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]): Self = this.set("updatedFeatures", value.asInstanceOf[js.Any])
  }
}
