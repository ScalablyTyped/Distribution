package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentAndRotationGeoreferenceProperties extends StObject {
  
  /**
    * An extent of the image or video element representing its geographic location when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * A rotation of the image or video element when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#rotation)
    */
  var rotation: js.UndefOr[Double] = js.undefined
}
object ExtentAndRotationGeoreferenceProperties {
  
  inline def apply(): ExtentAndRotationGeoreferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentAndRotationGeoreferenceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtentAndRotationGeoreferenceProperties] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
