package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphLayerProperties
  extends StObject
     with LayerProperties
     with BlendLayerProperties {
  
  /**
    * Defines a set of [named types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphNamedObject.html) and/or [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) to be included in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#inclusionModeDefinition)
    */
  var inclusionModeDefinition: js.UndefOr[InclusionModeDefinition] = js.undefined
  
  /**
    * The url of the [knowledge graph service](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object KnowledgeGraphLayerProperties {
  
  inline def apply(): KnowledgeGraphLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeGraphLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setInclusionModeDefinition(value: InclusionModeDefinition): Self = StObject.set(x, "inclusionModeDefinition", value.asInstanceOf[js.Any])
    
    inline def setInclusionModeDefinitionUndefined: Self = StObject.set(x, "inclusionModeDefinition", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
