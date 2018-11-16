package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSeparatorCharacters extends js.Object

@JSGlobal("Access.AcSeparatorCharacters")
@js.native
object AcSeparatorCharacters extends js.Object {
  @js.native
  sealed trait acSeparatorCharactersComma
    extends activexDashAccessLib.AccessNs.AcSeparatorCharacters
  
  @js.native
  sealed trait acSeparatorCharactersNewLine
    extends activexDashAccessLib.AccessNs.AcSeparatorCharacters
  
  @js.native
  sealed trait acSeparatorCharactersSemiColon
    extends activexDashAccessLib.AccessNs.AcSeparatorCharacters
  
  @js.native
  sealed trait acSeparatorCharactersSystemSeparator
    extends activexDashAccessLib.AccessNs.AcSeparatorCharacters
  
  /* 3 */ val acSeparatorCharactersComma: acSeparatorCharactersComma with scala.Double = js.native
  /* 1 */ val acSeparatorCharactersNewLine: acSeparatorCharactersNewLine with scala.Double = js.native
  /* 2 */ val acSeparatorCharactersSemiColon: acSeparatorCharactersSemiColon with scala.Double = js.native
  /* 0 */ val acSeparatorCharactersSystemSeparator: acSeparatorCharactersSystemSeparator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSeparatorCharacters with scala.Double] = js.native
}

