package typings.arcgisJsApi.meshComponentMod

import typings.arcgisJsApi.esri.MeshComponent
import typings.arcgisJsApi.esri.MeshComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
@js.native
/**
  * The MeshComponent class is used to apply one or more materials to a single [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html). The [faces](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces) property is a flat array of indices in the mesh [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) and defines the region of vertices in the mesh on which to apply the material. Each triple of values in the flat array of indices specifies a triangle to be rendered.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html)
  */
class Class () extends MeshComponent {
  def this(properties: MeshComponentProperties) = this()
}

