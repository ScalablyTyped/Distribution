package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMaterialMetallicRoughness extends MeshMaterial {
  /**
    * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html). The emissiveColor is added to the base color of the component. This can be autocast with a named string, hex string, array of rgb values, an object with `r`, `g`, `b` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object. Note that the alpha channel is ignored for emissive colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
    */
  var emissiveColor: Color_ = js.native
  /**
    * Specifies a texture from which to get emissive color information. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The colors in the texture are added to the base color of the component. When using both an `emissiveTexture` and an [emissiveColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor) their values are multiplied and then added to the base color of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
    */
  var emissiveTexture: MeshTexture = js.native
  /**
    * Specifies how much the material behaves like a metal. Values must be in the range 0 (non metal material) to 1 (metal material). Physically accurate materials are usually either a metal (1) or a non-metal (0) and not something inbetween.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
    *
    * @default 1
    */
  var metallic: Double = js.native
  /**
    * Specifies a texture from which to get the combined metallic/roughness information. The metallic value should be stored in the `blue` channel, while the roughness value should be stored in the `green` channel. The `red` and `alpha` channels are ignored.  The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
    */
  var metallicRoughnessTexture: MeshTexture = js.native
  /**
    * Allows to specify a texture to get the occlusion information from. This can be used to simulate the effect of ambient light on the object. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. The occlusion value should be encoded in the red channel of the texture.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
    */
  var occlusionTexture: MeshTexture = js.native
  /**
    * Indicates how rough the surface of the material is. Values must be in the range 0 (fully smooth surface) to 1 (fully diffuse surface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
    *
    * @default 1
    */
  var roughness: Double = js.native
}

