package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdProofreadingErrorType extends js.Object

@JSGlobal("Word.WdProofreadingErrorType")
@js.native
object WdProofreadingErrorType extends js.Object {
  @js.native
  sealed trait wdGrammaticalError
    extends activexDashWordLib.WordNs.WdProofreadingErrorType
  
  @js.native
  sealed trait wdSpellingError
    extends activexDashWordLib.WordNs.WdProofreadingErrorType
  
  /* 1 */ val wdGrammaticalError: wdGrammaticalError with scala.Double = js.native
  /* 0 */ val wdSpellingError: wdSpellingError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdProofreadingErrorType with scala.Double] = js.native
}

