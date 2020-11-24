package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typings.arcgisJsApi.arcgisJsApiStrings.destination
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipProperties extends js.Object {
  
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.native
  
  /**
    * Indicates whether the relationship is composite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#composite)
    */
  var composite: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique ID for the relationship.
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
  
  /**
    * The key field in an attributed relationship class table that matches the [keyField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyFieldInRelationshipTable)
    */
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
  
  /**
    * The relationship table id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relationshipTableId)
    */
  var relationshipTableId: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the table participating in the relationship is the `origin` or `destination` table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#role)
    */
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
