package typings.activexLibreoffice.com_.sun.star.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link TimeIncrement} describes how tickmarks are positioned on the scale of a date-time axis.
  * @since OOo 3.4
  */
trait TimeIncrement extends StObject {
  
  /**
    * if the any contains a struct of type {@link com.sun.star.chart.TimeInterval} this is used as a fixed distance value for the major tickmarks.
    * Otherwise, if the any is empty or contains an incompatible type, the distance between major tickmarks is calculated automatically by the application.
    */
  var MajorTimeInterval: Any
  
  /**
    * if the any contains a struct of type {@link com.sun.star.chart.TimeInterval} this is used as a fixed distance value for the minor tickmarks.
    * Otherwise, if the any is empty or contains an incompatible type, the distance between minor tickmarks is calculated automatically by the application.
    */
  var MinorTimeInterval: Any
  
  /**
    * if the any contains a constant of type {@link com.sun.star.chart.TimeUnit} this is the smallest time unit that is displayed on the date-time axis.
    * Otherwise, if the any is empty or contains an incompatible type, the resolution is chosen automatically by the application.
    */
  var TimeResolution: Any
}
object TimeIncrement {
  
  inline def apply(MajorTimeInterval: Any, MinorTimeInterval: Any, TimeResolution: Any): TimeIncrement = {
    val __obj = js.Dynamic.literal(MajorTimeInterval = MajorTimeInterval.asInstanceOf[js.Any], MinorTimeInterval = MinorTimeInterval.asInstanceOf[js.Any], TimeResolution = TimeResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeIncrement]
  }
  
  extension [Self <: TimeIncrement](x: Self) {
    
    inline def setMajorTimeInterval(value: Any): Self = StObject.set(x, "MajorTimeInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTimeInterval(value: Any): Self = StObject.set(x, "MinorTimeInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeResolution(value: Any): Self = StObject.set(x, "TimeResolution", value.asInstanceOf[js.Any])
  }
}
