package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphNamedObjectDeletes extends StObject {
  
  /**
    * A list of the ids of the specified type to delete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#GraphNamedObjectDeletes)
    */
  var ids: js.Array[String]
  
  /**
    * The name of the [EntityType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) that the entities belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#GraphNamedObjectDeletes)
    */
  var typeName: String
}
object GraphNamedObjectDeletes {
  
  inline def apply(ids: js.Array[String], typeName: String): GraphNamedObjectDeletes = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNamedObjectDeletes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphNamedObjectDeletes] (val x: Self) extends AnyVal {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
