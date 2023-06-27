package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.Map
import typings.arcgisJsApi.esri.MapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriMapMod {
  
  @JSImport("esri/Map", JSImport.Namespace)
  @js.native
  /**
  		 * The Map class contains properties and methods for storing, managing, and overlaying [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) common to both 2D and 3D viewing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html)
  		 */
  open class ^ ()
    extends StObject
       with Map {
    def this(properties: MapProperties) = this()
    
    /**
    		 * Returns a table based on the given table ID.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#findTableById)
    		 */
    /* CompleteClass */
    override def findTableById(tableId: String): Layer = js.native
    
    /**
    		 * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
    		 */
    /* CompleteClass */
    var tables: Collection[Layer] = js.native
  }
}
