package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.SizeSlider
import typings.arcgisJsApi.esri.SizeSliderProperties
import typings.arcgisJsApi.esri.sizeContinuousRendererResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingSizeSliderMod {
  
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  /**
  		 * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
  		 */
  open class ^ ()
    extends StObject
       with SizeSlider {
    def this(properties: SizeSliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create a SizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#fromRendererResult)
  		 */
  inline def fromRendererResult(rendererResult: sizeContinuousRendererResult): SizeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[SizeSlider]
  inline def fromRendererResult(rendererResult: sizeContinuousRendererResult, histogramResult: HistogramResult): SizeSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[SizeSlider]
}
