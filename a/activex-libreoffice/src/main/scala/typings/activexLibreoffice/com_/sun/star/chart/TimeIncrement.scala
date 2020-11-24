package typings.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link TimeIncrement} describes how tickmarks are positioned on the scale of a date-time axis.
  * @since OOo 3.4
  */
@js.native
trait TimeIncrement extends js.Object {
  
  /**
    * if the any contains a struct of type {@link com.sun.star.chart.TimeInterval} this is used as a fixed distance value for the major tickmarks.
    * Otherwise, if the any is empty or contains an incompatible type, the distance between major tickmarks is calculated automatically by the application.
    */
  var MajorTimeInterval: js.Any = js.native
  
  /**
    * if the any contains a struct of type {@link com.sun.star.chart.TimeInterval} this is used as a fixed distance value for the minor tickmarks.
    * Otherwise, if the any is empty or contains an incompatible type, the distance between minor tickmarks is calculated automatically by the application.
    */
  var MinorTimeInterval: js.Any = js.native
  
  /**
    * if the any contains a constant of type {@link com.sun.star.chart.TimeUnit} this is the smallest time unit that is displayed on the date-time axis.
    * Otherwise, if the any is empty or contains an incompatible type, the resolution is chosen automatically by the application.
    */
  var TimeResolution: js.Any = js.native
}
object TimeIncrement {
  
  @scala.inline
  def apply(MajorTimeInterval: js.Any, MinorTimeInterval: js.Any, TimeResolution: js.Any): TimeIncrement = {
    val __obj = js.Dynamic.literal(MajorTimeInterval = MajorTimeInterval.asInstanceOf[js.Any], MinorTimeInterval = MinorTimeInterval.asInstanceOf[js.Any], TimeResolution = TimeResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeIncrement]
  }
  
  @scala.inline
  implicit class TimeIncrementOps[Self <: TimeIncrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMajorTimeInterval(value: js.Any): Self = this.set("MajorTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTimeInterval(value: js.Any): Self = this.set("MinorTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeResolution(value: js.Any): Self = this.set("TimeResolution", value.asInstanceOf[js.Any])
  }
}
