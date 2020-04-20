package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.blend
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.opaque
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshMaterialProperties extends js.Object {
  /**
    * Specifies how transparency on the object is handled. If [alphaMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode) is set to either `mask` or `auto` this property specifies the cutoff value below which masking happens (that is, the coresponding part of the Mesh is rendered fully transparent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    *
    * @default 0.5
    */
  var alphaCutoff: js.UndefOr[Double] = js.undefined
  /**
    * Specifies how transparency on the object is handled. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff).
    *
    * | Type | Description |
    * |------|-------------|
    * | opaque | Alpha is ignored, and the object is rendered fully opaque. |
    * | blend | Alpha values are used for gradual transparency, blending between the object and its background. |
    * | mask | Alpha values are used for binary transparency, either displaying the object, or its background. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff). |
    * | auto | The implementation mixes the `mask` and `blend` settings, masking below `alphaCutoff` and blending above it. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    *
    * @default "auto"
    */
  var alphaMode: js.UndefOr[auto | blend | opaque | mask] = js.undefined
  /**
    * Specifies a single, uniform color for the mesh component. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * Specifies a texture from which to get color information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    *
    * @default true
    */
  var doubleSided: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a texture from which to get normal information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
}

object MeshMaterialProperties {
  @scala.inline
  def apply(
    alphaCutoff: Int | Double = null,
    alphaMode: auto | blend | opaque | mask = null,
    color: Color_ | js.Array[Double] | String = null,
    colorTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    doubleSided: js.UndefOr[Boolean] = js.undefined,
    normalTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null
  ): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    if (alphaCutoff != null) __obj.updateDynamic("alphaCutoff")(alphaCutoff.asInstanceOf[js.Any])
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorTexture != null) __obj.updateDynamic("colorTexture")(colorTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleSided)) __obj.updateDynamic("doubleSided")(doubleSided.asInstanceOf[js.Any])
    if (normalTexture != null) __obj.updateDynamic("normalTexture")(normalTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshMaterialProperties]
  }
}

