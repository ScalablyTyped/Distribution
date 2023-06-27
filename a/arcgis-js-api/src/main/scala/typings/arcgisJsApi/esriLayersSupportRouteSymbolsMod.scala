package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RouteSymbols
import typings.arcgisJsApi.esri.RouteSymbolsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportRouteSymbolsMod {
  
  @JSImport("esri/layers/support/RouteSymbols", JSImport.Namespace)
  @js.native
  /**
  		 * RouteSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops, barriers and directions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html)
  		 */
  open class ^ ()
    extends StObject
       with RouteSymbols {
    def this(properties: RouteSymbolsProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/RouteSymbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RouteSymbols = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RouteSymbols]
}
