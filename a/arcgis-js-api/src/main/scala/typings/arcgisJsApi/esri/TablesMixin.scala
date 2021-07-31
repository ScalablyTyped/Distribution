package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablesMixin extends StObject {
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  var tables: Collection[Layer]
}
object TablesMixin {
  
  @scala.inline
  def apply(tables: Collection[Layer]): TablesMixin = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesMixin]
  }
  
  @scala.inline
  implicit class TablesMixinMutableBuilder[Self <: TablesMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTables(value: Collection[Layer]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
  }
}
