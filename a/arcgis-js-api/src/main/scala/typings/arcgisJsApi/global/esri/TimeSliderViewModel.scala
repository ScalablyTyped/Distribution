package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TimeSliderViewModelProperties
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TimeSliderViewModel")
@js.native
/**
  * Provides the logic for the [TimeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html)
  */
open class TimeSliderViewModel ()
  extends StObject
     with typings.arcgisJsApi.esri.TimeSliderViewModel {
  def this(properties: TimeSliderViewModelProperties) = this()
}
/* static members */
object TimeSliderViewModel {
  
  @JSGlobal("__esri.TimeSliderViewModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extracts time slider settings from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) if the webmap contains a [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#getPropertiesFromWebMap)
    */
  inline def getPropertiesFromWebMap(webMap: typings.arcgisJsApi.esri.WebMap): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def getPropertiesFromWebMap(webMap: typings.arcgisJsApi.esri.WebMap, signal: AbortSignal): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
