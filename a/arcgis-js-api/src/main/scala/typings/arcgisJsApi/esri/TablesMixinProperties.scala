package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TablesMixinProperties extends StObject {
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  var tables: js.UndefOr[CollectionProperties[LayerProperties] | js.Array[LayerProperties]] = js.undefined
}
object TablesMixinProperties {
  
  inline def apply(): TablesMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TablesMixinProperties]
  }
  
  extension [Self <: TablesMixinProperties](x: Self) {
    
    inline def setTables(value: CollectionProperties[LayerProperties] | js.Array[LayerProperties]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: LayerProperties*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
