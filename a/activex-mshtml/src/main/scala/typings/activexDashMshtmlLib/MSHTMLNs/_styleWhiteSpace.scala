package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWhiteSpace extends js.Object

@JSGlobal("MSHTML._styleWhiteSpace")
@js.native
object _styleWhiteSpace extends js.Object {
  @js.native
  sealed trait styleWhiteSpaceNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpaceNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpaceNowrap
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpacePre
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpacePreline
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpacePrewrap
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  @js.native
  sealed trait styleWhiteSpace_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace
  
  /* 1 */ val styleWhiteSpaceNormal: styleWhiteSpaceNormal with scala.Double = js.native
  /* 0 */ val styleWhiteSpaceNotSet: styleWhiteSpaceNotSet with scala.Double = js.native
  /* 3 */ val styleWhiteSpaceNowrap: styleWhiteSpaceNowrap with scala.Double = js.native
  /* 2 */ val styleWhiteSpacePre: styleWhiteSpacePre with scala.Double = js.native
  /* 4 */ val styleWhiteSpacePreline: styleWhiteSpacePreline with scala.Double = js.native
  /* 5 */ val styleWhiteSpacePrewrap: styleWhiteSpacePrewrap with scala.Double = js.native
  /* 2147483647 */ val styleWhiteSpace_Max: styleWhiteSpace_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWhiteSpace with scala.Double] = js.native
}

