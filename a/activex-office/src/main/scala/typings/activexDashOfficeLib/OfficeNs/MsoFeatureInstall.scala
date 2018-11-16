package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFeatureInstall extends js.Object

@JSGlobal("Office.MsoFeatureInstall")
@js.native
object MsoFeatureInstall extends js.Object {
  @js.native
  sealed trait msoFeatureInstallNone
    extends activexDashOfficeLib.OfficeNs.MsoFeatureInstall
  
  @js.native
  sealed trait msoFeatureInstallOnDemand
    extends activexDashOfficeLib.OfficeNs.MsoFeatureInstall
  
  @js.native
  sealed trait msoFeatureInstallOnDemandWithUI
    extends activexDashOfficeLib.OfficeNs.MsoFeatureInstall
  
  /* 0 */ val msoFeatureInstallNone: msoFeatureInstallNone with scala.Double = js.native
  /* 1 */ val msoFeatureInstallOnDemand: msoFeatureInstallOnDemand with scala.Double = js.native
  /* 2 */ val msoFeatureInstallOnDemandWithUI: msoFeatureInstallOnDemandWithUI with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFeatureInstall with scala.Double] = js.native
}

