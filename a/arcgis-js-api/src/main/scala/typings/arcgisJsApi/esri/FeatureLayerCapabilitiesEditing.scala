package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerCapabilitiesEditing extends Object {
  /**
    * Indicates if anonymous users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDeleteByAnonymous: Boolean = js.native
  /**
    * Indicates if logged in users can delete features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDeleteByOthers: Boolean = js.native
  /**
    * Indicates if the geometry of the features in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsGeometryUpdate: Boolean = js.native
  /**
    * Indicates if the `globalId` values provided by the client are used in [applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsGlobalId: Boolean = js.native
  /**
    * Indicates if the `rollbackOnFailureEnabled` parameter can be set to `true` or `false` when editing features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsRollbackOnFailure: Boolean = js.native
  /**
    * Indicates if anonymous users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateByAnonymous: Boolean = js.native
  /**
    * Indicates if logged in users can update features created by others.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateByOthers: Boolean = js.native
  /**
    * Indicates if `m-values` must be provided when updating features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdateWithoutM: Boolean = js.native
  /**
    * Indicates if the layer supports uploading attachments by [UploadId](https://developers.arcgis.com/rest/services-reference/item.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUploadWithItemId: Boolean = js.native
}

object FeatureLayerCapabilitiesEditing {
  @scala.inline
  def apply(
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
  ): FeatureLayerCapabilitiesEditing = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDeleteByAnonymous = supportsDeleteByAnonymous.asInstanceOf[js.Any], supportsDeleteByOthers = supportsDeleteByOthers.asInstanceOf[js.Any], supportsGeometryUpdate = supportsGeometryUpdate.asInstanceOf[js.Any], supportsGlobalId = supportsGlobalId.asInstanceOf[js.Any], supportsRollbackOnFailure = supportsRollbackOnFailure.asInstanceOf[js.Any], supportsUpdateByAnonymous = supportsUpdateByAnonymous.asInstanceOf[js.Any], supportsUpdateByOthers = supportsUpdateByOthers.asInstanceOf[js.Any], supportsUpdateWithoutM = supportsUpdateWithoutM.asInstanceOf[js.Any], supportsUploadWithItemId = supportsUploadWithItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesEditing]
  }
  @scala.inline
  implicit class FeatureLayerCapabilitiesEditingOps[Self <: FeatureLayerCapabilitiesEditing] (val x: Self) extends AnyVal {
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
    def setSupportsDeleteByAnonymous(value: Boolean): Self = this.set("supportsDeleteByAnonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsDeleteByOthers(value: Boolean): Self = this.set("supportsDeleteByOthers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsGeometryUpdate(value: Boolean): Self = this.set("supportsGeometryUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsGlobalId(value: Boolean): Self = this.set("supportsGlobalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsRollbackOnFailure(value: Boolean): Self = this.set("supportsRollbackOnFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsUpdateByAnonymous(value: Boolean): Self = this.set("supportsUpdateByAnonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsUpdateByOthers(value: Boolean): Self = this.set("supportsUpdateByOthers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsUpdateWithoutM(value: Boolean): Self = this.set("supportsUpdateWithoutM", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsUploadWithItemId(value: Boolean): Self = this.set("supportsUploadWithItemId", value.asInstanceOf[js.Any])
  }
  
}

