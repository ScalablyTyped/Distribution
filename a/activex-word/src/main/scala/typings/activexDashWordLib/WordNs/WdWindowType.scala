package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdWindowType extends js.Object

@JSGlobal("Word.WdWindowType")
@js.native
object WdWindowType extends js.Object {
  @js.native
  sealed trait wdWindowDocument
    extends activexDashWordLib.WordNs.WdWindowType
  
  @js.native
  sealed trait wdWindowTemplate
    extends activexDashWordLib.WordNs.WdWindowType
  
  /* 0 */ val wdWindowDocument: wdWindowDocument with scala.Double = js.native
  /* 1 */ val wdWindowTemplate: wdWindowTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdWindowType with scala.Double] = js.native
}

