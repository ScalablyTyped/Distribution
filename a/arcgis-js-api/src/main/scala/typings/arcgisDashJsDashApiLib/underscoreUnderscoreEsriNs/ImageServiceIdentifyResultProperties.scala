package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageServiceIdentifyResultProperties extends js.Object {
  /**
    * The set of visible areas for the identified catalog items. `CatalogItemVisibilities` are returned only when the image service source is a mosaic dataset. Each element in the array corresponds to the percentage contribution (to final mosaic in given extent) of the item in `catalogItems`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItemVisibilities)
    */
  var catalogItemVisibilities: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The set of catalog items that overlap the input geometry. Catalog Items are returned only when the image service source is a mosaic dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#catalogItems)
    */
  var catalogItems: js.UndefOr[FeatureSetProperties] = js.undefined
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  /**
    * The identify property name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identify property id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#objectId)
    */
  var objectId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The attributes of the identified object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#properties)
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * The identify image service pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyResult.html#value)
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ImageServiceIdentifyResultProperties {
  @scala.inline
  def apply(
    catalogItemVisibilities: js.Array[scala.Double] = null,
    catalogItems: FeatureSetProperties = null,
    location: PointProperties = null,
    name: java.lang.String = null,
    objectId: scala.Int | scala.Double = null,
    properties: js.Any = null,
    value: java.lang.String = null
  ): ImageServiceIdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    if (catalogItemVisibilities != null) __obj.updateDynamic("catalogItemVisibilities")(catalogItemVisibilities)
    if (catalogItems != null) __obj.updateDynamic("catalogItems")(catalogItems)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ImageServiceIdentifyResultProperties]
  }
}

