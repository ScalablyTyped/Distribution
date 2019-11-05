package typings.adhan.adhanMod

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
  
  /* 0 */ val Hanafi: typings.adhan.adhanMod.Madhab.Hanafi with Double = js.native
  /* 1 */ val Shafi: typings.adhan.adhanMod.Madhab.Shafi with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Madhab with Double] = js.native
}

