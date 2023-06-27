package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerInclusionDefinition extends StObject {
  
  /**
  		 * A map of the specific members of the named type to be included.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#LayerInclusionDefinition)
  		 */
  var members: Any
  
  /**
  		 * If `true` all of the instances of the named type will be included regardless of if there is a defined list of members.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#LayerInclusionDefinition)
  		 */
  var useAllData: Boolean
}
object LayerInclusionDefinition {
  
  inline def apply(members: Any, useAllData: Boolean): LayerInclusionDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], useAllData = useAllData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerInclusionDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerInclusionDefinition] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setUseAllData(value: Boolean): Self = StObject.set(x, "useAllData", value.asInstanceOf[js.Any])
  }
}
