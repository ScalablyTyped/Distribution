package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSpellingErrorType extends js.Object

@JSGlobal("Word.WdSpellingErrorType")
@js.native
object WdSpellingErrorType extends js.Object {
  @js.native
  sealed trait wdSpellingCapitalization
    extends activexDashWordLib.WordNs.WdSpellingErrorType
  
  @js.native
  sealed trait wdSpellingCorrect
    extends activexDashWordLib.WordNs.WdSpellingErrorType
  
  @js.native
  sealed trait wdSpellingNotInDictionary
    extends activexDashWordLib.WordNs.WdSpellingErrorType
  
  /* 2 */ val wdSpellingCapitalization: wdSpellingCapitalization with scala.Double = js.native
  /* 0 */ val wdSpellingCorrect: wdSpellingCorrect with scala.Double = js.native
  /* 1 */ val wdSpellingNotInDictionary: wdSpellingNotInDictionary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSpellingErrorType with scala.Double] = js.native
}

