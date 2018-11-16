package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdReplace extends js.Object

@JSGlobal("Word.WdReplace")
@js.native
object WdReplace extends js.Object {
  @js.native
  sealed trait wdReplaceAll
    extends activexDashWordLib.WordNs.WdReplace
  
  @js.native
  sealed trait wdReplaceNone
    extends activexDashWordLib.WordNs.WdReplace
  
  @js.native
  sealed trait wdReplaceOne
    extends activexDashWordLib.WordNs.WdReplace
  
  /* 2 */ val wdReplaceAll: wdReplaceAll with scala.Double = js.native
  /* 0 */ val wdReplaceNone: wdReplaceNone with scala.Double = js.native
  /* 1 */ val wdReplaceOne: wdReplaceOne with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdReplace with scala.Double] = js.native
}

