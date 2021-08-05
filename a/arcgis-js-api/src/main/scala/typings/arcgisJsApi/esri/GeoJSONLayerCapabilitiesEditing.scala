package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerCapabilitiesEditing
  extends StObject
     with Object {
  
  /**
    * Indicates if anonymous users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDeleteByAnonymous: Boolean
  
  /**
    * Indicates if logged in users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDeleteByOthers: Boolean
  
  /**
    * Indicates if the geometry of the features in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsGeometryUpdate: Boolean
  
  /**
    * Indicates if the `globalid` values provided by the client are used in [applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsGlobalId: Boolean
  
  /**
    * Indicates if the `rollbackOnFailure` parameter can be set to `true` or `false` when running the synchronizeReplica operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsRollbackOnFailure: Boolean
  
  /**
    * Indicates if anonymous users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUpdateByAnonymous: Boolean
  
  /**
    * Indicates if logged in users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUpdateByOthers: Boolean
  
  /**
    * Indicates if `m-values` must be provided when updating features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUpdateWithoutM: Boolean
  
  /**
    * Indicates if the layer supports uploading attachments by [UploadId](https://developers.arcgis.com/rest/services-reference/item.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUploadWithItemId: Boolean
}
object GeoJSONLayerCapabilitiesEditing {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDeleteByAnonymous: Boolean,
    supportsDeleteByOthers: Boolean,
    supportsGeometryUpdate: Boolean,
    supportsGlobalId: Boolean,
    supportsRollbackOnFailure: Boolean,
    supportsUpdateByAnonymous: Boolean,
    supportsUpdateByOthers: Boolean,
    supportsUpdateWithoutM: Boolean,
    supportsUploadWithItemId: Boolean
  ): GeoJSONLayerCapabilitiesEditing = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDeleteByAnonymous = supportsDeleteByAnonymous.asInstanceOf[js.Any], supportsDeleteByOthers = supportsDeleteByOthers.asInstanceOf[js.Any], supportsGeometryUpdate = supportsGeometryUpdate.asInstanceOf[js.Any], supportsGlobalId = supportsGlobalId.asInstanceOf[js.Any], supportsRollbackOnFailure = supportsRollbackOnFailure.asInstanceOf[js.Any], supportsUpdateByAnonymous = supportsUpdateByAnonymous.asInstanceOf[js.Any], supportsUpdateByOthers = supportsUpdateByOthers.asInstanceOf[js.Any], supportsUpdateWithoutM = supportsUpdateWithoutM.asInstanceOf[js.Any], supportsUploadWithItemId = supportsUploadWithItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesEditing]
  }
  
  extension [Self <: GeoJSONLayerCapabilitiesEditing](x: Self) {
    
    inline def setSupportsDeleteByAnonymous(value: Boolean): Self = StObject.set(x, "supportsDeleteByAnonymous", value.asInstanceOf[js.Any])
    
    inline def setSupportsDeleteByOthers(value: Boolean): Self = StObject.set(x, "supportsDeleteByOthers", value.asInstanceOf[js.Any])
    
    inline def setSupportsGeometryUpdate(value: Boolean): Self = StObject.set(x, "supportsGeometryUpdate", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalId(value: Boolean): Self = StObject.set(x, "supportsGlobalId", value.asInstanceOf[js.Any])
    
    inline def setSupportsRollbackOnFailure(value: Boolean): Self = StObject.set(x, "supportsRollbackOnFailure", value.asInstanceOf[js.Any])
    
    inline def setSupportsUpdateByAnonymous(value: Boolean): Self = StObject.set(x, "supportsUpdateByAnonymous", value.asInstanceOf[js.Any])
    
    inline def setSupportsUpdateByOthers(value: Boolean): Self = StObject.set(x, "supportsUpdateByOthers", value.asInstanceOf[js.Any])
    
    inline def setSupportsUpdateWithoutM(value: Boolean): Self = StObject.set(x, "supportsUpdateWithoutM", value.asInstanceOf[js.Any])
    
    inline def setSupportsUploadWithItemId(value: Boolean): Self = StObject.set(x, "supportsUploadWithItemId", value.asInstanceOf[js.Any])
  }
}
