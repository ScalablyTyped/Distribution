package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisGroup extends js.Object

@JSGlobal("Word.XlAxisGroup")
@js.native
object XlAxisGroup extends js.Object {
  @js.native
  sealed trait xlPrimary
    extends activexDashWordLib.WordNs.XlAxisGroup
  
  @js.native
  sealed trait xlSecondary
    extends activexDashWordLib.WordNs.XlAxisGroup
  
  /* 1 */ val xlPrimary: xlPrimary with scala.Double = js.native
  /* 2 */ val xlSecondary: xlSecondary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlAxisGroup with scala.Double] = js.native
}

