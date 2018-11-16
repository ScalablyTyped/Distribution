package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlMethod extends js.Object

@JSGlobal("MSHTML._htmlMethod")
@js.native
object _htmlMethod extends js.Object {
  @js.native
  sealed trait htmlMethodGet
    extends activexDashMshtmlLib.MSHTMLNs._htmlMethod
  
  @js.native
  sealed trait htmlMethodNotSet
    extends activexDashMshtmlLib.MSHTMLNs._htmlMethod
  
  @js.native
  sealed trait htmlMethodPost
    extends activexDashMshtmlLib.MSHTMLNs._htmlMethod
  
  @js.native
  sealed trait htmlMethod_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlMethod
  
  /* 1 */ val htmlMethodGet: htmlMethodGet with scala.Double = js.native
  /* 0 */ val htmlMethodNotSet: htmlMethodNotSet with scala.Double = js.native
  /* 2 */ val htmlMethodPost: htmlMethodPost with scala.Double = js.native
  /* 2147483647 */ val htmlMethod_Max: htmlMethod_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlMethod with scala.Double] = js.native
}

