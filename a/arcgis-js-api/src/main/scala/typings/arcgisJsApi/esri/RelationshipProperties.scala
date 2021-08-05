package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`many-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-many`
import typings.arcgisJsApi.arcgisJsApiStrings.`one-to-one`
import typings.arcgisJsApi.arcgisJsApiStrings.destination
import typings.arcgisJsApi.arcgisJsApiStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipProperties extends StObject {
  
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: js.UndefOr[`one-to-one` | `one-to-many` | `many-to-many`] = js.undefined
  
  /**
    * Indicates whether the relationship is composite.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#composite)
    */
  var composite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique ID for the relationship.
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
    * The key field in an attributed relationship class table that matches the [keyField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyFieldInRelationshipTable)
    */
  var keyFieldInRelationshipTable: js.UndefOr[String] = js.undefined
  
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
  
  /**
    * The relationship table id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relationshipTableId)
    */
  var relationshipTableId: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the table participating in the relationship is the `origin` or `destination` table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#role)
    */
  var role: js.UndefOr[origin | destination] = js.undefined
}
object RelationshipProperties {
  
  inline def apply(): RelationshipProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipProperties]
  }
  
  extension [Self <: RelationshipProperties](x: Self) {
    
    inline def setCardinality(value: `one-to-one` | `one-to-many` | `many-to-many`): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    inline def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    
    inline def setKeyFieldInRelationshipTable(value: String): Self = StObject.set(x, "keyFieldInRelationshipTable", value.asInstanceOf[js.Any])
    
    inline def setKeyFieldInRelationshipTableUndefined: Self = StObject.set(x, "keyFieldInRelationshipTable", js.undefined)
    
    inline def setKeyFieldUndefined: Self = StObject.set(x, "keyField", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelatedTableId(value: Double): Self = StObject.set(x, "relatedTableId", value.asInstanceOf[js.Any])
    
    inline def setRelatedTableIdUndefined: Self = StObject.set(x, "relatedTableId", js.undefined)
    
    inline def setRelationshipTableId(value: Double): Self = StObject.set(x, "relationshipTableId", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTableIdUndefined: Self = StObject.set(x, "relationshipTableId", js.undefined)
    
    inline def setRole(value: origin | destination): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
