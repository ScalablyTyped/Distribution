package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipProperties extends js.Object {
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.  **Possible values:** one-to-one | one-to-many | many-to-many
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[String] = js.undefined
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
    cardinality: String = null,
    id: Int | Double = null,
    keyField: String = null,
    name: String = null,
    relatedTableId: Int | Double = null
  ): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyField != null) __obj.updateDynamic("keyField")(keyField)
    if (name != null) __obj.updateDynamic("name")(name)
    if (relatedTableId != null) __obj.updateDynamic("relatedTableId")(relatedTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipProperties]
  }
}

