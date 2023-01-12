package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.direct
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthDimensionProperties extends StObject {
  
  /**
    * Ending point for the dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint)
    */
  var endPoint: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The type of length that should be measured between the [startPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint) and [endPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint).
    *
    * @default "direct"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#measureType)
    */
  var measureType: js.UndefOr[direct | horizontal | vertical] = js.undefined
  
  /**
    * Styling option that controls the shortest distance from the [startPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint) or [endPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint) to the dimension line in meters.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#offset)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The orientation determines the relative direction the dimension line is extended to.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#orientation)
    */
  var orientation: js.UndefOr[Double] = js.undefined
  
  /**
    * Starting point for the dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint)
    */
  var startPoint: js.UndefOr[PointProperties] = js.undefined
}
object LengthDimensionProperties {
  
  inline def apply(): LengthDimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthDimensionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LengthDimensionProperties] (val x: Self) extends AnyVal {
    
    inline def setEndPoint(value: PointProperties): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    inline def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
    
    inline def setMeasureType(value: direct | horizontal | vertical): Self = StObject.set(x, "measureType", value.asInstanceOf[js.Any])
    
    inline def setMeasureTypeUndefined: Self = StObject.set(x, "measureType", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setStartPoint(value: PointProperties): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
    
    inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
  }
}
