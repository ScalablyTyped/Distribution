package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _ELEMENTNAMESPACE_FLAGS extends js.Object

@JSGlobal("MSHTML._ELEMENTNAMESPACE_FLAGS")
@js.native
object _ELEMENTNAMESPACE_FLAGS extends js.Object {
  @js.native
  sealed trait ELEMENTNAMESPACEFLAGS_ALLOWANYTAG
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENTNAMESPACE_FLAGS
  
  @js.native
  sealed trait ELEMENTNAMESPACEFLAGS_QUERYFORUNKNOWNTAGS
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENTNAMESPACE_FLAGS
  
  @js.native
  sealed trait ELEMENTNAMESPACE_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._ELEMENTNAMESPACE_FLAGS
  
  /* 1 */ val ELEMENTNAMESPACEFLAGS_ALLOWANYTAG: ELEMENTNAMESPACEFLAGS_ALLOWANYTAG with scala.Double = js.native
  /* 2 */ val ELEMENTNAMESPACEFLAGS_QUERYFORUNKNOWNTAGS: ELEMENTNAMESPACEFLAGS_QUERYFORUNKNOWNTAGS with scala.Double = js.native
  /* 2147483647 */ val ELEMENTNAMESPACE_FLAGS_Max: ELEMENTNAMESPACE_FLAGS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._ELEMENTNAMESPACE_FLAGS with scala.Double] = js.native
}

