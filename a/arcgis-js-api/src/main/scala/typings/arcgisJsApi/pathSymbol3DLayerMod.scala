package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PathSymbol3DLayer
import typings.arcgisJsApi.esri.PathSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.PathSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/PathSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : PathSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PathSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
    */
  class Class () extends PathSymbol3DLayer {
    def this(properties: PathSymbol3DLayerProperties) = this()
  }
  
  type _To = PathSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pathSymbol3DLayerMod.foo` */
  override def _to: PathSymbol3DLayerConstructor = ^
}
