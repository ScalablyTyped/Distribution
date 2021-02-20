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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterialProperties extends StObject {
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    */
  var alphaCutoff: js.UndefOr[Double] = js.native
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    */
  var alphaMode: js.UndefOr[auto | blend | opaque | mask] = js.native
  
  /**
    * Specifies a single, uniform color for the mesh component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * Specifies a texture from which to get color information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    */
  var doubleSided: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a texture from which to get normal information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
}
object MeshMaterialProperties {
  
  @scala.inline
  def apply(): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialProperties]
  }
  
  @scala.inline
  implicit class MeshMaterialPropertiesMutableBuilder[Self <: MeshMaterialProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphaCutoff(value: Double): Self = StObject.set(x, "alphaCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaCutoffUndefined: Self = StObject.set(x, "alphaCutoff", js.undefined)
    
    @scala.inline
    def setAlphaMode(value: auto | blend | opaque | mask): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "colorTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTextureUndefined: Self = StObject.set(x, "colorTexture", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDoubleSided(value: Boolean): Self = StObject.set(x, "doubleSided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleSidedUndefined: Self = StObject.set(x, "doubleSided", js.undefined)
    
    @scala.inline
    def setNormalTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = StObject.set(x, "normalTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalTextureUndefined: Self = StObject.set(x, "normalTexture", js.undefined)
  }
}
