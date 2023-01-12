package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionSimpleStyleProperties extends StObject {
  
  /**
    * Color of dimension lines.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Size of text in dimension labels in points.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#fontSize)
    */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Width of dimension lines in points.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#lineSize)
    */
  var lineSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Background color of dimension labels.
    *
    * @default [255, 255, 255, 0.6]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#textBackgroundColor)
    */
  var textBackgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Color of text in dimension labels.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#textColor)
    */
  var textColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object DimensionSimpleStyleProperties {
  
  inline def apply(): DimensionSimpleStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionSimpleStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionSimpleStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLineSize(value: Double | String): Self = StObject.set(x, "lineSize", value.asInstanceOf[js.Any])
    
    inline def setLineSizeUndefined: Self = StObject.set(x, "lineSize", js.undefined)
    
    inline def setTextBackgroundColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
    
    inline def setTextBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "textBackgroundColor", js.Array(value*))
    
    inline def setTextColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextColorVarargs(value: Double*): Self = StObject.set(x, "textColor", js.Array(value*))
  }
}
