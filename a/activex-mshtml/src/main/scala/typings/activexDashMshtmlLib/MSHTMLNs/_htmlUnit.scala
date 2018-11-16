package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlUnit extends js.Object

@JSGlobal("MSHTML._htmlUnit")
@js.native
object _htmlUnit extends js.Object {
  @js.native
  sealed trait htmlUnitCharacter
    extends activexDashMshtmlLib.MSHTMLNs._htmlUnit
  
  @js.native
  sealed trait htmlUnitSentence
    extends activexDashMshtmlLib.MSHTMLNs._htmlUnit
  
  @js.native
  sealed trait htmlUnitTextEdit
    extends activexDashMshtmlLib.MSHTMLNs._htmlUnit
  
  @js.native
  sealed trait htmlUnitWord
    extends activexDashMshtmlLib.MSHTMLNs._htmlUnit
  
  @js.native
  sealed trait htmlUnit_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlUnit
  
  /* 1 */ val htmlUnitCharacter: htmlUnitCharacter with scala.Double = js.native
  /* 3 */ val htmlUnitSentence: htmlUnitSentence with scala.Double = js.native
  /* 6 */ val htmlUnitTextEdit: htmlUnitTextEdit with scala.Double = js.native
  /* 2 */ val htmlUnitWord: htmlUnitWord with scala.Double = js.native
  /* 2147483647 */ val htmlUnit_Max: htmlUnit_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlUnit with scala.Double] = js.native
}

