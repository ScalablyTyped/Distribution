package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineSymbol3DLayer
import typings.arcgisJsApi.esri.LineSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.LineSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/LineSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : LineSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LineSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * LineSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries using a flat 2D line with a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html)
    */
  class Class () extends LineSymbol3DLayer {
    def this(properties: LineSymbol3DLayerProperties) = this()
  }
  
  type _To = LineSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineSymbol3DLayerMod.foo` */
  override def _to: LineSymbol3DLayerConstructor = ^
}
