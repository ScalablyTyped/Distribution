package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndexSearchProperties extends StObject {
  
  /**
    * The properties of the named type that are included in the search index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-SearchIndex.html#searchProperties)
    */
  var propertyNames: js.Array[String]
}
object SearchIndexSearchProperties {
  
  inline def apply(propertyNames: js.Array[String]): SearchIndexSearchProperties = {
    val __obj = js.Dynamic.literal(propertyNames = propertyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndexSearchProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchIndexSearchProperties] (val x: Self) extends AnyVal {
    
    inline def setPropertyNames(value: js.Array[String]): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesVarargs(value: String*): Self = StObject.set(x, "propertyNames", js.Array(value*))
  }
}
