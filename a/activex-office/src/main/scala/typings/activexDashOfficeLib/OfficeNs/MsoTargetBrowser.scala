package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTargetBrowser extends js.Object

@JSGlobal("Office.MsoTargetBrowser")
@js.native
object MsoTargetBrowser extends js.Object {
  @js.native
  sealed trait msoTargetBrowserIE4
    extends activexDashOfficeLib.OfficeNs.MsoTargetBrowser
  
  @js.native
  sealed trait msoTargetBrowserIE5
    extends activexDashOfficeLib.OfficeNs.MsoTargetBrowser
  
  @js.native
  sealed trait msoTargetBrowserIE6
    extends activexDashOfficeLib.OfficeNs.MsoTargetBrowser
  
  @js.native
  sealed trait msoTargetBrowserV3
    extends activexDashOfficeLib.OfficeNs.MsoTargetBrowser
  
  @js.native
  sealed trait msoTargetBrowserV4
    extends activexDashOfficeLib.OfficeNs.MsoTargetBrowser
  
  /* 2 */ val msoTargetBrowserIE4: msoTargetBrowserIE4 with scala.Double = js.native
  /* 3 */ val msoTargetBrowserIE5: msoTargetBrowserIE5 with scala.Double = js.native
  /* 4 */ val msoTargetBrowserIE6: msoTargetBrowserIE6 with scala.Double = js.native
  /* 0 */ val msoTargetBrowserV3: msoTargetBrowserV3 with scala.Double = js.native
  /* 1 */ val msoTargetBrowserV4: msoTargetBrowserV4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTargetBrowser with scala.Double] = js.native
}

