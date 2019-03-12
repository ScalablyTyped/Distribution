package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesEditing
  extends stdLib.Object {
  /**
    * Indicates if anonymous users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDeleteByAnonymous: scala.Boolean
  /**
    * Indicates if logged in users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDeleteByOthers: scala.Boolean
  /**
    * Indicates if the geometry of the features in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsGeometryUpdate: scala.Boolean
  /**
    * Indicates if the `globalid` values provided by the client are used in [applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsGlobalId: scala.Boolean
  /**
    * Indicates if the `rollbackOnFailure` parameter can be set to `true` or `false` when running the synchronizeReplica operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsRollbackOnFailure: scala.Boolean
  /**
    * Indicates if anonymous users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateByAnonymous: scala.Boolean
  /**
    * Indicates if logged in users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateByOthers: scala.Boolean
  /**
    * Indicates if `m-values` must be provided when updating features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateWithoutM: scala.Boolean
  /**
    * Indicates if the layer supports uploading attachments by [UploadId](https://developers.arcgis.com/rest/services-reference/item.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUploadWithItemId: scala.Boolean
}

object FeatureLayerCapabilitiesEditing {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsDeleteByAnonymous: scala.Boolean,
    supportsDeleteByOthers: scala.Boolean,
    supportsGeometryUpdate: scala.Boolean,
    supportsGlobalId: scala.Boolean,
    supportsRollbackOnFailure: scala.Boolean,
    supportsUpdateByAnonymous: scala.Boolean,
    supportsUpdateByOthers: scala.Boolean,
    supportsUpdateWithoutM: scala.Boolean,
    supportsUploadWithItemId: scala.Boolean
  ): FeatureLayerCapabilitiesEditing = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDeleteByAnonymous = supportsDeleteByAnonymous, supportsDeleteByOthers = supportsDeleteByOthers, supportsGeometryUpdate = supportsGeometryUpdate, supportsGlobalId = supportsGlobalId, supportsRollbackOnFailure = supportsRollbackOnFailure, supportsUpdateByAnonymous = supportsUpdateByAnonymous, supportsUpdateByOthers = supportsUpdateByOthers, supportsUpdateWithoutM = supportsUpdateWithoutM, supportsUploadWithItemId = supportsUploadWithItemId)
  
    __obj.asInstanceOf[FeatureLayerCapabilitiesEditing]
  }
}

