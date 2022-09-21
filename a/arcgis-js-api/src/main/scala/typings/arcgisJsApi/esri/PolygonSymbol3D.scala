package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonSymbol3D
  extends StObject
     with Symbol3D
     with typings.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  
  /**
    * A Collection of [Symbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html) objects used to visualize the graphic or feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#symbolLayers)
    */
  @JSName("symbolLayers")
  var symbolLayers_PolygonSymbol3D: Collection[
    ExtrudeSymbol3DLayer | FillSymbol3DLayer | IconSymbol3DLayer | LineSymbol3DLayer | ObjectSymbol3DLayer | TextSymbol3DLayer | WaterSymbol3DLayer
  ] = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#type)
    */
  @JSName("type")
  val type_PolygonSymbol3D: `polygon-3d` = js.native
}
