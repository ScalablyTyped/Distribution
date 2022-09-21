package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderBaseVisibleElements
  extends StObject
     with Object {
  
  /**
    * When `true`, displays interactive segments on the track that maintain the interval between two slider thumbs/handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#visibleElements)
    */
  var interactiveTrack: js.UndefOr[Boolean] = js.undefined
}
object SmartMappingSliderBaseVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SmartMappingSliderBaseVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SmartMappingSliderBaseVisibleElements]
  }
  
  extension [Self <: SmartMappingSliderBaseVisibleElements](x: Self) {
    
    inline def setInteractiveTrack(value: Boolean): Self = StObject.set(x, "interactiveTrack", value.asInstanceOf[js.Any])
    
    inline def setInteractiveTrackUndefined: Self = StObject.set(x, "interactiveTrack", js.undefined)
  }
}
