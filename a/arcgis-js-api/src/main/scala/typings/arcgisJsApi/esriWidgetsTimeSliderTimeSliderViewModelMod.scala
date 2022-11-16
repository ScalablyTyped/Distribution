package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TimeSliderViewModel
import typings.arcgisJsApi.esri.TimeSliderViewModelProperties
import typings.arcgisJsApi.esri.WebMap
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsTimeSliderTimeSliderViewModelMod {
  
  @JSImport("esri/widgets/TimeSlider/TimeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [TimeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html)
    */
  open class ^ ()
    extends StObject
       with TimeSliderViewModel {
    def this(properties: TimeSliderViewModelProperties) = this()
  }
  @JSImport("esri/widgets/TimeSlider/TimeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extracts time slider settings from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) if the webmap contains a [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html#getPropertiesFromWebMap)
    */
  inline def getPropertiesFromWebMap(webMap: WebMap): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def getPropertiesFromWebMap(webMap: WebMap, signal: AbortSignal): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
