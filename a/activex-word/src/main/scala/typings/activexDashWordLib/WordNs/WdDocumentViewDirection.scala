package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocumentViewDirection extends js.Object

@JSGlobal("Word.WdDocumentViewDirection")
@js.native
object WdDocumentViewDirection extends js.Object {
  @js.native
  sealed trait wdDocumentViewLtr
    extends activexDashWordLib.WordNs.WdDocumentViewDirection
  
  @js.native
  sealed trait wdDocumentViewRtl
    extends activexDashWordLib.WordNs.WdDocumentViewDirection
  
  /* 1 */ val wdDocumentViewLtr: wdDocumentViewLtr with scala.Double = js.native
  /* 0 */ val wdDocumentViewRtl: wdDocumentViewRtl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocumentViewDirection with scala.Double] = js.native
}

