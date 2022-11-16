package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColorSlider
import typings.arcgisJsApi.esri.ColorSliderProperties
import typings.arcgisJsApi.esri.ContinuousRendererResult
import typings.arcgisJsApi.esri.HistogramResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingColorSliderMod {
  
  @JSImport("esri/widgets/smartMapping/ColorSlider", JSImport.Namespace)
  @js.native
  /**
    * The ColorSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html)
    */
  open class ^ ()
    extends StObject
       with ColorSlider {
    def this(properties: ColorSliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/ColorSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a ColorSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: ContinuousRendererResult): ColorSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[ColorSlider]
  inline def fromRendererResult(rendererResult: ContinuousRendererResult, histogramResult: HistogramResult): ColorSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[ColorSlider]
}
