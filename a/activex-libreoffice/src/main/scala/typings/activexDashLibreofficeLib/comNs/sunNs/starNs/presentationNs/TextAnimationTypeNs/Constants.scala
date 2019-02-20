package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TextAnimationTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.presentation.TextAnimationType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BY_LETTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TextAnimationTypeNs.Constants
  
  @js.native
  sealed trait BY_PARAGRAPH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TextAnimationTypeNs.Constants
  
  @js.native
  sealed trait BY_WORD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TextAnimationTypeNs.Constants
  
  /* 2 */ val BY_LETTER: BY_LETTER with scala.Double = js.native
  /* 0 */ val BY_PARAGRAPH: BY_PARAGRAPH with scala.Double = js.native
  /* 1 */ val BY_WORD: BY_WORD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs.TextAnimationTypeNs.Constants with scala.Double
  ] = js.native
}

