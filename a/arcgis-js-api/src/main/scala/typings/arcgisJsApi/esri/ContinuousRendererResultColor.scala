package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousRendererResultColor extends StObject {
  
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
    */
  var colorScheme: ColorScheme
  
  /**
    * A color visual variable configured based on the statistics of the data and the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#ContinuousRendererResult)
    */
  var visualVariable: ColorVariable
}
object ContinuousRendererResultColor {
  
  inline def apply(colorScheme: ColorScheme, visualVariable: ColorVariable): ContinuousRendererResultColor = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any], visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousRendererResultColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousRendererResultColor] (val x: Self) extends AnyVal {
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setVisualVariable(value: ColorVariable): Self = StObject.set(x, "visualVariable", value.asInstanceOf[js.Any])
  }
}
