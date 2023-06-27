package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.OpacitySliderProperties
import typings.arcgisJsApi.esri.opacityVisualVariableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.OpacitySlider")
@js.native
/**
		 * The OpacitySlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html)
		 */
open class OpacitySlider ()
  extends StObject
     with typings.arcgisJsApi.esri.OpacitySlider {
  def this(properties: OpacitySliderProperties) = this()
}
/* static members */
object OpacitySlider {
  
  @JSGlobal("__esri.OpacitySlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create an OpacitySlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult) of the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#fromVisualVariableResult)
  		 */
  inline def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult): typings.arcgisJsApi.esri.OpacitySlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVisualVariableResult")(visualVariableResult.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.OpacitySlider]
  inline def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult, histogramResult: HistogramResult): typings.arcgisJsApi.esri.OpacitySlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVisualVariableResult")(visualVariableResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.OpacitySlider]
}
