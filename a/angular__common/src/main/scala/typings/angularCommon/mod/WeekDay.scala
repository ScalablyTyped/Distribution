package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDay extends StObject
@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay & Double] = js.native
  
  @js.native
  sealed trait Friday
    extends StObject
       with WeekDay
  /* 5 */ val Friday: typings.angularCommon.mod.WeekDay.Friday & Double = js.native
  
  @js.native
  sealed trait Monday
    extends StObject
       with WeekDay
  /* 1 */ val Monday: typings.angularCommon.mod.WeekDay.Monday & Double = js.native
  
  @js.native
  sealed trait Saturday
    extends StObject
       with WeekDay
  /* 6 */ val Saturday: typings.angularCommon.mod.WeekDay.Saturday & Double = js.native
  
  @js.native
  sealed trait Sunday
    extends StObject
       with WeekDay
  /* 0 */ val Sunday: typings.angularCommon.mod.WeekDay.Sunday & Double = js.native
  
  @js.native
  sealed trait Thursday
    extends StObject
       with WeekDay
  /* 4 */ val Thursday: typings.angularCommon.mod.WeekDay.Thursday & Double = js.native
  
  @js.native
  sealed trait Tuesday
    extends StObject
       with WeekDay
  /* 2 */ val Tuesday: typings.angularCommon.mod.WeekDay.Tuesday & Double = js.native
  
  @js.native
  sealed trait Wednesday
    extends StObject
       with WeekDay
  /* 3 */ val Wednesday: typings.angularCommon.mod.WeekDay.Wednesday & Double = js.native
}
