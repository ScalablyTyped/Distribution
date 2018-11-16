package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _textpathMethodtype extends js.Object

@JSGlobal("MSHTML._textpathMethodtype")
@js.native
object _textpathMethodtype extends js.Object {
  @js.native
  sealed trait TEXTPATH_METHODTYPE_ALIGN
    extends activexDashMshtmlLib.MSHTMLNs._textpathMethodtype
  
  @js.native
  sealed trait TEXTPATH_METHODTYPE_STRETCH
    extends activexDashMshtmlLib.MSHTMLNs._textpathMethodtype
  
  @js.native
  sealed trait TEXTPATH_METHODTYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._textpathMethodtype
  
  @js.native
  sealed trait textpathMethodtype_Max
    extends activexDashMshtmlLib.MSHTMLNs._textpathMethodtype
  
  /* 1 */ val TEXTPATH_METHODTYPE_ALIGN: TEXTPATH_METHODTYPE_ALIGN with scala.Double = js.native
  /* 2 */ val TEXTPATH_METHODTYPE_STRETCH: TEXTPATH_METHODTYPE_STRETCH with scala.Double = js.native
  /* 0 */ val TEXTPATH_METHODTYPE_UNKNOWN: TEXTPATH_METHODTYPE_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val textpathMethodtype_Max: textpathMethodtype_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._textpathMethodtype with scala.Double] = js.native
}

