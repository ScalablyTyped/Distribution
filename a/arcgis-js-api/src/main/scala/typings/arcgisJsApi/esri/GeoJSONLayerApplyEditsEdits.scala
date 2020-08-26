package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerApplyEditsEdits extends Object {
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or objects to be deleted. When an array or collection of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#objectIdField). When an array of objects is used, each object must have a valid `objectId` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.native
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
}

object GeoJSONLayerApplyEditsEdits {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerApplyEditsEdits]
  }
  @scala.inline
  implicit class GeoJSONLayerApplyEditsEditsOps[Self <: GeoJSONLayerApplyEditsEdits] (val x: Self) extends AnyVal {
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
    def setAddFeaturesVarargs(value: Graphic*): Self = this.set("addFeatures", js.Array(value :_*))
    @scala.inline
    def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = this.set("addFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFeatures: Self = this.set("addFeatures", js.undefined)
    @scala.inline
    def setDeleteFeaturesVarargs(value: (js.Any | Graphic)*): Self = this.set("deleteFeatures", js.Array(value :_*))
    @scala.inline
    def setDeleteFeatures(value: (js.Array[_ | Graphic]) | Collection[Graphic]): Self = this.set("deleteFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteFeatures: Self = this.set("deleteFeatures", js.undefined)
    @scala.inline
    def setUpdateFeaturesVarargs(value: Graphic*): Self = this.set("updateFeatures", js.Array(value :_*))
    @scala.inline
    def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = this.set("updateFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateFeatures: Self = this.set("updateFeatures", js.undefined)
  }
  
}

