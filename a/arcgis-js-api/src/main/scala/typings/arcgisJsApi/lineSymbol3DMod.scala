package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineSymbol3D
import typings.arcgisJsApi.esri.LineSymbol3DConstructor
import typings.arcgisJsApi.esri.LineSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/LineSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : LineSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LineSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * LineSymbol3D is used to render features with [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html)
    */
  class Class () extends LineSymbol3D {
    def this(properties: LineSymbol3DProperties) = this()
  }
  
  type _To = LineSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineSymbol3DMod.foo` */
  override def _to: LineSymbol3DConstructor = ^
}
