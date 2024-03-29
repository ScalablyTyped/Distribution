package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterialMetallicRoughness
  extends StObject
     with MeshMaterial {
  
  /**
  		 * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
  		 */
  var emissiveColor: Color_ = js.native
  
  /**
  		 * Specifies a texture from which to get emissive color information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
  		 */
  var emissiveTexture: MeshTexture = js.native
  
  /**
  		 * A transformation of UV mesh coordinates used to sample the emissive texture.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTextureTransform)
  		 */
  var emissiveTextureTransform: MeshTextureTransform = js.native
  
  /**
  		 * Specifies how much the material behaves like a metal.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
  		 */
  var metallic: Double = js.native
  
  /**
  		 * Specifies a texture from which to get the combined metallic/roughness information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
  		 */
  var metallicRoughnessTexture: MeshTexture = js.native
  
  /**
  		 * Allows to specify a texture to get the occlusion information from.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
  		 */
  var occlusionTexture: MeshTexture = js.native
  
  /**
  		 * A transformation of UV mesh coordinates used to sample the occlusion texture.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTextureTransform)
  		 */
  var occlusionTextureTransform: MeshTextureTransform = js.native
  
  /**
  		 * Indicates how rough the surface of the material is.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
  		 */
  var roughness: Double = js.native
}
