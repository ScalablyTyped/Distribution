package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TablesMixin")
@js.native
open class TablesMixin ()
  extends StObject
     with typings.arcgisJsApi.esri.TablesMixin {
  
  /**
    * Returns a table based on the given table ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
    */
  /* CompleteClass */
  override def findTableById(tableId: String): typings.arcgisJsApi.esri.Layer = js.native
  
  /**
    * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    */
  /* CompleteClass */
  var tables: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Layer] = js.native
}
