package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPasteOptions extends js.Object

@JSGlobal("Word.WdPasteOptions")
@js.native
object WdPasteOptions extends js.Object {
  @js.native
  sealed trait wdKeepSourceFormatting
    extends activexDashWordLib.WordNs.WdPasteOptions
  
  @js.native
  sealed trait wdKeepTextOnly
    extends activexDashWordLib.WordNs.WdPasteOptions
  
  @js.native
  sealed trait wdMatchDestinationFormatting
    extends activexDashWordLib.WordNs.WdPasteOptions
  
  @js.native
  sealed trait wdUseDestinationStyles
    extends activexDashWordLib.WordNs.WdPasteOptions
  
  /* 0 */ val wdKeepSourceFormatting: wdKeepSourceFormatting with scala.Double = js.native
  /* 2 */ val wdKeepTextOnly: wdKeepTextOnly with scala.Double = js.native
  /* 1 */ val wdMatchDestinationFormatting: wdMatchDestinationFormatting with scala.Double = js.native
  /* 3 */ val wdUseDestinationStyles: wdUseDestinationStyles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPasteOptions with scala.Double] = js.native
}

