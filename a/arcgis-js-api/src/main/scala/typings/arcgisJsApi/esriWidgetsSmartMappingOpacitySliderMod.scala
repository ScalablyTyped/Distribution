package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.OpacitySlider
import typings.arcgisJsApi.esri.OpacitySliderProperties
import typings.arcgisJsApi.esri.opacityVisualVariableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingOpacitySliderMod {
  
  @JSImport("esri/widgets/smartMapping/OpacitySlider", JSImport.Namespace)
  @js.native
  /**
  		 * The OpacitySlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with an [OpacityVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html)
  		 */
  open class ^ ()
    extends StObject
       with OpacitySlider {
    def this(properties: OpacitySliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/OpacitySlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create an OpacitySlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#VisualVariableResult) of the [createVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-OpacitySlider.html#fromVisualVariableResult)
  		 */
  inline def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult): OpacitySlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVisualVariableResult")(visualVariableResult.asInstanceOf[js.Any]).asInstanceOf[OpacitySlider]
  inline def fromVisualVariableResult(visualVariableResult: opacityVisualVariableResult, histogramResult: HistogramResult): OpacitySlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVisualVariableResult")(visualVariableResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[OpacitySlider]
}
