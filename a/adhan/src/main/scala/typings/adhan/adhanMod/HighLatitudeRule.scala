package typings.adhan.adhanMod

import org.scalablytyped.runtime.TopLevel
import typings.adhan.adhanMod.HighLatitudeRule.MiddleOfTheNight
import typings.adhan.adhanMod.HighLatitudeRule.SeventhOfTheNight
import typings.adhan.adhanMod.HighLatitudeRule.TwilightAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighLatitudeRule extends js.Object

@JSImport("adhan", "HighLatitudeRule")
@js.native
object HighLatitudeRule extends js.Object {
  @js.native
  sealed trait MiddleOfTheNight extends HighLatitudeRule
  
  @js.native
  sealed trait SeventhOfTheNight extends HighLatitudeRule
  
  @js.native
  sealed trait TwilightAngle extends HighLatitudeRule
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighLatitudeRule with Double] = js.native
  /* 0 */ @js.native
  object MiddleOfTheNight extends TopLevel[MiddleOfTheNight with Double]
  
  /* 1 */ @js.native
  object SeventhOfTheNight extends TopLevel[SeventhOfTheNight with Double]
  
  /* 2 */ @js.native
  object TwilightAngle extends TopLevel[TwilightAngle with Double]
  
}

