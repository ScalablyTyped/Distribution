package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CommandBarButton")
@js.native
class CommandBarButton protected () extends js.Object {
  val Application: js.Any = js.native
  var BeginGroup: scala.Boolean = js.native
  val BuiltIn: scala.Boolean = js.native
  var BuiltInFace: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  val Control: js.Any = js.native
  val Creator: scala.Double = js.native
  var DescriptionText: java.lang.String = js.native
  var Enabled: scala.Boolean = js.native
  var FaceId: scala.Double = js.native
  var Height: scala.Double = js.native
  var HelpContextId: scala.Double = js.native
  var HelpFile: java.lang.String = js.native
  var HyperlinkType: MsoCommandBarButtonHyperlinkType = js.native
  val Id: scala.Double = js.native
  val Index: scala.Double = js.native
  val InstanceId: scala.Double = js.native
  val InstanceIdPtr: js.Any = js.native
  val IsPriorityDropped: scala.Boolean = js.native
  val Left: scala.Double = js.native
  var Mask: activexDashStdoleLib.stdoleNs.IPictureDisp = js.native
  var OLEUsage: MsoControlOLEUsage = js.native
  var `Office.CommandBarButton_typekey`: CommandBarButton = js.native
  var OnAction: java.lang.String = js.native
  var Parameter: java.lang.String = js.native
  val Parent: CommandBar = js.native
  var Picture: activexDashStdoleLib.stdoleNs.IPictureDisp = js.native
  var Priority: scala.Double = js.native
  var ShortcutText: java.lang.String = js.native
  var State: MsoButtonState = js.native
  var Style: MsoButtonStyle = js.native
  var Tag: java.lang.String = js.native
  var TooltipText: java.lang.String = js.native
  val Top: scala.Double = js.native
  val Type: MsoControlType = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val accChildCount: scala.Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def Copy(): CommandBarControl = js.native
  def Copy(Bar: CommandBar): CommandBarControl = js.native
  def Copy(Bar: CommandBar, Before: scala.Double): CommandBarControl = js.native
  def CopyFace(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Delete(Temporary: scala.Boolean): scala.Unit = js.native
  def Execute(): scala.Unit = js.native
  def Move(): CommandBarControl = js.native
  def Move(Bar: CommandBar): CommandBarControl = js.native
  def Move(Bar: CommandBar, Before: scala.Double): CommandBarControl = js.native
  def PasteFace(): scala.Unit = js.native
  def Reserved1(): scala.Unit = js.native
  def Reserved2(): scala.Unit = js.native
  def Reserved3(): scala.Unit = js.native
  def Reserved4(): scala.Unit = js.native
  def Reserved5(): scala.Unit = js.native
  def Reserved6(): scala.Unit = js.native
  def Reserved7(): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def SetFocus(): scala.Unit = js.native
  def accChild(varChild: js.Any): js.Any = js.native
  def accDefaultAction(): java.lang.String = js.native
  def accDefaultAction(varChild: js.Any): java.lang.String = js.native
  def accDescription(): java.lang.String = js.native
  def accDescription(varChild: js.Any): java.lang.String = js.native
  def accDoDefaultAction(): scala.Unit = js.native
  def accDoDefaultAction(varChild: js.Any): scala.Unit = js.native
  def accHelp(): java.lang.String = js.native
  def accHelp(varChild: js.Any): java.lang.String = js.native
  def accHelpTopic(pszHelpFile: java.lang.String): scala.Double = js.native
  def accHelpTopic(pszHelpFile: java.lang.String, varChild: js.Any): scala.Double = js.native
  def accHitTest(xLeft: scala.Double, yTop: scala.Double): js.Any = js.native
  def accKeyboardShortcut(): java.lang.String = js.native
  def accKeyboardShortcut(varChild: js.Any): java.lang.String = js.native
  def accLocation(pxLeft: scala.Double, pyTop: scala.Double, pcxWidth: scala.Double, pcyHeight: scala.Double): scala.Unit = js.native
  def accLocation(
    pxLeft: scala.Double,
    pyTop: scala.Double,
    pcxWidth: scala.Double,
    pcyHeight: scala.Double,
    varChild: js.Any
  ): scala.Unit = js.native
  def accName(): java.lang.String = js.native
  def accName(varChild: js.Any): java.lang.String = js.native
  def accNavigate(navDir: scala.Double): js.Any = js.native
  def accNavigate(navDir: scala.Double, varStart: js.Any): js.Any = js.native
  def accRole(): js.Any = js.native
  def accRole(varChild: js.Any): js.Any = js.native
  def accSelect(flagsSelect: scala.Double): scala.Unit = js.native
  def accSelect(flagsSelect: scala.Double, varChild: js.Any): scala.Unit = js.native
  def accState(): js.Any = js.native
  def accState(varChild: js.Any): js.Any = js.native
  def accValue(): java.lang.String = js.native
  def accValue(varChild: js.Any): java.lang.String = js.native
}

