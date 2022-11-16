package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.SizeSliderProperties
import typings.arcgisJsApi.esri.sizeContinuousRendererResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SizeSlider")
@js.native
/**
  * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
  */
open class SizeSlider ()
  extends StObject
     with typings.arcgisJsApi.esri.SizeSlider {
  def this(properties: SizeSliderProperties) = this()
}
/* static members */
object SizeSlider {
  
  @JSGlobal("__esri.SizeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a SizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: sizeContinuousRendererResult): typings.arcgisJsApi.esri.SizeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SizeSlider]
  inline def fromRendererResult(rendererResult: sizeContinuousRendererResult, histogramResult: HistogramResult): typings.arcgisJsApi.esri.SizeSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.SizeSlider]
}
