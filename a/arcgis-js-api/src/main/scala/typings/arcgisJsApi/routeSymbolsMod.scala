package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteSymbols
import typings.arcgisJsApi.esri.RouteSymbolsConstructor
import typings.arcgisJsApi.esri.RouteSymbolsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeSymbolsMod extends Shortcut {
  
  @JSImport("esri/layers/support/RouteSymbols", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RouteSymbolsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RouteSymbols", JSImport.Namespace)
  @js.native
  /**
    * RouteSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops, barriers and directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html)
    */
  open class Class ()
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
  
  type _To = js.Object & RouteSymbolsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeSymbolsMod.foo` */
  override def _to: js.Object & RouteSymbolsConstructor = ^
}
