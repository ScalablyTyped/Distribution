package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CommandBarComboBox")
@js.native
class CommandBarComboBox protected () extends js.Object {
  val Application: js.Any = js.native
  var BeginGroup: Boolean = js.native
  val BuiltIn: Boolean = js.native
  var Caption: String = js.native
  val Control: js.Any = js.native
  val Creator: Double = js.native
  var DescriptionText: String = js.native
  var DropDownLines: Double = js.native
  var DropDownWidth: Double = js.native
  var Enabled: Boolean = js.native
  var Height: Double = js.native
  var HelpContextId: Double = js.native
  var HelpFile: String = js.native
  val Id: Double = js.native
  val Index: Double = js.native
  val InstanceId: Double = js.native
  val InstanceIdPtr: js.Any = js.native
  val IsPriorityDropped: Boolean = js.native
  val Left: Double = js.native
  val ListCount: Double = js.native
  var ListHeaderCount: Double = js.native
  var ListIndex: Double = js.native
  var OLEUsage: MsoControlOLEUsage = js.native
  var `Office.CommandBarComboBox_typekey`: CommandBarComboBox = js.native
  var OnAction: String = js.native
  var Parameter: String = js.native
  val Parent: CommandBar = js.native
  var Priority: Double = js.native
  var Style: MsoComboStyle = js.native
  var Tag: String = js.native
  var Text: String = js.native
  var TooltipText: String = js.native
  val Top: Double = js.native
  val Type: MsoControlType = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val accChildCount: Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def AddItem(Text: String): Unit = js.native
  def AddItem(Text: String, Index: js.Any): Unit = js.native
  def Clear(): Unit = js.native
  def Copy(): CommandBarControl = js.native
  def Copy(Bar: CommandBar): CommandBarControl = js.native
  def Copy(Bar: CommandBar, Before: Double): CommandBarControl = js.native
  def Delete(): Unit = js.native
  def Delete(Temporary: Boolean): Unit = js.native
  def Execute(): Unit = js.native
  def List(Index: Double): String = js.native
  def Move(): CommandBarControl = js.native
  def Move(Bar: CommandBar): CommandBarControl = js.native
  def Move(Bar: CommandBar, Before: Double): CommandBarControl = js.native
  def RemoveItem(Index: Double): Unit = js.native
  def Reserved1(): Unit = js.native
  def Reserved2(): Unit = js.native
  def Reserved3(): Unit = js.native
  def Reserved4(): Unit = js.native
  def Reserved5(): Unit = js.native
  def Reserved6(): Unit = js.native
  def Reserved7(): Unit = js.native
  def Reset(): Unit = js.native
  def SetFocus(): Unit = js.native
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

