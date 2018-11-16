package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEndStyleCap extends js.Object

@JSGlobal("Word.XlEndStyleCap")
@js.native
object XlEndStyleCap extends js.Object {
  @js.native
  sealed trait xlCap
    extends activexDashWordLib.WordNs.XlEndStyleCap
  
  @js.native
  sealed trait xlNoCap
    extends activexDashWordLib.WordNs.XlEndStyleCap
  
  /* 1 */ val xlCap: xlCap with scala.Double = js.native
  /* 2 */ val xlNoCap: xlNoCap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlEndStyleCap with scala.Double] = js.native
}

