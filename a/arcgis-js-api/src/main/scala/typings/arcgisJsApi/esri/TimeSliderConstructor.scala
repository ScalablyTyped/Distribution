package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSliderConstructor
  extends StObject
     with /**
  * The TimeSlider widget simplifies visualization of temporal data in your application.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html)
  */
Instantiable0[TimeSlider]
     with Instantiable1[/* properties */ TimeSliderProperties, TimeSlider] {
  
  /**
    * Extracts time slider settings from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) if the webmap contains a [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider) definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#getPropertiesFromWebMap)
    */
  def getPropertiesFromWebMap(webMap: WebMap): js.Promise[Any] = js.native
  def getPropertiesFromWebMap(webMap: WebMap, signal: AbortSignal): js.Promise[Any] = js.native
}
