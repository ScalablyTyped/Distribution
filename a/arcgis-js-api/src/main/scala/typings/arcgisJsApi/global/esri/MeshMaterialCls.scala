package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshMaterialProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.MeshMaterial")
@js.native
/**
  * The material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized. One of the major characteristics of a material is its [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color). The [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color) property can be used to set a uniform color for the whole [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html). Use the [colorTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture) property to map an image onto the mesh component, using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
  */
class MeshMaterialCls ()
  extends typings.arcgisJsApi.esri.MeshMaterial {
  def this(properties: MeshMaterialProperties) = this()
}

