package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewingProperties extends StObject {
  
  /**
  		 * An object specifying the search parameters set within the web scene or web map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html#search)
  		 */
  var search: js.UndefOr[SearchProperties] = js.undefined
}
object ViewingProperties {
  
  inline def apply(): ViewingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewingProperties] (val x: Self) extends AnyVal {
    
    inline def setSearch(value: SearchProperties): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
