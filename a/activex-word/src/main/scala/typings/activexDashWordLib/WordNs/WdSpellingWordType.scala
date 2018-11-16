package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSpellingWordType extends js.Object

@JSGlobal("Word.WdSpellingWordType")
@js.native
object WdSpellingWordType extends js.Object {
  @js.native
  sealed trait wdAnagram
    extends activexDashWordLib.WordNs.WdSpellingWordType
  
  @js.native
  sealed trait wdSpellword
    extends activexDashWordLib.WordNs.WdSpellingWordType
  
  @js.native
  sealed trait wdWildcard
    extends activexDashWordLib.WordNs.WdSpellingWordType
  
  /* 2 */ val wdAnagram: wdAnagram with scala.Double = js.native
  /* 0 */ val wdSpellword: wdSpellword with scala.Double = js.native
  /* 1 */ val wdWildcard: wdWildcard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSpellingWordType with scala.Double] = js.native
}

