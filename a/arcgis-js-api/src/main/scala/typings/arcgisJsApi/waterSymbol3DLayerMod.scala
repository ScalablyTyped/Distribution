package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WaterSymbol3DLayer
import typings.arcgisJsApi.esri.WaterSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : WaterSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
  
  type _To = WaterSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `waterSymbol3DLayerMod.foo` */
  override def _to: WaterSymbol3DLayerConstructor = ^
}
