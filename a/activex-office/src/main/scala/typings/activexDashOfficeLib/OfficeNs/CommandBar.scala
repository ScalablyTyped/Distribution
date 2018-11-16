package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CommandBar")
@js.native
class CommandBar protected () extends js.Object {
  var AdaptiveMenu: scala.Boolean = js.native
  val Application: js.Any = js.native
  val BuiltIn: scala.Boolean = js.native
  var Context: java.lang.String = js.native
  @JSName("Controls")
  val Controls_Original: CommandBarControls = js.native
  val Creator: scala.Double = js.native
  var Enabled: scala.Boolean = js.native
  var Height: scala.Double = js.native
  val Id: scala.Double = js.native
  val Index: scala.Double = js.native
  val InstanceId: scala.Double = js.native
  val InstanceIdPtr: js.Any = js.native
  var Left: scala.Double = js.native
  var Name: java.lang.String = js.native
  var NameLocal: java.lang.String = js.native
  var `Office.CommandBar_typekey`: CommandBar = js.native
  val Parent: js.Any = js.native
  var Position: MsoBarPosition = js.native
  var Protection: MsoBarProtection = js.native
  var RowIndex: scala.Double = js.native
  var Top: scala.Double = js.native
  val Type: MsoBarType = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  val accChildCount: scala.Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def Controls(Index: java.lang.String): CommandBarControl = js.native
  def Controls(Index: scala.Double): CommandBarControl = js.native
  def Delete(): scala.Unit = js.native
  def FindControl(): CommandBarControl = js.native
  def FindControl(Type: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any, Visible: scala.Boolean): CommandBarControl = js.native
  def FindControl(Type: js.Any, Id: js.Any, Tag: js.Any, Visible: scala.Boolean, Recursive: scala.Boolean): CommandBarControl = js.native
  def Reset(): scala.Unit = js.native
  def ShowPopup(): scala.Unit = js.native
  def ShowPopup(x: scala.Double): scala.Unit = js.native
  def ShowPopup(x: scala.Double, y: scala.Double): scala.Unit = js.native
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

