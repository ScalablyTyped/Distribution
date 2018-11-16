package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocumentKind extends js.Object

@JSGlobal("Word.WdDocumentKind")
@js.native
object WdDocumentKind extends js.Object {
  @js.native
  sealed trait wdDocumentEmail
    extends activexDashWordLib.WordNs.WdDocumentKind
  
  @js.native
  sealed trait wdDocumentLetter
    extends activexDashWordLib.WordNs.WdDocumentKind
  
  @js.native
  sealed trait wdDocumentNotSpecified
    extends activexDashWordLib.WordNs.WdDocumentKind
  
  /* 2 */ val wdDocumentEmail: wdDocumentEmail with scala.Double = js.native
  /* 1 */ val wdDocumentLetter: wdDocumentLetter with scala.Double = js.native
  /* 0 */ val wdDocumentNotSpecified: wdDocumentNotSpecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocumentKind with scala.Double] = js.native
}

