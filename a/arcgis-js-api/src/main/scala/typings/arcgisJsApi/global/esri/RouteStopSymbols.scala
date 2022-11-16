package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteStopSymbolsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RouteStopSymbols")
@js.native
/**
  * RouteStopSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html)
  */
open class RouteStopSymbols ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteStopSymbols {
  def this(properties: RouteStopSymbolsProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RouteStopSymbols {
  
  @JSGlobal("__esri.RouteStopSymbols")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RouteStopSymbols = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteStopSymbols]
}
