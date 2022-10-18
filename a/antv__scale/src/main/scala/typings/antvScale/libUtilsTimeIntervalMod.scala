package typings.antvScale

import typings.antvScale.anon.Ceil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsTimeIntervalMod {
  
  @JSImport("@antv/scale/lib/utils/time-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_DAY")
  @js.native
  val DURATION_DAY: Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_HOUR")
  @js.native
  val DURATION_HOUR: Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_MINUTE")
  @js.native
  val DURATION_MINUTE: Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_MONTH")
  @js.native
  val DURATION_MONTH: Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_SECOND")
  @js.native
  val DURATION_SECOND: /* 1000 */ Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_WEEK")
  @js.native
  val DURATION_WEEK: Double = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "DURATION_YEAR")
  @js.native
  val DURATION_YEAR: Double = js.native
  
  inline def createInterval(duration: Double, floorish: TimeProcess, offseti: TimeProcess): Ceil = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")(duration.asInstanceOf[js.Any], floorish.asInstanceOf[js.Any], offseti.asInstanceOf[js.Any])).asInstanceOf[Ceil]
  inline def createInterval(duration: Double, floorish: TimeProcess, offseti: TimeProcess, field: TimeField): Ceil = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterval")(duration.asInstanceOf[js.Any], floorish.asInstanceOf[js.Any], offseti.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Ceil]
  
  @JSImport("@antv/scale/lib/utils/time-interval", "day")
  @js.native
  val day: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "hour")
  @js.native
  val hour: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "localIntervalMap")
  @js.native
  val localIntervalMap: IntervalMap = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "millisecond")
  @js.native
  val millisecond: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "minute")
  @js.native
  val minute: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "month")
  @js.native
  val month: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "second")
  @js.native
  val second: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "week")
  @js.native
  val week: Interval = js.native
  
  @JSImport("@antv/scale/lib/utils/time-interval", "year")
  @js.native
  val year: Interval = js.native
  
  trait Interval extends StObject {
    
    def ceil(d: js.Date, rest: Any*): js.Date
    @JSName("ceil")
    var ceil_Original: TimeTransform
    
    var duration: Double
    
    def floor(d: js.Date, rest: Any*): js.Date
    @JSName("floor")
    var floor_Original: TimeTransform
    
    def range(start: js.Date, stop: js.Date, step: Double): js.Array[js.Date]
    def range(start: js.Date, stop: js.Date, step: Double, shouldAdjust: Boolean): js.Array[js.Date]
    @JSName("range")
    var range_Original: TimeRange
  }
  object Interval {
    
    inline def apply(
      ceil: TimeTransform,
      duration: Double,
      floor: TimeTransform,
      range: (/* start */ js.Date, /* stop */ js.Date, /* step */ Double, /* shouldAdjust */ js.UndefOr[Boolean]) => js.Array[js.Date]
    ): Interval = {
      val __obj = js.Dynamic.literal(ceil = ceil.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], range = js.Any.fromFunction4(range))
      __obj.asInstanceOf[Interval]
    }
    
    extension [Self <: Interval](x: Self) {
      
      inline def setCeil(value: TimeTransform): Self = StObject.set(x, "ceil", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFloor(value: TimeTransform): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setRange(
        value: (/* start */ js.Date, /* stop */ js.Date, /* step */ Double, /* shouldAdjust */ js.UndefOr[Boolean]) => js.Array[js.Date]
      ): Self = StObject.set(x, "range", js.Any.fromFunction4(value))
    }
  }
  
  trait IntervalMap extends StObject {
    
    var day: Interval
    
    var hour: Interval
    
    var millisecond: Interval
    
    var minute: Interval
    
    var month: Interval
    
    var second: Interval
    
    var week: Interval
    
    var year: Interval
  }
  object IntervalMap {
    
    inline def apply(
      day: Interval,
      hour: Interval,
      millisecond: Interval,
      minute: Interval,
      month: Interval,
      second: Interval,
      week: Interval,
      year: Interval
    ): IntervalMap = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalMap]
    }
    
    extension [Self <: IntervalMap](x: Self) {
      
      inline def setDay(value: Interval): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Interval): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMillisecond(value: Interval): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Interval): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Interval): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Interval): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: Interval): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Interval): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeField = js.Function1[/* d */ js.Date, Double]
  
  @js.native
  trait TimeProcess extends StObject {
    
    def apply(d: js.Date, rest: Any*): Unit = js.native
  }
  
  type TimeRange = js.Function4[
    /* start */ js.Date, 
    /* stop */ js.Date, 
    /* step */ Double, 
    /* shouldAdjust */ js.UndefOr[Boolean], 
    js.Array[js.Date]
  ]
  
  @js.native
  trait TimeTransform extends StObject {
    
    def apply(d: js.Date, rest: Any*): js.Date = js.native
  }
}
