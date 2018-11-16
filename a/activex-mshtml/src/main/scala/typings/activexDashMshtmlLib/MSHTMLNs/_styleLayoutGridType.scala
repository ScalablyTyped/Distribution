package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLayoutGridType extends js.Object

@JSGlobal("MSHTML._styleLayoutGridType")
@js.native
object _styleLayoutGridType extends js.Object {
  @js.native
  sealed trait styleLayoutGridTypeFixed
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType
  
  @js.native
  sealed trait styleLayoutGridTypeLoose
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType
  
  @js.native
  sealed trait styleLayoutGridTypeNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType
  
  @js.native
  sealed trait styleLayoutGridTypeStrict
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType
  
  @js.native
  sealed trait styleLayoutGridType_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType
  
  /* 3 */ val styleLayoutGridTypeFixed: styleLayoutGridTypeFixed with scala.Double = js.native
  /* 1 */ val styleLayoutGridTypeLoose: styleLayoutGridTypeLoose with scala.Double = js.native
  /* 0 */ val styleLayoutGridTypeNotSet: styleLayoutGridTypeNotSet with scala.Double = js.native
  /* 2 */ val styleLayoutGridTypeStrict: styleLayoutGridTypeStrict with scala.Double = js.native
  /* 2147483647 */ val styleLayoutGridType_Max: styleLayoutGridType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLayoutGridType with scala.Double] = js.native
}

