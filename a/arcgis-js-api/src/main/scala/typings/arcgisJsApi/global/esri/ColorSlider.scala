package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorSliderProperties
import typings.arcgisJsApi.esri.ContinuousRendererResult
import typings.arcgisJsApi.esri.HistogramResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorSlider")
@js.native
/**
  * The ColorSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html)
  */
open class ColorSlider ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorSlider {
  def this(properties: ColorSliderProperties) = this()
}
/* static members */
object ColorSlider {
  
  @JSGlobal("__esri.ColorSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a ColorSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: ContinuousRendererResult): typings.arcgisJsApi.esri.ColorSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorSlider]
  inline def fromRendererResult(rendererResult: ContinuousRendererResult, histogramResult: HistogramResult): typings.arcgisJsApi.esri.ColorSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.ColorSlider]
}
