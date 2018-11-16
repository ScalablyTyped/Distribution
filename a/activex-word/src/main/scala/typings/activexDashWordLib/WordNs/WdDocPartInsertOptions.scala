package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocPartInsertOptions extends js.Object

@JSGlobal("Word.WdDocPartInsertOptions")
@js.native
object WdDocPartInsertOptions extends js.Object {
  @js.native
  sealed trait wdInsertContent
    extends activexDashWordLib.WordNs.WdDocPartInsertOptions
  
  @js.native
  sealed trait wdInsertPage
    extends activexDashWordLib.WordNs.WdDocPartInsertOptions
  
  @js.native
  sealed trait wdInsertParagraph
    extends activexDashWordLib.WordNs.WdDocPartInsertOptions
  
  /* 0 */ val wdInsertContent: wdInsertContent with scala.Double = js.native
  /* 2 */ val wdInsertPage: wdInsertPage with scala.Double = js.native
  /* 1 */ val wdInsertParagraph: wdInsertParagraph with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocPartInsertOptions with scala.Double] = js.native
}

