package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _textpathSpacingtype extends js.Object

@JSGlobal("MSHTML._textpathSpacingtype")
@js.native
object _textpathSpacingtype extends js.Object {
  @js.native
  sealed trait TEXTPATH_SPACINGTYPE_AUTO
    extends activexDashMshtmlLib.MSHTMLNs._textpathSpacingtype
  
  @js.native
  sealed trait TEXTPATH_SPACINGTYPE_EXACT
    extends activexDashMshtmlLib.MSHTMLNs._textpathSpacingtype
  
  @js.native
  sealed trait TEXTPATH_SPACINGTYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._textpathSpacingtype
  
  @js.native
  sealed trait textpathSpacingtype_Max
    extends activexDashMshtmlLib.MSHTMLNs._textpathSpacingtype
  
  /* 1 */ val TEXTPATH_SPACINGTYPE_AUTO: TEXTPATH_SPACINGTYPE_AUTO with scala.Double = js.native
  /* 2 */ val TEXTPATH_SPACINGTYPE_EXACT: TEXTPATH_SPACINGTYPE_EXACT with scala.Double = js.native
  /* 0 */ val TEXTPATH_SPACINGTYPE_UNKNOWN: TEXTPATH_SPACINGTYPE_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val textpathSpacingtype_Max: textpathSpacingtype_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._textpathSpacingtype with scala.Double] = js.native
}

