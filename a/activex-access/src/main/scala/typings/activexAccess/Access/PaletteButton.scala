package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteButton extends js.Object {
  @JSName("Access.PaletteButton_typekey")
  var AccessDotPaletteButton_typekey: PaletteButton = js.native
  var AddColon: Boolean = js.native
  var AfterUpdate: String = js.native
  var AfterUpdateMacro: String = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var AutoLabel: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: Double = js.native
  var BeforeUpdate: String = js.native
  var BeforeUpdateMacro: String = js.native
  var ColumnHidden: Boolean = js.native
  var ColumnOrder: Double = js.native
  var ColumnWidth: Double = js.native
  var ControlName: String = js.native
  var ControlSource: String = js.native
  var ControlTipText: String = js.native
  var ControlType: Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  var DefaultValue: String = js.native
  var DisplayWhen: Double = js.native
  var Enabled: Boolean = js.native
  var EventProcPrefix: String = js.native
  var Height: Double = js.native
  var HelpContextId: Double = js.native
  var HideDuplicates: Boolean = js.native
  var InSelection: Boolean = js.native
  var IsVisible: Boolean = js.native
  var LabelAlign: Double = js.native
  var LabelX: Double = js.native
  var LabelY: Double = js.native
  var Left: Double = js.native
  var Locked: Boolean = js.native
  var Name: String = js.native
  val OldValue: js.Any = js.native
  var OnClick: String = js.native
  var OnClickMacro: String = js.native
  var OnDblClick: String = js.native
  var OnDblClickMacro: String = js.native
  var OnEnter: String = js.native
  var OnEnterMacro: String = js.native
  var OnExit: String = js.native
  var OnExitMacro: String = js.native
  var OnGotFocus: String = js.native
  var OnGotFocusMacro: String = js.native
  var OnKeyDown: String = js.native
  var OnKeyDownMacro: String = js.native
  var OnKeyPress: String = js.native
  var OnKeyPressMacro: String = js.native
  var OnKeyUp: String = js.native
  var OnKeyUpMacro: String = js.native
  var OnLostFocus: String = js.native
  var OnLostFocusMacro: String = js.native
  var OnMouseDown: String = js.native
  var OnMouseDownMacro: String = js.native
  var OnMouseMove: String = js.native
  var OnMouseMoveMacro: String = js.native
  var OnMouseUp: String = js.native
  var OnMouseUpMacro: String = js.native
  var OptionValue: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: Double = js.native
  var ShortcutMenuBar: String = js.native
  var StatusBarText: String = js.native
  var TabIndex: Double = js.native
  var TabStop: Boolean = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var TripleState: Boolean = js.native
  var ValidationRule: String = js.native
  var ValidationText: String = js.native
  var Value: js.Any = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var _Name: String = js.native
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
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def Requery(): Unit = js.native
  def SetFocus(): Unit = js.native
  def SizeToFit(): Unit = js.native
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
}

