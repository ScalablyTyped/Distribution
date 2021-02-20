package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FillSymbol3DLayer
import typings.arcgisJsApi.esri.FillSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.FillSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/FillSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : FillSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/FillSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * FillSymbol3DLayer is used to render the surfaces of flat 2D [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries and 3D volumetric meshes in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html)
    */
  class Class () extends FillSymbol3DLayer {
    def this(properties: FillSymbol3DLayerProperties) = this()
  }
  
  type _To = FillSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fillSymbol3DLayerMod.foo` */
  override def _to: FillSymbol3DLayerConstructor = ^
}
