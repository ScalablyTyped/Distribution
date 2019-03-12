package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.CustomControl")
@js.native
class CustomControl protected () extends js.Object {
  var About: java.lang.String = js.native
  var `Access.CustomControl_typekey`: CustomControl = js.native
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  var BorderColor: scala.Double = js.native
  var BorderLineStyle: scala.Double = js.native
  var BorderShade: scala.Double = js.native
  var BorderStyle: scala.Double = js.native
  var BorderThemeColorIndex: scala.Double = js.native
  var BorderTint: scala.Double = js.native
  var BorderWidth: scala.Double = js.native
  var BottomPadding: scala.Double = js.native
  var Cancel: scala.Boolean = js.native
  var Class: java.lang.String = js.native
  var ControlName: java.lang.String = js.native
  var ControlSource: java.lang.String = js.native
  var ControlTipText: java.lang.String = js.native
  var ControlType: scala.Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var Custom: java.lang.String = js.native
  var Default: scala.Boolean = js.native
  var DisplayWhen: scala.Double = js.native
  var Enabled: scala.Boolean = js.native
  var EventProcPrefix: java.lang.String = js.native
  var GridlineColor: scala.Double = js.native
  var GridlineStyleBottom: scala.Double = js.native
  var GridlineStyleLeft: scala.Double = js.native
  var GridlineStyleRight: scala.Double = js.native
  var GridlineStyleTop: scala.Double = js.native
  var GridlineWidthBottom: scala.Double = js.native
  var GridlineWidthLeft: scala.Double = js.native
  var GridlineWidthRight: scala.Double = js.native
  var GridlineWidthTop: scala.Double = js.native
  var Height: scala.Double = js.native
  var HelpContextId: scala.Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  var InSelection: scala.Boolean = js.native
  var IsVisible: scala.Boolean = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: scala.Double = js.native
  var Left: scala.Double = js.native
  var LeftPadding: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var LpOleObject: scala.Double = js.native
  var Name: java.lang.String = js.native
  var OLEClass: java.lang.String = js.native
  val Object: js.Any = js.native
  var ObjectPalette: js.Any = js.native
  var ObjectVerbsCount: scala.Double = js.native
  var OldBorderStyle: scala.Double = js.native
  val OldValue: js.Any = js.native
  var OleData: js.Any = js.native
  var OnEnter: java.lang.String = js.native
  var OnEnterMacro: java.lang.String = js.native
  var OnExit: java.lang.String = js.native
  var OnExitMacro: java.lang.String = js.native
  var OnGotFocus: java.lang.String = js.native
  var OnGotFocusMacro: java.lang.String = js.native
  var OnLostFocus: java.lang.String = js.native
  var OnLostFocusMacro: java.lang.String = js.native
  var OnUpdated: java.lang.String = js.native
  var OnUpdatedMacro: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var RightPadding: scala.Double = js.native
  var Section: scala.Double = js.native
  var SpecialEffect: scala.Double = js.native
  var TabIndex: scala.Double = js.native
  var TabStop: scala.Boolean = js.native
  var Tag: java.lang.String = js.native
  var Top: scala.Double = js.native
  var TopPadding: scala.Double = js.native
  var Value: js.Any = js.native
  var VarOleObject: js.Any = js.native
  var Verb: scala.Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var _Name: java.lang.String = js.native
  val accChildCount: scala.Double = js.native
  val accFocus: js.Any = js.native
  val accParent: js.Any = js.native
  val accSelection: js.Any = js.native
  def Controls[T](Index: java.lang.String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: scala.Double): T = js.native
  def Goto(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Move(Left: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def ObjectVerbs(Index: scala.Double): java.lang.String = js.native
  def Properties(Index: java.lang.String): AccessProperty = js.native
  def Properties(Index: scala.Double): AccessProperty = js.native
  def Requery(): scala.Unit = js.native
  def SetFocus(): scala.Unit = js.native
  def SizeToFit(): scala.Unit = js.native
  def _Evaluate(bstrExpr: java.lang.String, ppsa: js.Any*): js.Any = js.native
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

