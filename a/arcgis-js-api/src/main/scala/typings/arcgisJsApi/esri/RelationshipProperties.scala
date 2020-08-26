package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typings.arcgisJsApi.arcgisJsApiStrings.destination
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipProperties extends js.Object {
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.native
  var composite: js.UndefOr[Boolean] = js.native
  /**
    * The unique ID for the relationship. These ids for the relationships the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) participates in are listed in the ArcGIS Services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: js.UndefOr[String] = js.native
  var keyFieldInRelationshipTable: js.UndefOr[String] = js.native
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: js.UndefOr[Double] = js.native
  var relationshipTableId: js.UndefOr[Double] = js.native
  var role: js.UndefOr[origin | destination] = js.native
}

object RelationshipProperties {
  @scala.inline
  def apply(): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipProperties]
  }
  @scala.inline
  implicit class RelationshipPropertiesOps[Self <: RelationshipProperties] (val x: Self) extends AnyVal {
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
    def setCardinality(value: `one-to-one` | `one-to-many` | `many-to-many`): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardinality: Self = this.set("cardinality", js.undefined)
    @scala.inline
    def setComposite(value: Boolean): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyField(value: String): Self = this.set("keyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyField: Self = this.set("keyField", js.undefined)
    @scala.inline
    def setKeyFieldInRelationshipTable(value: String): Self = this.set("keyFieldInRelationshipTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFieldInRelationshipTable: Self = this.set("keyFieldInRelationshipTable", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRelatedTableId(value: Double): Self = this.set("relatedTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedTableId: Self = this.set("relatedTableId", js.undefined)
    @scala.inline
    def setRelationshipTableId(value: Double): Self = this.set("relationshipTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipTableId: Self = this.set("relationshipTableId", js.undefined)
    @scala.inline
    def setRole(value: origin | destination): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

