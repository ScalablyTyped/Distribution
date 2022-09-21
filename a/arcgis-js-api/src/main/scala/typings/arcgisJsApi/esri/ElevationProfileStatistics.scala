package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileStatistics
  extends StObject
     with Object {
  
  /**
    * The average elevation along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var avgElevation: Double
  
  /**
    * The average slope along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var avgSlope: Double
  
  /**
    * The cumulative elevation gain along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var elevationGain: Double
  
  /**
    * The cumulative elevation loss along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var elevationLoss: Double
  
  /**
    * The maximum distance or length of the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var maxDistance: Double
  
  /**
    * The maximum elevation along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var maxElevation: Double
  
  /**
    * The maximum slope along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var maxSlope: Double
  
  /**
    * The minimum elevation along the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLine.html#ElevationProfileStatistics)
    */
  var minElevation: Double
}
object ElevationProfileStatistics {
  
  inline def apply(
    avgElevation: Double,
    avgSlope: Double,
    constructor: js.Function,
    elevationGain: Double,
    elevationLoss: Double,
    hasOwnProperty: PropertyKey => Boolean,
    maxDistance: Double,
    maxElevation: Double,
    maxSlope: Double,
    minElevation: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationProfileStatistics = {
    val __obj = js.Dynamic.literal(avgElevation = avgElevation.asInstanceOf[js.Any], avgSlope = avgSlope.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], elevationGain = elevationGain.asInstanceOf[js.Any], elevationLoss = elevationLoss.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxDistance = maxDistance.asInstanceOf[js.Any], maxElevation = maxElevation.asInstanceOf[js.Any], maxSlope = maxSlope.asInstanceOf[js.Any], minElevation = minElevation.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationProfileStatistics]
  }
  
  extension [Self <: ElevationProfileStatistics](x: Self) {
    
    inline def setAvgElevation(value: Double): Self = StObject.set(x, "avgElevation", value.asInstanceOf[js.Any])
    
    inline def setAvgSlope(value: Double): Self = StObject.set(x, "avgSlope", value.asInstanceOf[js.Any])
    
    inline def setElevationGain(value: Double): Self = StObject.set(x, "elevationGain", value.asInstanceOf[js.Any])
    
    inline def setElevationLoss(value: Double): Self = StObject.set(x, "elevationLoss", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxElevation(value: Double): Self = StObject.set(x, "maxElevation", value.asInstanceOf[js.Any])
    
    inline def setMaxSlope(value: Double): Self = StObject.set(x, "maxSlope", value.asInstanceOf[js.Any])
    
    inline def setMinElevation(value: Double): Self = StObject.set(x, "minElevation", value.asInstanceOf[js.Any])
  }
}
