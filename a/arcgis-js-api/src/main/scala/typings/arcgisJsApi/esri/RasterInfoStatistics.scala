package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterInfoStatistics
  extends StObject
     with Object {
  
  /**
    * The average of calculated pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var avg: Double
  
  /**
    * The maximum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var max: Double
  
  /**
    * The minimum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var min: Double
  
  /**
    * The standard deviation of calculated pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var stddev: Double
}
object RasterInfoStatistics {
  
  @scala.inline
  def apply(
    avg: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stddev: Double
  ): RasterInfoStatistics = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterInfoStatistics]
  }
  
  @scala.inline
  implicit class RasterInfoStatisticsMutableBuilder[Self <: RasterInfoStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
  }
}
