package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipProperties extends js.Object {
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.undefined
  /**
    * The unique ID for the relationship. These ids for the relationships the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) participates in are listed in the ArcGIS Services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: js.UndefOr[String] = js.undefined
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: js.UndefOr[Double] = js.undefined
}

object RelationshipProperties {
  @scala.inline
  def apply(
    cardinality: `one-to-one` | `one-to-many` | `many-to-many` = null,
    id: js.UndefOr[Double] = js.undefined,
    keyField: String = null,
    name: String = null,
    relatedTableId: js.UndefOr[Double] = js.undefined
  ): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (keyField != null) __obj.updateDynamic("keyField")(keyField.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedTableId)) __obj.updateDynamic("relatedTableId")(relatedTableId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipProperties]
  }
}

