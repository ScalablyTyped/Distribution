package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerInclusionMemberDefinition extends StObject {
  
  /**
    * The global ID of the specific instance of the named type to be included in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#LayerInclusionMemberDefinition)
    */
  var id: String
}
object LayerInclusionMemberDefinition {
  
  inline def apply(id: String): LayerInclusionMemberDefinition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerInclusionMemberDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerInclusionMemberDefinition] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
