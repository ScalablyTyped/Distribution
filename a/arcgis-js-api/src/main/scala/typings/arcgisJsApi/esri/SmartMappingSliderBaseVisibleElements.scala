package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderBaseVisibleElements extends StObject {
  
  /**
    * When `true`, displays interactive segments on the track that maintain the interval between two slider thumbs/handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#visibleElements)
    */
  var interactiveTrack: js.UndefOr[Boolean] = js.undefined
}
object SmartMappingSliderBaseVisibleElements {
  
  inline def apply(): SmartMappingSliderBaseVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderBaseVisibleElements]
  }
  
  extension [Self <: SmartMappingSliderBaseVisibleElements](x: Self) {
    
    inline def setInteractiveTrack(value: Boolean): Self = StObject.set(x, "interactiveTrack", value.asInstanceOf[js.Any])
    
    inline def setInteractiveTrackUndefined: Self = StObject.set(x, "interactiveTrack", js.undefined)
  }
}
