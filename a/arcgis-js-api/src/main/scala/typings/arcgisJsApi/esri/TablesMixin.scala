package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablesMixin extends StObject {
  
  /**
    * Returns a table based on the given table ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
    */
  def findTableById(tableId: String): Layer
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  var tables: Collection[Layer]
}
object TablesMixin {
  
  inline def apply(findTableById: String => Layer, tables: Collection[Layer]): TablesMixin = {
    val __obj = js.Dynamic.literal(findTableById = js.Any.fromFunction1(findTableById), tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TablesMixin] (val x: Self) extends AnyVal {
    
    inline def setFindTableById(value: String => Layer): Self = StObject.set(x, "findTableById", js.Any.fromFunction1(value))
    
    inline def setTables(value: Collection[Layer]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
  }
}
