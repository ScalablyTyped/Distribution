package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.i18n.BreakType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HANGINGPUNCTUATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakTypeNs.Constants
  
  @js.native
  sealed trait HYPHENATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakTypeNs.Constants
  
  @js.native
  sealed trait WORDBOUNDARY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakTypeNs.Constants
  
  /* 3 */ val HANGINGPUNCTUATION: HANGINGPUNCTUATION with scala.Double = js.native
  /* 2 */ val HYPHENATION: HYPHENATION with scala.Double = js.native
  /* 1 */ val WORDBOUNDARY: WORDBOUNDARY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.BreakTypeNs.Constants with scala.Double
  ] = js.native
}

