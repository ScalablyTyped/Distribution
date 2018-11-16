package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleAccelerator extends js.Object

@JSGlobal("MSHTML._styleAccelerator")
@js.native
object _styleAccelerator extends js.Object {
  @js.native
  sealed trait styleAcceleratorFalse
    extends activexDashMshtmlLib.MSHTMLNs._styleAccelerator
  
  @js.native
  sealed trait styleAcceleratorTrue
    extends activexDashMshtmlLib.MSHTMLNs._styleAccelerator
  
  @js.native
  sealed trait styleAccelerator_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleAccelerator
  
  /* 0 */ val styleAcceleratorFalse: styleAcceleratorFalse with scala.Double = js.native
  /* 1 */ val styleAcceleratorTrue: styleAcceleratorTrue with scala.Double = js.native
  /* 2147483647 */ val styleAccelerator_Max: styleAccelerator_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleAccelerator with scala.Double] = js.native
}

