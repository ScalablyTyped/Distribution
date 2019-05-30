package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDay extends js.Object

@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends js.Object {
  @js.native
  sealed trait Friday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Monday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Saturday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Sunday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Thursday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Tuesday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  @js.native
  sealed trait Wednesday
    extends atAngularCommonLib.atAngularCommonMod.WeekDay
  
  /* 5 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 6 */ val Saturday: Saturday with scala.Double = js.native
  /* 0 */ val Sunday: Sunday with scala.Double = js.native
  /* 4 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 3 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.WeekDay with scala.Double] = js.native
}

