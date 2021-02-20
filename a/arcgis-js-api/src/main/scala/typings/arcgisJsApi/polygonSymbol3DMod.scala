package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PolygonSymbol3D
import typings.arcgisJsApi.esri.PolygonSymbol3DConstructor
import typings.arcgisJsApi.esri.PolygonSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polygonSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/PolygonSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : PolygonSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PolygonSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * PolygonSymbol3D is used to render features with [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html)
    */
  class Class () extends PolygonSymbol3D {
    def this(properties: PolygonSymbol3DProperties) = this()
  }
  
  type _To = PolygonSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `polygonSymbol3DMod.foo` */
  override def _to: PolygonSymbol3DConstructor = ^
}
