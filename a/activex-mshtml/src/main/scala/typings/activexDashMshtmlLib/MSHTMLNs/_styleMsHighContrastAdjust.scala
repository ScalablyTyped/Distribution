package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleMsHighContrastAdjust extends js.Object

@JSGlobal("MSHTML._styleMsHighContrastAdjust")
@js.native
object _styleMsHighContrastAdjust extends js.Object {
  @js.native
  sealed trait styleMsHighContrastAdjustAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleMsHighContrastAdjust
  
  @js.native
  sealed trait styleMsHighContrastAdjustNone
    extends activexDashMshtmlLib.MSHTMLNs._styleMsHighContrastAdjust
  
  @js.native
  sealed trait styleMsHighContrastAdjustNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleMsHighContrastAdjust
  
  @js.native
  sealed trait styleMsHighContrastAdjust_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleMsHighContrastAdjust
  
  /* 1 */ val styleMsHighContrastAdjustAuto: styleMsHighContrastAdjustAuto with scala.Double = js.native
  /* 2 */ val styleMsHighContrastAdjustNone: styleMsHighContrastAdjustNone with scala.Double = js.native
  /* 0 */ val styleMsHighContrastAdjustNotSet: styleMsHighContrastAdjustNotSet with scala.Double = js.native
  /* 2147483647 */ val styleMsHighContrastAdjust_Max: styleMsHighContrastAdjust_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleMsHighContrastAdjust with scala.Double] = js.native
}

