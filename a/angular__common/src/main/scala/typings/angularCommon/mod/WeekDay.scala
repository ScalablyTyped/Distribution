package typings.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDay extends js.Object
@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
  
  @js.native
  sealed trait Friday extends WeekDay
  /* 5 */ @js.native
  object Friday extends TopLevel[Friday with Double]
  
  @js.native
  sealed trait Monday extends WeekDay
  /* 1 */ @js.native
  object Monday extends TopLevel[Monday with Double]
  
  @js.native
  sealed trait Saturday extends WeekDay
  /* 6 */ @js.native
  object Saturday extends TopLevel[Saturday with Double]
  
  @js.native
  sealed trait Sunday extends WeekDay
  /* 0 */ @js.native
  object Sunday extends TopLevel[Sunday with Double]
  
  @js.native
  sealed trait Thursday extends WeekDay
  /* 4 */ @js.native
  object Thursday extends TopLevel[Thursday with Double]
  
  @js.native
  sealed trait Tuesday extends WeekDay
  /* 2 */ @js.native
  object Tuesday extends TopLevel[Tuesday with Double]
  
  @js.native
  sealed trait Wednesday extends WeekDay
  /* 3 */ @js.native
  object Wednesday extends TopLevel[Wednesday with Double]
}
