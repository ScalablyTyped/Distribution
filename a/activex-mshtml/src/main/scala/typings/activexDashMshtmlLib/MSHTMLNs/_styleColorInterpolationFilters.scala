package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleColorInterpolationFilters extends js.Object

@JSGlobal("MSHTML._styleColorInterpolationFilters")
@js.native
object _styleColorInterpolationFilters extends js.Object {
  @js.native
  sealed trait styleColorInterpolationFiltersAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters
  
  @js.native
  sealed trait styleColorInterpolationFiltersLinearRgb
    extends activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters
  
  @js.native
  sealed trait styleColorInterpolationFiltersNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters
  
  @js.native
  sealed trait styleColorInterpolationFiltersSRgb
    extends activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters
  
  @js.native
  sealed trait styleColorInterpolationFilters_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters
  
  /* 0 */ val styleColorInterpolationFiltersAuto: styleColorInterpolationFiltersAuto with scala.Double = js.native
  /* 2 */ val styleColorInterpolationFiltersLinearRgb: styleColorInterpolationFiltersLinearRgb with scala.Double = js.native
  /* 3 */ val styleColorInterpolationFiltersNotSet: styleColorInterpolationFiltersNotSet with scala.Double = js.native
  /* 1 */ val styleColorInterpolationFiltersSRgb: styleColorInterpolationFiltersSRgb with scala.Double = js.native
  /* 2147483647 */ val styleColorInterpolationFilters_Max: styleColorInterpolationFilters_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleColorInterpolationFilters with scala.Double] = js.native
}

