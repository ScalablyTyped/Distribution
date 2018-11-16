package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLCaptionFlag extends js.Object

@JSGlobal("MSHTML._HTMLCaptionFlag")
@js.native
object _HTMLCaptionFlag extends js.Object {
  @js.native
  sealed trait HTMLCaptionFlagNo
    extends activexDashMshtmlLib.MSHTMLNs._HTMLCaptionFlag
  
  @js.native
  sealed trait HTMLCaptionFlagYes
    extends activexDashMshtmlLib.MSHTMLNs._HTMLCaptionFlag
  
  @js.native
  sealed trait HTMLCaptionFlag_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLCaptionFlag
  
  /* 0 */ val HTMLCaptionFlagNo: HTMLCaptionFlagNo with scala.Double = js.native
  /* 12582912 */ val HTMLCaptionFlagYes: HTMLCaptionFlagYes with scala.Double = js.native
  /* 2147483647 */ val HTMLCaptionFlag_Max: HTMLCaptionFlag_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLCaptionFlag with scala.Double] = js.native
}

