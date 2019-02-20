package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.linguistic2.LinguServiceEventFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HYPHENATE_AGAIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs.Constants
  
  @js.native
  sealed trait PROOFREAD_AGAIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs.Constants
  
  @js.native
  sealed trait SPELL_CORRECT_WORDS_AGAIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs.Constants
  
  @js.native
  sealed trait SPELL_WRONG_WORDS_AGAIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs.Constants
  
  /* 4 */ val HYPHENATE_AGAIN: HYPHENATE_AGAIN with scala.Double = js.native
  /* 8 */ val PROOFREAD_AGAIN: PROOFREAD_AGAIN with scala.Double = js.native
  /* 1 */ val SPELL_CORRECT_WORDS_AGAIN: SPELL_CORRECT_WORDS_AGAIN with scala.Double = js.native
  /* 2 */ val SPELL_WRONG_WORDS_AGAIN: SPELL_WRONG_WORDS_AGAIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.LinguServiceEventFlagsNs.Constants with scala.Double
  ] = js.native
}

