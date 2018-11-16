package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoBlogCategorySupport extends js.Object

@JSGlobal("Office.MsoBlogCategorySupport")
@js.native
object MsoBlogCategorySupport extends js.Object {
  @js.native
  sealed trait msoBlogMultipleCategories
    extends activexDashOfficeLib.OfficeNs.MsoBlogCategorySupport
  
  @js.native
  sealed trait msoBlogNoCategories
    extends activexDashOfficeLib.OfficeNs.MsoBlogCategorySupport
  
  @js.native
  sealed trait msoBlogOneCategory
    extends activexDashOfficeLib.OfficeNs.MsoBlogCategorySupport
  
  /* 2 */ val msoBlogMultipleCategories: msoBlogMultipleCategories with scala.Double = js.native
  /* 0 */ val msoBlogNoCategories: msoBlogNoCategories with scala.Double = js.native
  /* 1 */ val msoBlogOneCategory: msoBlogOneCategory with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoBlogCategorySupport with scala.Double] = js.native
}

