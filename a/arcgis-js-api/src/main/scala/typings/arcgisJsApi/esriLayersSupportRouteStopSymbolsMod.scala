package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RouteStopSymbols
import typings.arcgisJsApi.esri.RouteStopSymbolsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportRouteStopSymbolsMod {
  
  @JSImport("esri/layers/support/RouteStopSymbols", JSImport.Namespace)
  @js.native
  /**
    * RouteStopSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html)
    */
  open class ^ ()
    extends StObject
       with RouteStopSymbols {
    def this(properties: RouteStopSymbolsProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/RouteStopSymbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RouteStopSymbols = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RouteStopSymbols]
}
