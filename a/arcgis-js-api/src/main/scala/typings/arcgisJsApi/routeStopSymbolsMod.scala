package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteStopSymbols
import typings.arcgisJsApi.esri.RouteStopSymbolsConstructor
import typings.arcgisJsApi.esri.RouteStopSymbolsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeStopSymbolsMod extends Shortcut {
  
  @JSImport("esri/layers/support/RouteStopSymbols", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RouteStopSymbolsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RouteStopSymbols", JSImport.Namespace)
  @js.native
  /**
    * RouteStopSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html)
    */
  open class Class ()
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
  
  type _To = js.Object & RouteStopSymbolsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeStopSymbolsMod.foo` */
  override def _to: js.Object & RouteStopSymbolsConstructor = ^
}
