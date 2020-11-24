package typings.arcgisJsApi.waterSymbol3DLayerMod

import typings.arcgisJsApi.esri.WaterSymbol3DLayer
import typings.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
@js.native
/**
  * WaterSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries as realistic, animated water surfaces, therefore it can only be used inside a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html)
  */
class Class () extends WaterSymbol3DLayer {
  def this(properties: WaterSymbol3DLayerProperties) = this()
}
