package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SolidEdges3D
import typings.arcgisJsApi.esri.SolidEdges3DConstructor
import typings.arcgisJsApi.esri.SolidEdges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solidEdges3DMod extends Shortcut {
  
  @JSImport("esri/symbols/edges/SolidEdges3D", JSImport.Namespace)
  @js.native
  val ^ : SolidEdges3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/edges/SolidEdges3D", JSImport.Namespace)
  @js.native
  /**
    * SolidEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a solid line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html)
    */
  class Class () extends SolidEdges3D {
    def this(properties: SolidEdges3DProperties) = this()
  }
  
  type _To = SolidEdges3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `solidEdges3DMod.foo` */
  override def _to: SolidEdges3DConstructor = ^
}
