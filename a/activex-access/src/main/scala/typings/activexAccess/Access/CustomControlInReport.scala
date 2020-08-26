package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomControlInReport extends js.Object {
  var About: String = js.native
  @JSName("Access._CustomControlInReport_typekey")
  var AccessDot_CustomControlInReport_typekey: CustomControlInReport = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var BorderColor: Double = js.native
  var BorderLineStyle: Double = js.native
  var BorderShade: Double = js.native
  var BorderStyle: Double = js.native
  var BorderThemeColorIndex: Double = js.native
  var BorderTint: Double = js.native
  var BorderWidth: Double = js.native
  var BottomPadding: Double = js.native
  var Cancel: Boolean = js.native
  var Class: String = js.native
  var ControlName: String = js.native
  var ControlSource: String = js.native
  var ControlTipText: String = js.native
  var ControlType: Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var Custom: String = js.native
  var Default: Boolean = js.native
  var DisplayWhen: Double = js.native
  var Enabled: Boolean = js.native
  var EventProcPrefix: String = js.native
  var GridlineColor: Double = js.native
  var GridlineStyleBottom: Double = js.native
  var GridlineStyleLeft: Double = js.native
  var GridlineStyleRight: Double = js.native
  var GridlineStyleTop: Double = js.native
  var GridlineWidthBottom: Double = js.native
  var GridlineWidthLeft: Double = js.native
  var GridlineWidthRight: Double = js.native
  var GridlineWidthTop: Double = js.native
  var Height: Double = js.native
  var HelpContextId: Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  var InSelection: Boolean = js.native
  var IsVisible: Boolean = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: Double = js.native
  var Left: Double = js.native
  var LeftPadding: Double = js.native
  var Locked: Boolean = js.native
  var LpOleObject: Double = js.native
  var Name: String = js.native
  var OLEClass: String = js.native
  val Object: js.Any = js.native
  var ObjectPalette: js.Any = js.native
  var ObjectVerbsCount: Double = js.native
  var OldBorderStyle: Double = js.native
  val OldValue: js.Any = js.native
  var OleData: js.Any = js.native
  var OnEnter: String = js.native
  var OnEnterMacro: String = js.native
  var OnExit: String = js.native
  var OnExitMacro: String = js.native
  var OnGotFocus: String = js.native
  var OnGotFocusMacro: String = js.native
  var OnLostFocus: String = js.native
  var OnLostFocusMacro: String = js.native
  var OnUpdated: String = js.native
  var OnUpdatedMacro: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var RightPadding: Double = js.native
  var Section: Double = js.native
  var SpecialEffect: Double = js.native
  var TabIndex: Double = js.native
  var TabStop: Boolean = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var TopPadding: Double = js.native
  var Value: js.Any = js.native
  var VarOleObject: js.Any = js.native
  var Verb: Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
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
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: js.UndefOr[scala.Nothing], Height: Double): Unit = js.native
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: Double): Unit = js.native
  def Move(Left: Double, Top: js.UndefOr[scala.Nothing], Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: js.UndefOr[scala.Nothing], Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ObjectVerbs(Index: Double): String = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def Requery(): Unit = js.native
  def SetFocus(): Unit = js.native
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

