package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.TextConversionOption.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CHARACTER_BY_CHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs.Constants
  
  @js.native
  sealed trait IGNORE_POST_POSITIONAL_WORD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs.Constants
  
  @js.native
  sealed trait USE_CHARACTER_VARIANTS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs.Constants
  
  /* 1 */ val CHARACTER_BY_CHARACTER: CHARACTER_BY_CHARACTER with scala.Double = js.native
  /* 2 */ val IGNORE_POST_POSITIONAL_WORD: IGNORE_POST_POSITIONAL_WORD with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val USE_CHARACTER_VARIANTS: USE_CHARACTER_VARIANTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TextConversionOptionNs.Constants with scala.Double
  ] = js.native
}

