package typings.arcgisJsApi.esri

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshMaterialMetallicRoughnessProperties
  extends StObject
     with MeshMaterialProperties {
  
  /**
  		 * Specifies a single, uniform emissive color for the [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveColor)
  		 */
  var emissiveColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * Specifies a texture from which to get emissive color information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTexture)
  		 */
  var emissiveTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  
  /**
  		 * A transformation of UV mesh coordinates used to sample the emissive texture.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#emissiveTextureTransform)
  		 */
  var emissiveTextureTransform: js.UndefOr[MeshTextureTransformProperties] = js.undefined
  
  /**
  		 * Specifies how much the material behaves like a metal.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallic)
  		 */
  var metallic: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies a texture from which to get the combined metallic/roughness information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#metallicRoughnessTexture)
  		 */
  var metallicRoughnessTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  
  /**
  		 * Allows to specify a texture to get the occlusion information from.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTexture)
  		 */
  var occlusionTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  
  /**
  		 * A transformation of UV mesh coordinates used to sample the occlusion texture.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#occlusionTextureTransform)
  		 */
  var occlusionTextureTransform: js.UndefOr[MeshTextureTransformProperties] = js.undefined
  
  /**
  		 * Indicates how rough the surface of the material is.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html#roughness)
  		 */
  var roughness: js.UndefOr[Double] = js.undefined
}
object MeshMaterialMetallicRoughnessProperties {
  
  inline def apply(): MeshMaterialMetallicRoughnessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialMetallicRoughnessProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshMaterialMetallicRoughnessProperties] (val x: Self) extends AnyVal {
    
    inline def setEmissiveColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "emissiveColor", value.asInstanceOf[js.Any])
    
    inline def setEmissiveColorUndefined: Self = StObject.set(x, "emissiveColor", js.undefined)
    
    inline def setEmissiveColorVarargs(value: Double*): Self = StObject.set(x, "emissiveColor", js.Array(value*))
    
    inline def setEmissiveTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "emissiveTexture", value.asInstanceOf[js.Any])
    
    inline def setEmissiveTextureTransform(value: MeshTextureTransformProperties): Self = StObject.set(x, "emissiveTextureTransform", value.asInstanceOf[js.Any])
    
    inline def setEmissiveTextureTransformUndefined: Self = StObject.set(x, "emissiveTextureTransform", js.undefined)
    
    inline def setEmissiveTextureUndefined: Self = StObject.set(x, "emissiveTexture", js.undefined)
    
    inline def setMetallic(value: Double): Self = StObject.set(x, "metallic", value.asInstanceOf[js.Any])
    
    inline def setMetallicRoughnessTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "metallicRoughnessTexture", value.asInstanceOf[js.Any])
    
    inline def setMetallicRoughnessTextureUndefined: Self = StObject.set(x, "metallicRoughnessTexture", js.undefined)
    
    inline def setMetallicUndefined: Self = StObject.set(x, "metallic", js.undefined)
    
    inline def setOcclusionTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "occlusionTexture", value.asInstanceOf[js.Any])
    
    inline def setOcclusionTextureTransform(value: MeshTextureTransformProperties): Self = StObject.set(x, "occlusionTextureTransform", value.asInstanceOf[js.Any])
    
    inline def setOcclusionTextureTransformUndefined: Self = StObject.set(x, "occlusionTextureTransform", js.undefined)
    
    inline def setOcclusionTextureUndefined: Self = StObject.set(x, "occlusionTexture", js.undefined)
    
    inline def setRoughness(value: Double): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
    
    inline def setRoughnessUndefined: Self = StObject.set(x, "roughness", js.undefined)
  }
}
