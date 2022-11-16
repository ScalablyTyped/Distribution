package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSliderConstructor
  extends StObject
     with Instantiable0[ColorSlider]
     with Instantiable1[/* properties */ ColorSliderProperties, ColorSlider] {
  
  /**
    * A convenience function used to create a ColorSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#fromRendererResult)
    */
  def fromRendererResult(rendererResult: ContinuousRendererResult): ColorSlider = js.native
  def fromRendererResult(rendererResult: ContinuousRendererResult, histogramResult: HistogramResult): ColorSlider = js.native
}
