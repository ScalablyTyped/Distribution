package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelProperties extends StObject {
  
  /**
    * A list of the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) contained in the knowledge graph including their associated properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#entityTypes)
    */
  var entityTypes: js.UndefOr[js.Array[EntityTypeProperties]] = js.undefined
  
  /**
    * A list of the [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) in the knowledge graph including their associated properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#relationshipTypes)
    */
  var relationshipTypes: js.UndefOr[js.Array[RelationshipTypeProperties]] = js.undefined
  
  /**
    * Specifies [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) information for the knowledge graph.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Indicates whether users can make changes to the data model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#strict)
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date the data model was last updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html#timestamp)
    */
  var timestamp: js.UndefOr[DateProperties] = js.undefined
}
object DataModelProperties {
  
  inline def apply(): DataModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelProperties] (val x: Self) extends AnyVal {
    
    inline def setEntityTypes(value: js.Array[EntityTypeProperties]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityTypeProperties*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setRelationshipTypes(value: js.Array[RelationshipTypeProperties]): Self = StObject.set(x, "relationshipTypes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypesUndefined: Self = StObject.set(x, "relationshipTypes", js.undefined)
    
    inline def setRelationshipTypesVarargs(value: RelationshipTypeProperties*): Self = StObject.set(x, "relationshipTypes", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTimestamp(value: DateProperties): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
