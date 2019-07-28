package typings.activexDashAccess.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Page")
@js.native
class Page protected () extends js.Object {
  var `Access.Page_typekey`: Page = js.native
  val Application: typings.activexDashAccess.AccessNs.Application = js.native
  var Caption: String = js.native
  var ControlName: String = js.native
  var ControlTipText: String = js.native
  var ControlType: Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var Enabled: Boolean = js.native
  var EventProcPrefix: String = js.native
  var Height: Double = js.native
  var HelpContextId: Double = js.native
  var InSelection: Boolean = js.native
  var IsVisible: Boolean = js.native
  var Left: Double = js.native
  var Name: String = js.native
  var OnClick: String = js.native
  var OnClickMacro: String = js.native
  var OnDblClick: String = js.native
  var OnDblClickMacro: String = js.native
  var OnMouseDown: String = js.native
  var OnMouseDownMacro: String = js.native
  var OnMouseMove: String = js.native
  var OnMouseMoveMacro: String = js.native
  var OnMouseUp: String = js.native
  var OnMouseUpMacro: String = js.native
  var PageIndex: Double = js.native
  val Parent: js.Any = js.native
  var Picture: String = js.native
  var PictureData: js.Any = js.native
  var PictureType: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: Double = js.native
  var ShortcutMenuBar: String = js.native
  var StatusBarText: String = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var _Name: String = js.native
  val accChildCount: Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def Controls[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  def Goto(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def Requery(): Unit = js.native
  def SetFocus(): Unit = js.native
  def SetTabOrder(): Unit = js.native
  def SizeToFit(): Unit = js.native
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
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

