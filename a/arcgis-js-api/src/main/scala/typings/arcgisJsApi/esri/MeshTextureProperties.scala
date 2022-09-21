package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clamp
import typings.arcgisJsApi.arcgisJsApiStrings.mirror
import typings.arcgisJsApi.arcgisJsApiStrings.repeat
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshTextureProperties extends StObject {
  
  /**
    * A direct reference to the image or video data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: js.UndefOr[HTMLImageElement | HTMLCanvasElement | Any | ImageData] = js.undefined
  
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The url to the image resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled.
    *
    * @default "repeat"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    */
  var wrap: js.UndefOr[clamp | repeat | mirror | SeparableWrapModes] = js.undefined
}
object MeshTextureProperties {
  
  inline def apply(): MeshTextureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshTextureProperties]
  }
  
  extension [Self <: MeshTextureProperties](x: Self) {
    
    inline def setData(value: HTMLImageElement | HTMLCanvasElement | Any | ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWrap(value: clamp | repeat | mirror | SeparableWrapModes): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
