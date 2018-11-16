package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoLastModified extends js.Object

@JSGlobal("Office.MsoLastModified")
@js.native
object MsoLastModified extends js.Object {
  @js.native
  sealed trait msoLastModifiedAnyTime
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedLastMonth
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedLastWeek
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedThisMonth
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedThisWeek
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedToday
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  @js.native
  sealed trait msoLastModifiedYesterday
    extends activexDashOfficeLib.OfficeNs.MsoLastModified
  
  /* 7 */ val msoLastModifiedAnyTime: msoLastModifiedAnyTime with scala.Double = js.native
  /* 5 */ val msoLastModifiedLastMonth: msoLastModifiedLastMonth with scala.Double = js.native
  /* 3 */ val msoLastModifiedLastWeek: msoLastModifiedLastWeek with scala.Double = js.native
  /* 6 */ val msoLastModifiedThisMonth: msoLastModifiedThisMonth with scala.Double = js.native
  /* 4 */ val msoLastModifiedThisWeek: msoLastModifiedThisWeek with scala.Double = js.native
  /* 2 */ val msoLastModifiedToday: msoLastModifiedToday with scala.Double = js.native
  /* 1 */ val msoLastModifiedYesterday: msoLastModifiedYesterday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoLastModified with scala.Double] = js.native
}

