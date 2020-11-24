package typings.adhan.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HighLatitudeRule extends js.Object
@JSImport("adhan", "HighLatitudeRule")
@js.native
object HighLatitudeRule extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HighLatitudeRule with Double] = js.native
  
  @js.native
  sealed trait MiddleOfTheNight extends HighLatitudeRule
  /* 0 */ @js.native
  object MiddleOfTheNight extends TopLevel[MiddleOfTheNight with Double]
  
  @js.native
  sealed trait SeventhOfTheNight extends HighLatitudeRule
  /* 1 */ @js.native
  object SeventhOfTheNight extends TopLevel[SeventhOfTheNight with Double]
  
  @js.native
  sealed trait TwilightAngle extends HighLatitudeRule
  /* 2 */ @js.native
  object TwilightAngle extends TopLevel[TwilightAngle with Double]
}
