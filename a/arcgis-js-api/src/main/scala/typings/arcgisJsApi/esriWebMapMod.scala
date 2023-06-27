package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.WebMap
import typings.arcgisJsApi.esri.WebMapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebMapMod {
  
  @JSImport("esri/WebMap", JSImport.Namespace)
  @js.native
  /**
  		 * Loads a [WebMap](https://doc.arcgis.com/en/arcgis-online/create-maps/make-your-first-map.htm) from [ArcGIS Online](https://www.arcgis.com/home/) or [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/latest/administer/windows/what-is-portal-for-arcgis-.htm) into a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html)
  		 */
  open class ^ ()
    extends StObject
       with WebMap {
    def this(properties: WebMapProperties) = this()
    
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
  @JSImport("esri/WebMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a new instance of this class and initializes it with values from a JSON object generated from an ArcGIS product.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#fromJSON)
  		 */
  inline def fromJSON(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
}
