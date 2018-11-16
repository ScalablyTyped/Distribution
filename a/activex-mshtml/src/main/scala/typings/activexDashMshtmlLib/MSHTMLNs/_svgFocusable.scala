package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgFocusable extends js.Object

@JSGlobal("MSHTML._svgFocusable")
@js.native
object _svgFocusable extends js.Object {
  @js.native
  sealed trait svgFocusableAuto
    extends activexDashMshtmlLib.MSHTMLNs._svgFocusable
  
  @js.native
  sealed trait svgFocusableFalse
    extends activexDashMshtmlLib.MSHTMLNs._svgFocusable
  
  @js.native
  sealed trait svgFocusableNotSet
    extends activexDashMshtmlLib.MSHTMLNs._svgFocusable
  
  @js.native
  sealed trait svgFocusableTrue
    extends activexDashMshtmlLib.MSHTMLNs._svgFocusable
  
  @js.native
  sealed trait svgFocusable_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgFocusable
  
  /* 1 */ val svgFocusableAuto: svgFocusableAuto with scala.Double = js.native
  /* 3 */ val svgFocusableFalse: svgFocusableFalse with scala.Double = js.native
  /* 0 */ val svgFocusableNotSet: svgFocusableNotSet with scala.Double = js.native
  /* 2 */ val svgFocusableTrue: svgFocusableTrue with scala.Double = js.native
  /* 2147483647 */ val svgFocusable_Max: svgFocusable_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgFocusable with scala.Double] = js.native
}

