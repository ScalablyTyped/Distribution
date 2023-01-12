package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapTimeSlider extends StObject {
  
  /**
    * The current time extent of the time slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var currentTimeExtent: TimeExtent
  
  /**
    * The temporal extent for the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var fullTimeExtent: TimeExtent
  
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var loop: Boolean
  
  /**
    * The number of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var numStops: Double
  
  /**
    * The thumb count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var numThumbs: Double
  
  /**
    * The time rate in milliseconds between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var stopDelay: Double
  
  /**
    * Defines regularly spaced stops on the time slider from a [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var stopInterval: TimeInterval
  
  /**
    * An array of dates for the time slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#TimeSlider)
    */
  var stops: js.Array[js.Date]
}
object WebMapTimeSlider {
  
  inline def apply(
    currentTimeExtent: TimeExtent,
    fullTimeExtent: TimeExtent,
    loop: Boolean,
    numStops: Double,
    numThumbs: Double,
    stopDelay: Double,
    stopInterval: TimeInterval,
    stops: js.Array[js.Date]
  ): WebMapTimeSlider = {
    val __obj = js.Dynamic.literal(currentTimeExtent = currentTimeExtent.asInstanceOf[js.Any], fullTimeExtent = fullTimeExtent.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], numStops = numStops.asInstanceOf[js.Any], numThumbs = numThumbs.asInstanceOf[js.Any], stopDelay = stopDelay.asInstanceOf[js.Any], stopInterval = stopInterval.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapTimeSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebMapTimeSlider] (val x: Self) extends AnyVal {
    
    inline def setCurrentTimeExtent(value: TimeExtent): Self = StObject.set(x, "currentTimeExtent", value.asInstanceOf[js.Any])
    
    inline def setFullTimeExtent(value: TimeExtent): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setNumStops(value: Double): Self = StObject.set(x, "numStops", value.asInstanceOf[js.Any])
    
    inline def setNumThumbs(value: Double): Self = StObject.set(x, "numThumbs", value.asInstanceOf[js.Any])
    
    inline def setStopDelay(value: Double): Self = StObject.set(x, "stopDelay", value.asInstanceOf[js.Any])
    
    inline def setStopInterval(value: TimeInterval): Self = StObject.set(x, "stopInterval", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Date]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: js.Date*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
