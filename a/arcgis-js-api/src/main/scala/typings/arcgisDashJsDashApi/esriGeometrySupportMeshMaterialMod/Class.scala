package typings.arcgisDashJsDashApi.esriGeometrySupportMeshMaterialMod

import typings.arcgisDashJsDashApi.__esri.MeshMaterial
import typings.arcgisDashJsDashApi.__esri.MeshMaterialProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/support/MeshMaterial", JSImport.Namespace)
@js.native
/**
  * The material determines how a mesh component is visualized. Among other properties, MeshMaterial specifies a color that may be a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) value, as well as a colorTexture that may be a [MeshTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)), which is mapped to the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
  */
class Class () extends MeshMaterial {
  def this(properties: MeshMaterialProperties) = this()
}

