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

trait MeshMaterialMetallicRoughnessProperties extends MeshMaterialProperties {
  /**
    * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html). The emissiveColor is added to the base color of the component. This can be autocast with a named string, hex string, array of rgb values, an object with `r`, `g`, `b` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object. Note that the alpha channel is ignored for emissive colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
    */
  var emissiveColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * Specifies a texture from which to get emissive color information. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The colors in the texture are added to the base color of the component. When using both an `emissiveTexture` and an [emissiveColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor) their values are multiplied and then added to the base color of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
    */
  var emissiveTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  /**
    * Specifies how much the material behaves like a metal. Values must be in the range 0 (non metal material) to 1 (metal material). Physically accurate materials are usually either a metal (1) or a non-metal (0) and not something inbetween.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
    *
    * @default 1
    */
  var metallic: js.UndefOr[Double] = js.undefined
  /**
    * Specifies a texture from which to get the combined metallic/roughness information. The metallic value should be stored in the `blue` channel, while the roughness value should be stored in the `green` channel. The `red` and `alpha` channels are ignored.  The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
    */
  var metallicRoughnessTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  /**
    * Allows to specify a texture to get the occlusion information from. This can be used to simulate the effect of ambient light on the object. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The occlusion value should be encoded in the red channel of the texture.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
    */
  var occlusionTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  /**
    * Indicates how rough the surface of the material is. Values must be in the range 0 (fully smooth surface) to 1 (fully diffuse surface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
    *
    * @default 1
    */
  var roughness: js.UndefOr[Double] = js.undefined
}

object MeshMaterialMetallicRoughnessProperties {
  @scala.inline
  def apply(
    alphaCutoff: js.UndefOr[Double] = js.undefined,
    alphaMode: auto | blend | opaque | mask = null,
    color: Color_ | js.Array[Double] | String = null,
    colorTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    doubleSided: js.UndefOr[Boolean] = js.undefined,
    emissiveColor: Color_ | js.Array[Double] | String = null,
    emissiveTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    metallic: js.UndefOr[Double] = js.undefined,
    metallicRoughnessTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    normalTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    occlusionTexture: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String = null,
    roughness: js.UndefOr[Double] = js.undefined
  ): MeshMaterialMetallicRoughnessProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaCutoff)) __obj.updateDynamic("alphaCutoff")(alphaCutoff.get.asInstanceOf[js.Any])
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorTexture != null) __obj.updateDynamic("colorTexture")(colorTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleSided)) __obj.updateDynamic("doubleSided")(doubleSided.get.asInstanceOf[js.Any])
    if (emissiveColor != null) __obj.updateDynamic("emissiveColor")(emissiveColor.asInstanceOf[js.Any])
    if (emissiveTexture != null) __obj.updateDynamic("emissiveTexture")(emissiveTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(metallic)) __obj.updateDynamic("metallic")(metallic.get.asInstanceOf[js.Any])
    if (metallicRoughnessTexture != null) __obj.updateDynamic("metallicRoughnessTexture")(metallicRoughnessTexture.asInstanceOf[js.Any])
    if (normalTexture != null) __obj.updateDynamic("normalTexture")(normalTexture.asInstanceOf[js.Any])
    if (occlusionTexture != null) __obj.updateDynamic("occlusionTexture")(occlusionTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(roughness)) __obj.updateDynamic("roughness")(roughness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshMaterialMetallicRoughnessProperties]
  }
}

