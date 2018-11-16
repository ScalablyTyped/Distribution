package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleInitialString extends js.Object

@JSGlobal("MSHTML._styleInitialString")
@js.native
object _styleInitialString extends js.Object {
  @js.native
  sealed trait styleInitialStringAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialString
  
  @js.native
  sealed trait styleInitialStringNoInitial
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialString
  
  @js.native
  sealed trait styleInitialStringNone
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialString
  
  @js.native
  sealed trait styleInitialStringNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialString
  
  @js.native
  sealed trait styleInitialString_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialString
  
  /* 2 */ val styleInitialStringAuto: styleInitialStringAuto with scala.Double = js.native
  /* 0 */ val styleInitialStringNoInitial: styleInitialStringNoInitial with scala.Double = js.native
  /* 1 */ val styleInitialStringNone: styleInitialStringNone with scala.Double = js.native
  /* 3 */ val styleInitialStringNormal: styleInitialStringNormal with scala.Double = js.native
  /* 2147483647 */ val styleInitialString_Max: styleInitialString_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleInitialString with scala.Double] = js.native
}

