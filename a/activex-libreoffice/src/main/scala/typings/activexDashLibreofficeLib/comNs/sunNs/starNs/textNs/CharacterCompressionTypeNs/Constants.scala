package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CharacterCompressionTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.text.CharacterCompressionType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CharacterCompressionTypeNs.Constants
  
  @js.native
  sealed trait PUNCTUATION_AND_KANA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CharacterCompressionTypeNs.Constants
  
  @js.native
  sealed trait PUNCTUATION_ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CharacterCompressionTypeNs.Constants
  
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val PUNCTUATION_AND_KANA: PUNCTUATION_AND_KANA with scala.Double = js.native
  /* 1 */ val PUNCTUATION_ONLY: PUNCTUATION_ONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.CharacterCompressionTypeNs.Constants with scala.Double
  ] = js.native
}

