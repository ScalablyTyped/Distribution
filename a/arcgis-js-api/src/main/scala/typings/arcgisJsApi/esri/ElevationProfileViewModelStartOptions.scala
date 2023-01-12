package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.select
import typings.arcgisJsApi.arcgisJsApiStrings.sketch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileViewModelStartOptions extends StObject {
  
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
  
  inline def apply(): ElevationProfileViewModelStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileViewModelStartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileViewModelStartOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: sketch | select): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
