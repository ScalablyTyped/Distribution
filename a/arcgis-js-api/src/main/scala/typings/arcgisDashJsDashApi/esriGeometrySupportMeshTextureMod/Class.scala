package typings.arcgisDashJsDashApi.esriGeometrySupportMeshTextureMod

import typings.arcgisDashJsDashApi.__esri.MeshTexture
import typings.arcgisDashJsDashApi.__esri.MeshTextureProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/support/MeshTexture", JSImport.Namespace)
@js.native
/**
  * MeshTexture represents image data to be used for a MeshMaterial. It is mapped to the mesh by its uv vertex attributes. MeshTexture instances can be used with the [MeshComponent.material.colorTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) and [MeshComponent.material.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) properties. Images can be referred to either by url or directly by data ( [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData)).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)
  */
class Class () extends MeshTexture {
  def this(properties: MeshTextureProperties) = this()
}

