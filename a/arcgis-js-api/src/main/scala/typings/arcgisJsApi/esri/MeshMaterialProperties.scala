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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterialProperties extends js.Object {
  
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
  implicit class MeshMaterialPropertiesOps[Self <: MeshMaterialProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlphaCutoff(value: Double): Self = this.set("alphaCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaCutoff: Self = this.set("alphaCutoff", js.undefined)
    
    @scala.inline
    def setAlphaMode(value: auto | blend | opaque | mask): Self = this.set("alphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphaMode: Self = this.set("alphaMode", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = this.set("colorTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorTexture: Self = this.set("colorTexture", js.undefined)
    
    @scala.inline
    def setDoubleSided(value: Boolean): Self = this.set("doubleSided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleSided: Self = this.set("doubleSided", js.undefined)
    
    @scala.inline
    def setNormalTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = this.set("normalTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalTexture: Self = this.set("normalTexture", js.undefined)
  }
}
