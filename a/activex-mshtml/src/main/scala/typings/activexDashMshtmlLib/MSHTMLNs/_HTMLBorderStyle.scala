package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLBorderStyle extends js.Object

@JSGlobal("MSHTML._HTMLBorderStyle")
@js.native
object _HTMLBorderStyle extends js.Object {
  @js.native
  sealed trait HTMLBorderStyleNormal
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  @js.native
  sealed trait HTMLBorderStyleRaised
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  @js.native
  sealed trait HTMLBorderStyleStatic
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  @js.native
  sealed trait HTMLBorderStyleSunken
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  @js.native
  sealed trait HTMLBorderStyle_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  @js.native
  sealed trait HTMLBorderStylecombined
    extends activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle
  
  /* 0 */ val HTMLBorderStyleNormal: HTMLBorderStyleNormal with scala.Double = js.native
  /* 256 */ val HTMLBorderStyleRaised: HTMLBorderStyleRaised with scala.Double = js.native
  /* 131072 */ val HTMLBorderStyleStatic: HTMLBorderStyleStatic with scala.Double = js.native
  /* 512 */ val HTMLBorderStyleSunken: HTMLBorderStyleSunken with scala.Double = js.native
  /* 2147483647 */ val HTMLBorderStyle_Max: HTMLBorderStyle_Max with scala.Double = js.native
  /* 768 */ val HTMLBorderStylecombined: HTMLBorderStylecombined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLBorderStyle with scala.Double] = js.native
}

