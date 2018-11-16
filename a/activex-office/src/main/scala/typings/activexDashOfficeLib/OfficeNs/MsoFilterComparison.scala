package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFilterComparison extends js.Object

@JSGlobal("Office.MsoFilterComparison")
@js.native
object MsoFilterComparison extends js.Object {
  @js.native
  sealed trait msoFilterComparisonContains
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonEqual
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonGreaterThan
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonGreaterThanEqual
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonIsBlank
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonIsNotBlank
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonLessThan
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonLessThanEqual
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonNotContains
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  @js.native
  sealed trait msoFilterComparisonNotEqual
    extends activexDashOfficeLib.OfficeNs.MsoFilterComparison
  
  /* 8 */ val msoFilterComparisonContains: msoFilterComparisonContains with scala.Double = js.native
  /* 0 */ val msoFilterComparisonEqual: msoFilterComparisonEqual with scala.Double = js.native
  /* 3 */ val msoFilterComparisonGreaterThan: msoFilterComparisonGreaterThan with scala.Double = js.native
  /* 5 */ val msoFilterComparisonGreaterThanEqual: msoFilterComparisonGreaterThanEqual with scala.Double = js.native
  /* 6 */ val msoFilterComparisonIsBlank: msoFilterComparisonIsBlank with scala.Double = js.native
  /* 7 */ val msoFilterComparisonIsNotBlank: msoFilterComparisonIsNotBlank with scala.Double = js.native
  /* 2 */ val msoFilterComparisonLessThan: msoFilterComparisonLessThan with scala.Double = js.native
  /* 4 */ val msoFilterComparisonLessThanEqual: msoFilterComparisonLessThanEqual with scala.Double = js.native
  /* 9 */ val msoFilterComparisonNotContains: msoFilterComparisonNotContains with scala.Double = js.native
  /* 1 */ val msoFilterComparisonNotEqual: msoFilterComparisonNotEqual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFilterComparison with scala.Double] = js.native
}

