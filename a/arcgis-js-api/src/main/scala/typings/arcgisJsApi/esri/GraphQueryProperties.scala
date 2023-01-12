package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQueryProperties extends StObject {
  
  /**
    * The Esri implementation of [openCypher](https://opencypher.org/) query to be executed against the knowledge graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphQuery.html#openCypherQuery)
    */
  var openCypherQuery: js.UndefOr[String] = js.undefined
}
object GraphQueryProperties {
  
  inline def apply(): GraphQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQueryProperties] (val x: Self) extends AnyVal {
    
    inline def setOpenCypherQuery(value: String): Self = StObject.set(x, "openCypherQuery", value.asInstanceOf[js.Any])
    
    inline def setOpenCypherQueryUndefined: Self = StObject.set(x, "openCypherQuery", js.undefined)
  }
}
