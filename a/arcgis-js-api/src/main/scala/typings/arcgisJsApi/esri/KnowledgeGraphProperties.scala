package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphProperties extends StObject {
  
  /**
    * The data model of the knowledge graph service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html#dataModel)
    */
  var dataModel: js.UndefOr[DataModelProperties] = js.undefined
  
  /**
    * The url to a hosted knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object KnowledgeGraphProperties {
  
  inline def apply(): KnowledgeGraphProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeGraphProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphProperties] (val x: Self) extends AnyVal {
    
    inline def setDataModel(value: DataModelProperties): Self = StObject.set(x, "dataModel", value.asInstanceOf[js.Any])
    
    inline def setDataModelUndefined: Self = StObject.set(x, "dataModel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
