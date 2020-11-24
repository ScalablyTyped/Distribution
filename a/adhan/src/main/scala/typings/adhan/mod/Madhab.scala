package typings.adhan.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Madhab extends js.Object
@JSImport("adhan", "Madhab")
@js.native
object Madhab extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Madhab with Double] = js.native
  
  @js.native
  sealed trait Hanafi extends Madhab
  /* 0 */ @js.native
  object Hanafi extends TopLevel[Hanafi with Double]
  
  @js.native
  sealed trait Shafi extends Madhab
  /* 1 */ @js.native
  object Shafi extends TopLevel[Shafi with Double]
}
