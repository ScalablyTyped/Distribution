package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayer
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrudeSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/ExtrudeSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : ExtrudeSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/ExtrudeSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
    */
  class Class () extends ExtrudeSymbol3DLayer {
    def this(properties: ExtrudeSymbol3DLayerProperties) = this()
  }
  
  type _To = ExtrudeSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `extrudeSymbol3DLayerMod.foo` */
  override def _to: ExtrudeSymbol3DLayerConstructor = ^
}
