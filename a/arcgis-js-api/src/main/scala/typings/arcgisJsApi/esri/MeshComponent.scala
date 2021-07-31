package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.flat
import typings.arcgisJsApi.arcgisJsApiStrings.smooth
import typings.arcgisJsApi.arcgisJsApiStrings.source
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshComponent
  extends StObject
     with Accessor {
  
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: Uint32Array = js.native
  
  /**
    * The material determines how the component is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: MeshMaterial | MeshMaterialMetallicRoughness = js.native
  
  /**
    * Specifies the type of normals used for lighting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#shading)
    */
  var shading: source | flat | smooth = js.native
}
