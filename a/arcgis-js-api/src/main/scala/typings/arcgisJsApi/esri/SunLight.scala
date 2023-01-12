package typings.arcgisJsApi.esri

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunLight extends StObject {
  
  /**
    * The ambient light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var ambient: ColorAndIntensity
  
  /**
    * The diffuse light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var diffuse: ColorAndIntensity
  
  /**
    * The incident light direction in render coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var direction: ArrayLike[Double]
}
object SunLight {
  
  inline def apply(ambient: ColorAndIntensity, diffuse: ColorAndIntensity, direction: ArrayLike[Double]): SunLight = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunLight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SunLight] (val x: Self) extends AnyVal {
    
    inline def setAmbient(value: ColorAndIntensity): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setDiffuse(value: ColorAndIntensity): Self = StObject.set(x, "diffuse", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: ArrayLike[Double]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
