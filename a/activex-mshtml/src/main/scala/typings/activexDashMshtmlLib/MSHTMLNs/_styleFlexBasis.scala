package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFlexBasis extends js.Object

@JSGlobal("MSHTML._styleFlexBasis")
@js.native
object _styleFlexBasis extends js.Object {
  @js.native
  sealed trait styleFlexBasisAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexBasis
  
  @js.native
  sealed trait styleFlexBasisNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexBasis
  
  @js.native
  sealed trait styleFlexBasis_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFlexBasis
  
  /* 0 */ val styleFlexBasisAuto: styleFlexBasisAuto with scala.Double = js.native
  /* 1 */ val styleFlexBasisNotSet: styleFlexBasisNotSet with scala.Double = js.native
  /* 2147483647 */ val styleFlexBasis_Max: styleFlexBasis_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFlexBasis with scala.Double] = js.native
}

