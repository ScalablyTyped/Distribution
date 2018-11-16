package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoWizardActType extends js.Object

@JSGlobal("Office.MsoWizardActType")
@js.native
object MsoWizardActType extends js.Object {
  @js.native
  sealed trait msoWizardActActive
    extends activexDashOfficeLib.OfficeNs.MsoWizardActType
  
  @js.native
  sealed trait msoWizardActInactive
    extends activexDashOfficeLib.OfficeNs.MsoWizardActType
  
  @js.native
  sealed trait msoWizardActResume
    extends activexDashOfficeLib.OfficeNs.MsoWizardActType
  
  @js.native
  sealed trait msoWizardActSuspend
    extends activexDashOfficeLib.OfficeNs.MsoWizardActType
  
  /* 1 */ val msoWizardActActive: msoWizardActActive with scala.Double = js.native
  /* 0 */ val msoWizardActInactive: msoWizardActInactive with scala.Double = js.native
  /* 3 */ val msoWizardActResume: msoWizardActResume with scala.Double = js.native
  /* 2 */ val msoWizardActSuspend: msoWizardActSuspend with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoWizardActType with scala.Double] = js.native
}

