package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOriginalFormat extends js.Object

@JSGlobal("Word.WdOriginalFormat")
@js.native
object WdOriginalFormat extends js.Object {
  @js.native
  sealed trait wdOriginalDocumentFormat
    extends activexDashWordLib.WordNs.WdOriginalFormat
  
  @js.native
  sealed trait wdPromptUser
    extends activexDashWordLib.WordNs.WdOriginalFormat
  
  @js.native
  sealed trait wdWordDocument
    extends activexDashWordLib.WordNs.WdOriginalFormat
  
  /* 1 */ val wdOriginalDocumentFormat: wdOriginalDocumentFormat with scala.Double = js.native
  /* 2 */ val wdPromptUser: wdPromptUser with scala.Double = js.native
  /* 0 */ val wdWordDocument: wdWordDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOriginalFormat with scala.Double] = js.native
}

