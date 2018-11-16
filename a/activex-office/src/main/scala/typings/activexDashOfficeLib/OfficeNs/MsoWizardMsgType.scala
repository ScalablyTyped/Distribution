package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoWizardMsgType extends js.Object

@JSGlobal("Office.MsoWizardMsgType")
@js.native
object MsoWizardMsgType extends js.Object {
  @js.native
  sealed trait msoWizardMsgLocalStateOff
    extends activexDashOfficeLib.OfficeNs.MsoWizardMsgType
  
  @js.native
  sealed trait msoWizardMsgLocalStateOn
    extends activexDashOfficeLib.OfficeNs.MsoWizardMsgType
  
  @js.native
  sealed trait msoWizardMsgResuming
    extends activexDashOfficeLib.OfficeNs.MsoWizardMsgType
  
  @js.native
  sealed trait msoWizardMsgShowHelp
    extends activexDashOfficeLib.OfficeNs.MsoWizardMsgType
  
  @js.native
  sealed trait msoWizardMsgSuspending
    extends activexDashOfficeLib.OfficeNs.MsoWizardMsgType
  
  /* 2 */ val msoWizardMsgLocalStateOff: msoWizardMsgLocalStateOff with scala.Double = js.native
  /* 1 */ val msoWizardMsgLocalStateOn: msoWizardMsgLocalStateOn with scala.Double = js.native
  /* 5 */ val msoWizardMsgResuming: msoWizardMsgResuming with scala.Double = js.native
  /* 3 */ val msoWizardMsgShowHelp: msoWizardMsgShowHelp with scala.Double = js.native
  /* 4 */ val msoWizardMsgSuspending: msoWizardMsgSuspending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoWizardMsgType with scala.Double] = js.native
}

