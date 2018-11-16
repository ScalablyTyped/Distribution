package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _lengthAdjust extends js.Object

@JSGlobal("MSHTML._lengthAdjust")
@js.native
object _lengthAdjust extends js.Object {
  @js.native
  sealed trait LENGTHADJUST_SPACING
    extends activexDashMshtmlLib.MSHTMLNs._lengthAdjust
  
  @js.native
  sealed trait LENGTHADJUST_SPACINGANDGLYPHS
    extends activexDashMshtmlLib.MSHTMLNs._lengthAdjust
  
  @js.native
  sealed trait LENGTHADJUST_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._lengthAdjust
  
  @js.native
  sealed trait lengthAdjust_Max
    extends activexDashMshtmlLib.MSHTMLNs._lengthAdjust
  
  /* 1 */ val LENGTHADJUST_SPACING: LENGTHADJUST_SPACING with scala.Double = js.native
  /* 2 */ val LENGTHADJUST_SPACINGANDGLYPHS: LENGTHADJUST_SPACINGANDGLYPHS with scala.Double = js.native
  /* 0 */ val LENGTHADJUST_UNKNOWN: LENGTHADJUST_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val lengthAdjust_Max: lengthAdjust_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._lengthAdjust with scala.Double] = js.native
}

