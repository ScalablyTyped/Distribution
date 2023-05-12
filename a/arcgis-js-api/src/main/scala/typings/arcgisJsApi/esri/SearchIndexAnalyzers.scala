package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndexAnalyzers extends StObject {
  
  /**
    * The name of the analyzer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#analyzers)
    */
  var name: String
}
object SearchIndexAnalyzers {
  
  inline def apply(name: String): SearchIndexAnalyzers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndexAnalyzers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchIndexAnalyzers] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
