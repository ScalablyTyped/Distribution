package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSizeRepresents extends js.Object

@JSGlobal("Word.XlSizeRepresents")
@js.native
object XlSizeRepresents extends js.Object {
  @js.native
  sealed trait xlSizeIsArea
    extends activexDashWordLib.WordNs.XlSizeRepresents
  
  @js.native
  sealed trait xlSizeIsWidth
    extends activexDashWordLib.WordNs.XlSizeRepresents
  
  /* 1 */ val xlSizeIsArea: xlSizeIsArea with scala.Double = js.native
  /* 2 */ val xlSizeIsWidth: xlSizeIsWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlSizeRepresents with scala.Double] = js.native
}

