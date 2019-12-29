package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Line")
@js.native
class Line protected () extends js.Object {
  @JSName("Access.Line_typekey")
  var AccessDotLine_typekey: Line = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
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
  var LineSlant: Boolean = js.native
  var Name: String = js.native
  var OldBorderStyle: Double = js.native
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
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def SizeToFit(): Unit = js.native
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
}

