package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleCaptionSide extends js.Object

@JSGlobal("MSHTML._styleCaptionSide")
@js.native
object _styleCaptionSide extends js.Object {
  @js.native
  sealed trait styleCaptionSideBottom
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  @js.native
  sealed trait styleCaptionSideLeft
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  @js.native
  sealed trait styleCaptionSideNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  @js.native
  sealed trait styleCaptionSideRight
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  @js.native
  sealed trait styleCaptionSideTop
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  @js.native
  sealed trait styleCaptionSide_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleCaptionSide
  
  /* 2 */ val styleCaptionSideBottom: styleCaptionSideBottom with scala.Double = js.native
  /* 3 */ val styleCaptionSideLeft: styleCaptionSideLeft with scala.Double = js.native
  /* 0 */ val styleCaptionSideNotSet: styleCaptionSideNotSet with scala.Double = js.native
  /* 4 */ val styleCaptionSideRight: styleCaptionSideRight with scala.Double = js.native
  /* 1 */ val styleCaptionSideTop: styleCaptionSideTop with scala.Double = js.native
  /* 2147483647 */ val styleCaptionSide_Max: styleCaptionSide_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleCaptionSide with scala.Double] = js.native
}

