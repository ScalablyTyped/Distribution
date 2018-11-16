package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcFindMatch extends js.Object

@JSGlobal("Access.AcFindMatch")
@js.native
object AcFindMatch extends js.Object {
  @js.native
  sealed trait acAnywhere
    extends activexDashAccessLib.AccessNs.AcFindMatch
  
  @js.native
  sealed trait acEntire
    extends activexDashAccessLib.AccessNs.AcFindMatch
  
  @js.native
  sealed trait acStart
    extends activexDashAccessLib.AccessNs.AcFindMatch
  
  /* 0 */ val acAnywhere: acAnywhere with scala.Double = js.native
  /* 1 */ val acEntire: acEntire with scala.Double = js.native
  /* 2 */ val acStart: acStart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcFindMatch with scala.Double] = js.native
}

