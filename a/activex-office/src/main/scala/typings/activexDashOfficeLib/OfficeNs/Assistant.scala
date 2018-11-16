package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Assistant")
@js.native
class Assistant protected () extends js.Object {
  var Animation: MsoAnimationType = js.native
  val Application: js.Any = js.native
  var AssistWithAlerts: scala.Boolean = js.native
  var AssistWithHelp: scala.Boolean = js.native
  var AssistWithWizards: scala.Boolean = js.native
  val BalloonError: MsoBalloonErrorType = js.native
  val Creator: scala.Double = js.native
  var FeatureTips: scala.Boolean = js.native
  var FileName: java.lang.String = js.native
  var GuessHelp: scala.Boolean = js.native
  var HighPriorityTips: scala.Boolean = js.native
  val Item: java.lang.String = js.native
  var KeyboardShortcutTips: scala.Boolean = js.native
  var Left: scala.Double = js.native
  var MouseTips: scala.Boolean = js.native
  var MoveWhenInTheWay: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val NewBalloon: Balloon = js.native
  var `Office.Assistant_typekey`: Assistant = js.native
  var On: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var Reduced: scala.Boolean = js.native
  var SearchWhenProgramming: scala.Boolean = js.native
  var Sounds: scala.Boolean = js.native
  var TipOfDay: scala.Boolean = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
  def ActivateWizard(WizardID: scala.Double, act: MsoWizardActType): scala.Unit = js.native
  def ActivateWizard(WizardID: scala.Double, act: MsoWizardActType, Animation: MsoAnimationType): scala.Unit = js.native
  def DoAlert(
    bstrAlertTitle: java.lang.String,
    bstrAlertText: java.lang.String,
    alb: MsoAlertButtonType,
    alc: MsoAlertIconType,
    ald: MsoAlertDefaultType,
    alq: MsoAlertCancelType,
    varfSysAlert: scala.Boolean
  ): scala.Double = js.native
  def EndWizard(WizardID: scala.Double, varfSuccess: scala.Boolean): scala.Unit = js.native
  def EndWizard(WizardID: scala.Double, varfSuccess: scala.Boolean, Animation: MsoAnimationType): scala.Unit = js.native
  def Help(): scala.Unit = js.native
  def Move(xLeft: scala.Double, yTop: scala.Double): scala.Unit = js.native
  def ResetTips(): scala.Unit = js.native
  def StartWizard(
    On: scala.Boolean,
    Callback: java.lang.String,
    PrivateX: scala.Double,
    Animation: js.UndefOr[MsoAnimationType],
    CustomTeaser: js.UndefOr[js.Any],
    Top: js.UndefOr[scala.Double],
    Left: js.UndefOr[scala.Double],
    Bottom: js.UndefOr[scala.Double],
    Right: js.UndefOr[scala.Double]
  ): scala.Double = js.native
}

