package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.hourly
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelDurationOptions
  extends StObject
     with AnonymousAccessor {
  
  /**
    * Color of the shadow cast.
    *
    * @default [50, 50, 50, 0.7]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * Mode in which the cumulative shadow duration should be displayed: as a continuous surface or as an hourly aggregation of values.
    *
    * @default "continuous"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var mode: js.UndefOr[continuous | hourly] = js.undefined
}
object ShadowCastViewModelDurationOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, ShadowCastViewModelDurationOptions]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], ShadowCastViewModelDurationOptions]])
  ): ShadowCastViewModelDurationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowCastViewModelDurationOptions]
  }
  
  extension [Self <: ShadowCastViewModelDurationOptions](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMode(value: continuous | hourly): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
