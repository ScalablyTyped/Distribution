package typings.adhan

import typings.adhan.anon.Nearest
import typings.adhan.typeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("adhan/lib/types/DateUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateByAddingDays(date: js.Date, days: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dateByAddingDays")(date.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def dateByAddingMinutes(date: js.Date, minutes: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dateByAddingMinutes")(date.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def dateByAddingSeconds(date: js.Date, seconds: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("dateByAddingSeconds")(date.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def dayOfYear(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dayOfYear")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isValidDate(date: js.Date): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def roundedMinute(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("roundedMinute")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def roundedMinute(date: js.Date, rounding: ValueOf[Nearest]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("roundedMinute")(date.asInstanceOf[js.Any], rounding.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
