package typings.ahooks

import typings.dayjs.mod.ConfigType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCountDownMod {
  
  @JSImport("ahooks/lib/useCountDown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Double, FormattedRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Double, FormattedRes]]
  inline def default(options: Options): js.Tuple2[Double, FormattedRes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, FormattedRes]]
  
  trait FormattedRes extends StObject {
    
    var days: Double
    
    var hours: Double
    
    var milliseconds: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object FormattedRes {
    
    inline def apply(days: Double, hours: Double, milliseconds: Double, minutes: Double, seconds: Double): FormattedRes = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedRes]
    }
    
    extension [Self <: FormattedRes](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var leftTime: js.UndefOr[Double] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var targetDate: js.UndefOr[TDate] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLeftTime(value: Double): Self = StObject.set(x, "leftTime", value.asInstanceOf[js.Any])
      
      inline def setLeftTimeUndefined: Self = StObject.set(x, "leftTime", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setTargetDate(value: TDate): Self = StObject.set(x, "targetDate", value.asInstanceOf[js.Any])
      
      inline def setTargetDateNull: Self = StObject.set(x, "targetDate", null)
      
      inline def setTargetDateUndefined: Self = StObject.set(x, "targetDate", js.undefined)
    }
  }
  
  type TDate = ConfigType
}
