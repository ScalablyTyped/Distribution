package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTableProperties extends StObject {
  
  /**
    * The field to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html#field)
    */
  var field: js.UndefOr[SearchTableFieldProperties] = js.undefined
  
  /**
    * The id of the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
}
object SearchTableProperties {
  
  inline def apply(): SearchTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTableProperties]
  }
  
  extension [Self <: SearchTableProperties](x: Self) {
    
    inline def setField(value: SearchTableFieldProperties): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
