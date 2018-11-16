package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcImeSentenceMode extends js.Object

@JSGlobal("Access.AcImeSentenceMode")
@js.native
object AcImeSentenceMode extends js.Object {
  @js.native
  sealed trait acImeSentenceModeConversation
    extends activexDashAccessLib.AccessNs.AcImeSentenceMode
  
  @js.native
  sealed trait acImeSentenceModeNone
    extends activexDashAccessLib.AccessNs.AcImeSentenceMode
  
  @js.native
  sealed trait acImeSentenceModePhrasePredict
    extends activexDashAccessLib.AccessNs.AcImeSentenceMode
  
  @js.native
  sealed trait acImeSentenceModePluralClause
    extends activexDashAccessLib.AccessNs.AcImeSentenceMode
  
  /* 2 */ val acImeSentenceModeConversation: acImeSentenceModeConversation with scala.Double = js.native
  /* 3 */ val acImeSentenceModeNone: acImeSentenceModeNone with scala.Double = js.native
  /* 0 */ val acImeSentenceModePhrasePredict: acImeSentenceModePhrasePredict with scala.Double = js.native
  /* 1 */ val acImeSentenceModePluralClause: acImeSentenceModePluralClause with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcImeSentenceMode with scala.Double] = js.native
}

