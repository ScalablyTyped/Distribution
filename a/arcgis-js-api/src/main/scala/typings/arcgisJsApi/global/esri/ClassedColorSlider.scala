package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ClassBreaksRendererResult
import typings.arcgisJsApi.esri.ClassedColorSliderProperties
import typings.arcgisJsApi.esri.HistogramResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ClassedColorSlider")
@js.native
/**
  * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
  */
open class ClassedColorSlider ()
  extends StObject
     with typings.arcgisJsApi.esri.ClassedColorSlider {
  def this(properties: ClassedColorSliderProperties) = this()
}
/* static members */
object ClassedColorSlider {
  
  @JSGlobal("__esri.ClassedColorSlider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a ClassedColorSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: ClassBreaksRendererResult): typings.arcgisJsApi.esri.ClassedColorSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ClassedColorSlider]
  inline def fromRendererResult(rendererResult: ClassBreaksRendererResult, histogramResult: HistogramResult): typings.arcgisJsApi.esri.ClassedColorSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.ClassedColorSlider]
}
