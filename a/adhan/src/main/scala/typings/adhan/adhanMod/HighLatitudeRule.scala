package typings.adhan.adhanMod

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
  
  /* 0 */ val MiddleOfTheNight: typings.adhan.adhanMod.HighLatitudeRule.MiddleOfTheNight with Double = js.native
  /* 1 */ val SeventhOfTheNight: typings.adhan.adhanMod.HighLatitudeRule.SeventhOfTheNight with Double = js.native
  /* 2 */ val TwilightAngle: typings.adhan.adhanMod.HighLatitudeRule.TwilightAngle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighLatitudeRule with Double] = js.native
}

