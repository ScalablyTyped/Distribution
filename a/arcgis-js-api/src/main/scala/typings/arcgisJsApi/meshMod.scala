package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Mesh
import typings.arcgisJsApi.esri.MeshConstructor
import typings.arcgisJsApi.esri.MeshProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMod extends Shortcut {
  
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  val ^ : MeshConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  /**
    * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
    */
  class Class () extends Mesh {
    def this(properties: MeshProperties) = this()
  }
  
  type _To = MeshConstructor
  
  /* This means you don't have to write `^`, but can instead just say `meshMod.foo` */
  override def _to: MeshConstructor = ^
}
