package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphObjectTypeProperties extends StObject {
  
  /**
  		 * The display name of the graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#alias)
  		 */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies [index fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-FieldIndex.html) for a graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#fieldIndexes)
  		 */
  var fieldIndexes: js.UndefOr[js.Array[FieldIndexProperties]] = js.undefined
  
  /**
  		 * The name of the graph object type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html) of a graph object type such as an [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) or [RelationshipType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#properties)
  		 */
  var properties: js.UndefOr[js.Array[GraphPropertyProperties]] = js.undefined
  
  /**
  		 * The object type's role in the knowledge graph.
  		 *
  		 * @default "Regular"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObjectType.html#role)
  		 */
  var role: js.UndefOr[String] = js.undefined
}
object GraphObjectTypeProperties {
  
  inline def apply(): GraphObjectTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphObjectTypeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphObjectTypeProperties] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setFieldIndexes(value: js.Array[FieldIndexProperties]): Self = StObject.set(x, "fieldIndexes", value.asInstanceOf[js.Any])
    
    inline def setFieldIndexesUndefined: Self = StObject.set(x, "fieldIndexes", js.undefined)
    
    inline def setFieldIndexesVarargs(value: FieldIndexProperties*): Self = StObject.set(x, "fieldIndexes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: js.Array[GraphPropertyProperties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: GraphPropertyProperties*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
