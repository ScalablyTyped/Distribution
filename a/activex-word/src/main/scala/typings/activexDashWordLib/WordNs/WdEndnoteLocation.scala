package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEndnoteLocation extends js.Object

@JSGlobal("Word.WdEndnoteLocation")
@js.native
object WdEndnoteLocation extends js.Object {
  @js.native
  sealed trait wdEndOfDocument
    extends activexDashWordLib.WordNs.WdEndnoteLocation
  
  @js.native
  sealed trait wdEndOfSection
    extends activexDashWordLib.WordNs.WdEndnoteLocation
  
  /* 1 */ val wdEndOfDocument: wdEndOfDocument with scala.Double = js.native
  /* 0 */ val wdEndOfSection: wdEndOfSection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEndnoteLocation with scala.Double] = js.native
}

