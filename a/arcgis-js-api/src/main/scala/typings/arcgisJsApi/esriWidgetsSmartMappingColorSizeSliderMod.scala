package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColorSizeSlider
import typings.arcgisJsApi.esri.ColorSizeSliderProperties
import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.univariateColorSizeContinuousRendererResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingColorSizeSliderMod {
  
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ColorSizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) and a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html)
    */
  open class ^ ()
    extends StObject
       with ColorSizeSlider {
    def this(properties: ColorSizeSliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a ColorSizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult) of the [univariateColorSize.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult): ColorSizeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[ColorSizeSlider]
  inline def fromRendererResult(rendererResult: univariateColorSizeContinuousRendererResult, histogramResult: HistogramResult): ColorSizeSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[ColorSizeSlider]
}
