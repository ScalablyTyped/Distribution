package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshTextureProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.MeshTexture")
@js.native
/**
  * MeshTexture represents image data to be used for [MeshMaterial](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html) or [MeshMaterialMetallicRoughness](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html). It is mapped to the mesh by its uv vertex attributes. MeshTexture instances can be used with the [MeshComponent.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) property and they can be set either as a [MeshMaterial.colorTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture) or as [MeshMaterial.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture). Images can be referred to either by url or directly by data ( [HTMLImageElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement), [HTMLVideoElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData)).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)
  */
class MeshTextureCls ()
  extends typings.arcgisJsApi.esri.MeshTexture {
  def this(properties: MeshTextureProperties) = this()
}

