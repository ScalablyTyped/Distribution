package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorSizeSliderProperties
import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.univariateColorSizeContinuousRendererResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorSizeSlider")
@js.native
/**
		 * The ColorSizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html)
		 */
open class ColorSizeSlider ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorSizeSlider {
  def this(properties: ColorSizeSliderProperties) = this()
}
/* static members */
object ColorSizeSlider {
  
  @JSGlobal("__esri.ColorSizeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create a ColorSizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult) of the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#fromRendererResult)
  		 */
  inline def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult): typings.arcgisJsApi.esri.ColorSizeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorSizeSlider]
  inline def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult, histogramResult: HistogramResult): typings.arcgisJsApi.esri.ColorSizeSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.ColorSizeSlider]
}
