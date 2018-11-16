package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDateLanguage extends js.Object

@JSGlobal("Word.WdDateLanguage")
@js.native
object WdDateLanguage extends js.Object {
  @js.native
  sealed trait wdDateLanguageBidi
    extends activexDashWordLib.WordNs.WdDateLanguage
  
  @js.native
  sealed trait wdDateLanguageLatin
    extends activexDashWordLib.WordNs.WdDateLanguage
  
  /* 10 */ val wdDateLanguageBidi: wdDateLanguageBidi with scala.Double = js.native
  /* 1033 */ val wdDateLanguageLatin: wdDateLanguageLatin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDateLanguage with scala.Double] = js.native
}

