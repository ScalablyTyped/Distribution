package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSliderConstructor
  extends StObject
     with /**
  * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
  */
Instantiable0[ClassedColorSlider]
     with Instantiable1[/* properties */ ClassedColorSliderProperties, ClassedColorSlider] {
  
  /**
    * A convenience function used to create a ClassedColorSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#fromRendererResult)
    */
  def fromRendererResult(rendererResult: ClassBreaksRendererResult): ClassedColorSlider = js.native
  def fromRendererResult(rendererResult: ClassBreaksRendererResult, histogramResult: HistogramResult): ClassedColorSlider = js.native
}
