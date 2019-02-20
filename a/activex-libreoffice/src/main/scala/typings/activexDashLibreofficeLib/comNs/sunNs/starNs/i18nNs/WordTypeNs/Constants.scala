package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.WordType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ANYWORD_IGNOREWHITESPACES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs.Constants
  
  @js.native
  sealed trait ANY_WORD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs.Constants
  
  @js.native
  sealed trait DICTIONARY_WORD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs.Constants
  
  @js.native
  sealed trait WORD_COUNT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs.Constants
  
  /* 1 */ val ANYWORD_IGNOREWHITESPACES: ANYWORD_IGNOREWHITESPACES with scala.Double = js.native
  /* 0 */ val ANY_WORD: ANY_WORD with scala.Double = js.native
  /* 2 */ val DICTIONARY_WORD: DICTIONARY_WORD with scala.Double = js.native
  /* 3 */ val WORD_COUNT: WORD_COUNT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.WordTypeNs.Constants with scala.Double
  ] = js.native
}

