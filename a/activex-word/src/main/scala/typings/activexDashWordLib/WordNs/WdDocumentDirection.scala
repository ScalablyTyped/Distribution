package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocumentDirection extends js.Object

@JSGlobal("Word.WdDocumentDirection")
@js.native
object WdDocumentDirection extends js.Object {
  @js.native
  sealed trait wdLeftToRight
    extends activexDashWordLib.WordNs.WdDocumentDirection
  
  @js.native
  sealed trait wdRightToLeft
    extends activexDashWordLib.WordNs.WdDocumentDirection
  
  /* 0 */ val wdLeftToRight: wdLeftToRight with scala.Double = js.native
  /* 1 */ val wdRightToLeft: wdRightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocumentDirection with scala.Double] = js.native
}

