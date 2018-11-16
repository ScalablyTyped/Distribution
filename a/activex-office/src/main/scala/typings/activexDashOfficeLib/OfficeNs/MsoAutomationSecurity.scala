package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAutomationSecurity extends js.Object

@JSGlobal("Office.MsoAutomationSecurity")
@js.native
object MsoAutomationSecurity extends js.Object {
  @js.native
  sealed trait msoAutomationSecurityByUI
    extends activexDashOfficeLib.OfficeNs.MsoAutomationSecurity
  
  @js.native
  sealed trait msoAutomationSecurityForceDisable
    extends activexDashOfficeLib.OfficeNs.MsoAutomationSecurity
  
  @js.native
  sealed trait msoAutomationSecurityLow
    extends activexDashOfficeLib.OfficeNs.MsoAutomationSecurity
  
  /* 2 */ val msoAutomationSecurityByUI: msoAutomationSecurityByUI with scala.Double = js.native
  /* 3 */ val msoAutomationSecurityForceDisable: msoAutomationSecurityForceDisable with scala.Double = js.native
  /* 1 */ val msoAutomationSecurityLow: msoAutomationSecurityLow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoAutomationSecurity with scala.Double] = js.native
}

