package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.blend
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.opaque
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshMaterialProperties extends StObject {
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    */
  var alphaCutoff: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * @default "auto"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    */
  var alphaMode: js.UndefOr[auto | blend | opaque | mask] = js.undefined
  
  /**
    * Specifies a single, uniform color for the mesh component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Specifies a texture from which to get color information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
  
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    */
  var doubleSided: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a texture from which to get normal information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.undefined
}
object MeshMaterialProperties {
  
  inline def apply(): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialProperties]
  }
  
  extension [Self <: MeshMaterialProperties](x: Self) {
    
    inline def setAlphaCutoff(value: Double): Self = StObject.set(x, "alphaCutoff", value.asInstanceOf[js.Any])
    
    inline def setAlphaCutoffUndefined: Self = StObject.set(x, "alphaCutoff", js.undefined)
    
    inline def setAlphaMode(value: auto | blend | opaque | mask): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "colorTexture", value.asInstanceOf[js.Any])
    
    inline def setColorTextureUndefined: Self = StObject.set(x, "colorTexture", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDoubleSided(value: Boolean): Self = StObject.set(x, "doubleSided", value.asInstanceOf[js.Any])
    
    inline def setDoubleSidedUndefined: Self = StObject.set(x, "doubleSided", js.undefined)
    
    inline def setNormalTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "normalTexture", value.asInstanceOf[js.Any])
    
    inline def setNormalTextureUndefined: Self = StObject.set(x, "normalTexture", js.undefined)
  }
}
