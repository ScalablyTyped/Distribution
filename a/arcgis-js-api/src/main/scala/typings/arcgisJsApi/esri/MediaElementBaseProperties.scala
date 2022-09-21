package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CornersGeoreferenceProper
import typings.arcgisJsApi.anon.ExtentAndRotationGeorefer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaElementBaseProperties extends StObject {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  var georeference: js.UndefOr[ExtentAndRotationGeorefer | CornersGeoreferenceProper] = js.undefined
  
  /**
    * The opacity of the element.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object MediaElementBaseProperties {
  
  inline def apply(): MediaElementBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaElementBaseProperties]
  }
  
  extension [Self <: MediaElementBaseProperties](x: Self) {
    
    inline def setGeoreference(value: ExtentAndRotationGeorefer | CornersGeoreferenceProper): Self = StObject.set(x, "georeference", value.asInstanceOf[js.Any])
    
    inline def setGeoreferenceUndefined: Self = StObject.set(x, "georeference", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
