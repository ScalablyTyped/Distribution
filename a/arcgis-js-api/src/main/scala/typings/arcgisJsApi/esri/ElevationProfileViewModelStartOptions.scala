package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.select
import typings.arcgisJsApi.arcgisJsApiStrings.sketch
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileViewModelStartOptions
  extends StObject
     with Object {
  
  /**
    * The mode that the widget will start with.
    *
    * @default "sketch"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#start)
    */
  var mode: js.UndefOr[sketch | select] = js.undefined
}
object ElevationProfileViewModelStartOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationProfileViewModelStartOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationProfileViewModelStartOptions]
  }
  
  extension [Self <: ElevationProfileViewModelStartOptions](x: Self) {
    
    inline def setMode(value: sketch | select): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
