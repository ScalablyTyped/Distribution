package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TimeSliderProperties
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TimeSlider")
@js.native
/**
		 * The TimeSlider widget simplifies visualization of temporal data in your application.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html)
		 */
open class TimeSlider ()
  extends StObject
     with typings.arcgisJsApi.esri.TimeSlider {
  def this(properties: TimeSliderProperties) = this()
}
/* static members */
object TimeSlider {
  
  @JSGlobal("__esri.TimeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Extracts time slider settings from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) if the webmap contains a [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) definition.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#getPropertiesFromWebMap)
  		 */
  inline def getPropertiesFromWebMap(webMap: typings.arcgisJsApi.esri.WebMap): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def getPropertiesFromWebMap(webMap: typings.arcgisJsApi.esri.WebMap, signal: AbortSignal): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesFromWebMap")(webMap.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
