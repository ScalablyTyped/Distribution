package typings.adhan.adhanMod

import org.scalablytyped.runtime.TopLevel
import typings.adhan.adhanMod.Madhab.Hanafi
import typings.adhan.adhanMod.Madhab.Shafi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Madhab extends js.Object

@JSImport("adhan", "Madhab")
@js.native
object Madhab extends js.Object {
  @js.native
  sealed trait Hanafi extends Madhab
  
  @js.native
  sealed trait Shafi extends Madhab
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Madhab with Double] = js.native
  /* 0 */ @js.native
  object Hanafi extends TopLevel[Hanafi with Double]
  
  /* 1 */ @js.native
  object Shafi extends TopLevel[Shafi with Double]
  
}

