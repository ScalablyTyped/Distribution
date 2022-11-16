package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClassedSizeSlider
import typings.arcgisJsApi.esri.ClassedSizeSliderProperties
import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.sizeClassBreaksRendererResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSmartMappingClassedSizeSliderMod {
  
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
    */
  open class ^ ()
    extends StObject
       with ClassedSizeSlider {
    def this(properties: ClassedSizeSliderProperties) = this()
  }
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A convenience function used to create a ClassedSizeSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#fromRendererResult)
    */
  inline def fromRendererResult(rendererResult: sizeClassBreaksRendererResult): ClassedSizeSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any]).asInstanceOf[ClassedSizeSlider]
  inline def fromRendererResult(rendererResult: sizeClassBreaksRendererResult, histogramResult: HistogramResult): ClassedSizeSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRendererResult")(rendererResult.asInstanceOf[js.Any], histogramResult.asInstanceOf[js.Any])).asInstanceOf[ClassedSizeSlider]
}
