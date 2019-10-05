package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CommandBar")
@js.native
class CommandBar protected () extends js.Object {
  var AdaptiveMenu: Boolean = js.native
  val Application: js.Any = js.native
  val BuiltIn: Boolean = js.native
  var Context: String = js.native
  @JSName("Controls")
  val Controls_Original: CommandBarControls = js.native
  val Creator: Double = js.native
  var Enabled: Boolean = js.native
  var Height: Double = js.native
  val Id: Double = js.native
  val Index: Double = js.native
  val InstanceId: Double = js.native
  val InstanceIdPtr: js.Any = js.native
  var Left: Double = js.native
  var Name: String = js.native
  var NameLocal: String = js.native
  var `Office.CommandBar_typekey`: CommandBar = js.native
  val Parent: js.Any = js.native
  var Position: MsoBarPosition = js.native
  var Protection: MsoBarProtection = js.native
  var RowIndex: Double = js.native
  var Top: Double = js.native
  val Type: MsoBarType = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val accChildCount: Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def Controls(Index: String): CommandBarControl = js.native
  def Controls(Index: Double): CommandBarControl = js.native
  def Delete(): Unit = js.native
  def FindControl(): CommandBarControl = js.native
  def FindControl(Type: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any, Visible: Boolean): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any, Visible: Boolean, Recursive: Boolean): CommandBarControl = js.native
  def Reset(): Unit = js.native
  def ShowPopup(): Unit = js.native
  def ShowPopup(x: Double): Unit = js.native
  def ShowPopup(x: Double, y: Double): Unit = js.native
  def accChild(varChild: js.Any): js.Any = js.native
  def accDefaultAction(): String = js.native
  def accDefaultAction(varChild: js.Any): String = js.native
  def accDescription(): String = js.native
  def accDescription(varChild: js.Any): String = js.native
  def accDoDefaultAction(): Unit = js.native
  def accDoDefaultAction(varChild: js.Any): Unit = js.native
  def accHelp(): String = js.native
  def accHelp(varChild: js.Any): String = js.native
  def accHelpTopic(pszHelpFile: String): Double = js.native
  def accHelpTopic(pszHelpFile: String, varChild: js.Any): Double = js.native
  def accHitTest(xLeft: Double, yTop: Double): js.Any = js.native
  def accKeyboardShortcut(): String = js.native
  def accKeyboardShortcut(varChild: js.Any): String = js.native
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double): Unit = js.native
  def accLocation(pxLeft: Double, pyTop: Double, pcxWidth: Double, pcyHeight: Double, varChild: js.Any): Unit = js.native
  def accName(): String = js.native
  def accName(varChild: js.Any): String = js.native
  def accNavigate(navDir: Double): js.Any = js.native
  def accNavigate(navDir: Double, varStart: js.Any): js.Any = js.native
  def accRole(): js.Any = js.native
  def accRole(varChild: js.Any): js.Any = js.native
  def accSelect(flagsSelect: Double): Unit = js.native
  def accSelect(flagsSelect: Double, varChild: js.Any): Unit = js.native
  def accState(): js.Any = js.native
  def accState(varChild: js.Any): js.Any = js.native
  def accValue(): String = js.native
  def accValue(varChild: js.Any): String = js.native
}

