package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsScrollTranslation extends js.Object

@JSGlobal("MSHTML._styleMsScrollTranslation")
@js.native
object _styleMsScrollTranslation extends js.Object {
  @js.native
  sealed trait styleMsScrollTranslationNone
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollTranslation
  
  @js.native
  sealed trait styleMsScrollTranslationNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollTranslation
  
  @js.native
  sealed trait styleMsScrollTranslationVtoH
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollTranslation
  
  @js.native
  sealed trait styleMsScrollTranslation_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsScrollTranslation
  
  /* 1 */ val styleMsScrollTranslationNone: styleMsScrollTranslationNone with scala.Double = js.native
  /* 0 */ val styleMsScrollTranslationNotSet: styleMsScrollTranslationNotSet with scala.Double = js.native
  /* 2 */ val styleMsScrollTranslationVtoH: styleMsScrollTranslationVtoH with scala.Double = js.native
  /* 2147483647 */ val styleMsScrollTranslation_Max: styleMsScrollTranslation_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsScrollTranslation with scala.Double] = js.native
}

