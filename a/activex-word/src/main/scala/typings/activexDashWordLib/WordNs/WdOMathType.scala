package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOMathType extends js.Object

@JSGlobal("Word.WdOMathType")
@js.native
object WdOMathType extends js.Object {
  @js.native
  sealed trait wdOMathDisplay
    extends activexDashWordLib.WordNs.WdOMathType
  
  @js.native
  sealed trait wdOMathInline
    extends activexDashWordLib.WordNs.WdOMathType
  
  /* 0 */ val wdOMathDisplay: wdOMathDisplay with scala.Double = js.native
  /* 1 */ val wdOMathInline: wdOMathInline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOMathType with scala.Double] = js.native
}

