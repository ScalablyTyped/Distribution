package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleHyphens extends js.Object

@JSGlobal("MSHTML._styleHyphens")
@js.native
object _styleHyphens extends js.Object {
  @js.native
  sealed trait styleHyphensAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphens
  
  @js.native
  sealed trait styleHyphensManual
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphens
  
  @js.native
  sealed trait styleHyphensNone
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphens
  
  @js.native
  sealed trait styleHyphensNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphens
  
  @js.native
  sealed trait styleHyphens_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphens
  
  /* 2 */ val styleHyphensAuto: styleHyphensAuto with scala.Double = js.native
  /* 1 */ val styleHyphensManual: styleHyphensManual with scala.Double = js.native
  /* 0 */ val styleHyphensNone: styleHyphensNone with scala.Double = js.native
  /* 3 */ val styleHyphensNotSet: styleHyphensNotSet with scala.Double = js.native
  /* 2147483647 */ val styleHyphens_Max: styleHyphens_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleHyphens with scala.Double] = js.native
}

