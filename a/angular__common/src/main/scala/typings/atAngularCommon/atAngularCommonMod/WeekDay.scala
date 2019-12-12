package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Friday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Monday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Saturday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Sunday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Thursday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Tuesday
import typings.atAngularCommon.atAngularCommonMod.WeekDay.Wednesday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDay extends js.Object

@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends js.Object {
  @js.native
  sealed trait Friday extends WeekDay
  
  @js.native
  sealed trait Monday extends WeekDay
  
  @js.native
  sealed trait Saturday extends WeekDay
  
  @js.native
  sealed trait Sunday extends WeekDay
  
  @js.native
  sealed trait Thursday extends WeekDay
  
  @js.native
  sealed trait Tuesday extends WeekDay
  
  @js.native
  sealed trait Wednesday extends WeekDay
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
  /* 5 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  /* 1 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  /* 6 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  /* 0 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  /* 4 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  /* 2 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  /* 3 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
  
}

