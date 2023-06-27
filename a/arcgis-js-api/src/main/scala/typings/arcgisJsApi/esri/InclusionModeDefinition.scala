package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusionModeDefinition extends StObject {
  
  /**
  		 * Specifies whether to create sublayers for each [named type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html) regardless of whether or not they are included in the `namedTypeDefinition`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#InclusionModeDefinition)
  		 */
  var generateAllSublayers: Boolean
  
  /**
  		 * A map of named types and the specific instances of those types to include in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#InclusionModeDefinition)
  		 */
  var namedTypeDefinitions: Any
}
object InclusionModeDefinition {
  
  inline def apply(generateAllSublayers: Boolean, namedTypeDefinitions: Any): InclusionModeDefinition = {
    val __obj = js.Dynamic.literal(generateAllSublayers = generateAllSublayers.asInstanceOf[js.Any], namedTypeDefinitions = namedTypeDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclusionModeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InclusionModeDefinition] (val x: Self) extends AnyVal {
    
    inline def setGenerateAllSublayers(value: Boolean): Self = StObject.set(x, "generateAllSublayers", value.asInstanceOf[js.Any])
    
    inline def setNamedTypeDefinitions(value: Any): Self = StObject.set(x, "namedTypeDefinitions", value.asInstanceOf[js.Any])
  }
}
