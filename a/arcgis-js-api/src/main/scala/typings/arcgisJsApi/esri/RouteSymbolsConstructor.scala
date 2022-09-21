package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSymbolsConstructor
  extends StObject
     with /**
  * RouteSymbols contains a set of symbols that will be used by [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) to symbolize new stops, barriers and directions.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html)
  */
Instantiable0[RouteSymbols]
     with Instantiable1[/* properties */ RouteSymbolsProperties, RouteSymbols] {
  
  def fromJSON(json: Any): RouteSymbols = js.native
}
