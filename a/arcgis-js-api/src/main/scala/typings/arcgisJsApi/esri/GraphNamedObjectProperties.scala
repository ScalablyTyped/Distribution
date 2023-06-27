package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphNamedObjectProperties
  extends StObject
     with GraphObjectProperties {
  
  /**
  		 * The unique ID of the object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the name for all similar types of objects ([entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) or [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html)) defined in the knowledge graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html#typeName)
  		 */
  var typeName: js.UndefOr[String] = js.undefined
}
object GraphNamedObjectProperties {
  
  inline def apply(): GraphNamedObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphNamedObjectProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphNamedObjectProperties] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
