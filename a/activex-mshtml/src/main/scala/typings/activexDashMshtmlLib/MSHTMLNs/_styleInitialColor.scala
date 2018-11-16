package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleInitialColor extends js.Object

@JSGlobal("MSHTML._styleInitialColor")
@js.native
object _styleInitialColor extends js.Object {
  @js.native
  sealed trait styleInitialColorColorProperty
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialColor
  
  @js.native
  sealed trait styleInitialColorInvert
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialColor
  
  @js.native
  sealed trait styleInitialColorNoInitial
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialColor
  
  @js.native
  sealed trait styleInitialColorTransparent
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialColor
  
  @js.native
  sealed trait styleInitialColor_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleInitialColor
  
  /* 1 */ val styleInitialColorColorProperty: styleInitialColorColorProperty with scala.Double = js.native
  /* 3 */ val styleInitialColorInvert: styleInitialColorInvert with scala.Double = js.native
  /* 0 */ val styleInitialColorNoInitial: styleInitialColorNoInitial with scala.Double = js.native
  /* 2 */ val styleInitialColorTransparent: styleInitialColorTransparent with scala.Double = js.native
  /* 2147483647 */ val styleInitialColor_Max: styleInitialColor_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleInitialColor with scala.Double] = js.native
}

