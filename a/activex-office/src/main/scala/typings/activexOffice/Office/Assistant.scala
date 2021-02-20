package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assistant extends StObject {
  
  def ActivateWizard(WizardID: Double, act: MsoWizardActType): Unit = js.native
  def ActivateWizard(WizardID: Double, act: MsoWizardActType, Animation: MsoAnimationType): Unit = js.native
  
  var Animation: MsoAnimationType = js.native
  
  val Application: js.Any = js.native
  
  var AssistWithAlerts: Boolean = js.native
  
  var AssistWithHelp: Boolean = js.native
  
  var AssistWithWizards: Boolean = js.native
  
  val BalloonError: MsoBalloonErrorType = js.native
  
  val Creator: Double = js.native
  
  def DoAlert(
    bstrAlertTitle: String,
    bstrAlertText: String,
    alb: MsoAlertButtonType,
    alc: MsoAlertIconType,
    ald: MsoAlertDefaultType,
    alq: MsoAlertCancelType,
    varfSysAlert: Boolean
  ): Double = js.native
  
  def EndWizard(WizardID: Double, varfSuccess: Boolean): Unit = js.native
  def EndWizard(WizardID: Double, varfSuccess: Boolean, Animation: MsoAnimationType): Unit = js.native
  
  var FeatureTips: Boolean = js.native
  
  var FileName: String = js.native
  
  var GuessHelp: Boolean = js.native
  
  def Help(): Unit = js.native
  
  var HighPriorityTips: Boolean = js.native
  
  val Item: String = js.native
  
  var KeyboardShortcutTips: Boolean = js.native
  
  var Left: Double = js.native
  
  var MouseTips: Boolean = js.native
  
  def Move(xLeft: Double, yTop: Double): Unit = js.native
  
  var MoveWhenInTheWay: Boolean = js.native
  
  val Name: String = js.native
  
  val NewBalloon: Balloon = js.native
  
  @JSName("Office.Assistant_typekey")
  var OfficeDotAssistant_typekey: Assistant = js.native
  
  var On: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var Reduced: Boolean = js.native
  
  def ResetTips(): Unit = js.native
  
  var SearchWhenProgramming: Boolean = js.native
  
  var Sounds: Boolean = js.native
  
  def StartWizard(
    On: Boolean,
    Callback: String,
    PrivateX: Double,
    Animation: js.UndefOr[MsoAnimationType],
    CustomTeaser: js.UndefOr[js.Any],
    Top: js.UndefOr[Double],
    Left: js.UndefOr[Double],
    Bottom: js.UndefOr[Double],
    Right: js.UndefOr[Double]
  ): Double = js.native
  
  var TipOfDay: Boolean = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
}
