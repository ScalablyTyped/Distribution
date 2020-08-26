package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  @JSName("Access.Rectangle_typekey")
  var AccessDotRectangle_typekey: Rectangle = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var BackColor: Double = js.native
  var BackShade: Double = js.native
  var BackStyle: Double = js.native
  var BackThemeColorIndex: Double = js.native
  var BackTint: Double = js.native
  var BorderColor: Double = js.native
  var BorderLineStyle: Double = js.native
  var BorderShade: Double = js.native
  var BorderStyle: Double = js.native
  var BorderThemeColorIndex: Double = js.native
  var BorderTint: Double = js.native
  var BorderWidth: Double = js.native
  var ControlName: String = js.native
  var ControlType: Double = js.native
  var DisplayWhen: Double = js.native
  var EventProcPrefix: String = js.native
  var Height: Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  var InSelection: Boolean = js.native
  var IsVisible: Boolean = js.native
  var Left: Double = js.native
  var Name: String = js.native
  var OldBorderStyle: Double = js.native
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
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: Double = js.native
  var SpecialEffect: Double = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  var _Name: String = js.native
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
  def SizeToFit(): Unit = js.native
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
}

