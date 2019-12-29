package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.WebBrowserControl")
@js.native
class WebBrowserControl protected () extends js.Object {
  @JSName("Access.WebBrowserControl_typekey")
  var AccessDotWebBrowserControl_typekey: WebBrowserControl = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var BorderColor: Double = js.native
  var BorderLineStyle: Double = js.native
  var BorderShade: Double = js.native
  var BorderStyle: Double = js.native
  var BorderThemeColorIndex: Double = js.native
  var BorderTint: Double = js.native
  var BorderWidth: Double = js.native
  var BottomPadding: Double = js.native
  var ControlSource: String = js.native
  var ControlTipText: String = js.native
  var ControlType: Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var DisplayWhen: Double = js.native
  var Enabled: Boolean = js.native
  var EventProcPrefix: String = js.native
  var GridlineColor: Double = js.native
  var GridlineShade: Double = js.native
  var GridlineStyleBottom: Double = js.native
  var GridlineStyleLeft: Double = js.native
  var GridlineStyleRight: Double = js.native
  var GridlineStyleTop: Double = js.native
  var GridlineThemeColorIndex: Double = js.native
  var GridlineTint: Double = js.native
  var GridlineWidthBottom: Double = js.native
  var GridlineWidthLeft: Double = js.native
  var GridlineWidthRight: Double = js.native
  var GridlineWidthTop: Double = js.native
  var Height: Double = js.native
  var HelpContextId: Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  val Hyperlink: typings.activexDashAccess.Access.Hyperlink = js.native
  var InSelection: Boolean = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: Double = js.native
  var Left: Double = js.native
  var LeftPadding: Double = js.native
  val LocationURL: String = js.native
  var Name: String = js.native
  val Object: js.Any = js.native
  val OldValue: js.Any = js.native
  var OnBeforeNavigate: String = js.native
  var OnBeforeNavigateMacro: String = js.native
  var OnClickMacro: String = js.native
  var OnDblClickMacro: String = js.native
  var OnDocumentComplete: String = js.native
  var OnDocumentCompleteMacro: String = js.native
  var OnKeyDown: String = js.native
  var OnKeyDownMacro: String = js.native
  var OnKeyPress: String = js.native
  var OnKeyPressMacro: String = js.native
  var OnKeyUp: String = js.native
  var OnKeyUpMacro: String = js.native
  var OnMouseDown: String = js.native
  var OnMouseDownMacro: String = js.native
  var OnMouseMove: String = js.native
  var OnMouseMoveMacro: String = js.native
  var OnMouseUp: String = js.native
  var OnMouseUpMacro: String = js.native
  var OnNavigateError: String = js.native
  var OnNavigateErrorMacro: String = js.native
  var OnProgressChange: String = js.native
  var OnProgressChangeMacro: String = js.native
  var OnUpdated: String = js.native
  var OnUpdatedMacro: String = js.native
  val Parent: js.Any = js.native
  val Progress: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val ReadyState: AcWebBrowserState = js.native
  var RightPadding: Double = js.native
  var ScrollBars: AcWebBrowserScrollBars = js.native
  var ScrollLeft: Double = js.native
  var ScrollTop: Double = js.native
  var Section: Double = js.native
  var SpecialEffect: Double = js.native
  var StatusBarText: String = js.native
  var TabIndex: Double = js.native
  var TabStop: Boolean = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var TopPadding: Double = js.native
  var Transform: String = js.native
  var Value: js.Any = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
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
  def SizeToFit(): Unit = js.native
  def Undo(): Unit = js.native
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

