package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSaveOptions extends js.Object

@JSGlobal("Word.WdSaveOptions")
@js.native
object WdSaveOptions extends js.Object {
  @js.native
  sealed trait wdDoNotSaveChanges
    extends activexDashWordLib.WordNs.WdSaveOptions
  
  @js.native
  sealed trait wdPromptToSaveChanges
    extends activexDashWordLib.WordNs.WdSaveOptions
  
  @js.native
  sealed trait wdSaveChanges
    extends activexDashWordLib.WordNs.WdSaveOptions
  
  /* 0 */ val wdDoNotSaveChanges: wdDoNotSaveChanges with scala.Double = js.native
  /* -2 */ val wdPromptToSaveChanges: wdPromptToSaveChanges with scala.Double = js.native
  /* -1 */ val wdSaveChanges: wdSaveChanges with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSaveOptions with scala.Double] = js.native
}

