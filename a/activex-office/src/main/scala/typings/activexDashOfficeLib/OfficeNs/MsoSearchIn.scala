package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoSearchIn extends js.Object

@JSGlobal("Office.MsoSearchIn")
@js.native
object MsoSearchIn extends js.Object {
  @js.native
  sealed trait msoSearchInCustom
    extends activexDashOfficeLib.OfficeNs.MsoSearchIn
  
  @js.native
  sealed trait msoSearchInMyComputer
    extends activexDashOfficeLib.OfficeNs.MsoSearchIn
  
  @js.native
  sealed trait msoSearchInMyNetworkPlaces
    extends activexDashOfficeLib.OfficeNs.MsoSearchIn
  
  @js.native
  sealed trait msoSearchInOutlook
    extends activexDashOfficeLib.OfficeNs.MsoSearchIn
  
  /* 3 */ val msoSearchInCustom: msoSearchInCustom with scala.Double = js.native
  /* 0 */ val msoSearchInMyComputer: msoSearchInMyComputer with scala.Double = js.native
  /* 2 */ val msoSearchInMyNetworkPlaces: msoSearchInMyNetworkPlaces with scala.Double = js.native
  /* 1 */ val msoSearchInOutlook: msoSearchInOutlook with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoSearchIn with scala.Double] = js.native
}

