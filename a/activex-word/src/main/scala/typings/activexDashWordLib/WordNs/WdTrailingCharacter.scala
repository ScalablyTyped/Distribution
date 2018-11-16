package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTrailingCharacter extends js.Object

@JSGlobal("Word.WdTrailingCharacter")
@js.native
object WdTrailingCharacter extends js.Object {
  @js.native
  sealed trait wdTrailingNone
    extends activexDashWordLib.WordNs.WdTrailingCharacter
  
  @js.native
  sealed trait wdTrailingSpace
    extends activexDashWordLib.WordNs.WdTrailingCharacter
  
  @js.native
  sealed trait wdTrailingTab
    extends activexDashWordLib.WordNs.WdTrailingCharacter
  
  /* 2 */ val wdTrailingNone: wdTrailingNone with scala.Double = js.native
  /* 1 */ val wdTrailingSpace: wdTrailingSpace with scala.Double = js.native
  /* 0 */ val wdTrailingTab: wdTrailingTab with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTrailingCharacter with scala.Double] = js.native
}

