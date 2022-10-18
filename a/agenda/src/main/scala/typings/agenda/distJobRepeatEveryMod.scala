package typings.agenda

import typings.agenda.distJobMod.Job
import typings.agenda.distJobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJobRepeatEveryMod {
  
  @JSImport("agenda/dist/job/repeat-every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeatEvery(interval: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatEvery")(interval.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
  inline def repeatEvery(interval: String, options: JobOptions): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatEvery")(interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
  
  trait JobOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date | Double] = js.undefined
    
    var skipDays: js.UndefOr[String] = js.undefined
    
    var skipImmediate: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[js.Date | Double] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
  }
  object JobOptions {
    
    inline def apply(): JobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobOptions]
    }
    
    extension [Self <: JobOptions](x: Self) {
      
      inline def setEndDate(value: js.Date | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setSkipDays(value: String): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      inline def setSkipDaysUndefined: Self = StObject.set(x, "skipDays", js.undefined)
      
      inline def setSkipImmediate(value: Boolean): Self = StObject.set(x, "skipImmediate", value.asInstanceOf[js.Any])
      
      inline def setSkipImmediateUndefined: Self = StObject.set(x, "skipImmediate", js.undefined)
      
      inline def setStartDate(value: js.Date | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
}
