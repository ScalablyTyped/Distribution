package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Rectangle")
@js.native
class Rectangle protected () extends js.Object {
  var `Access.Rectangle_typekey`: Rectangle = js.native
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  var BackColor: scala.Double = js.native
  var BackShade: scala.Double = js.native
  var BackStyle: scala.Double = js.native
  var BackThemeColorIndex: scala.Double = js.native
  var BackTint: scala.Double = js.native
  var BorderColor: scala.Double = js.native
  var BorderLineStyle: scala.Double = js.native
  var BorderShade: scala.Double = js.native
  var BorderStyle: scala.Double = js.native
  var BorderThemeColorIndex: scala.Double = js.native
  var BorderTint: scala.Double = js.native
  var BorderWidth: scala.Double = js.native
  var ControlName: java.lang.String = js.native
  var ControlType: scala.Double = js.native
  var DisplayWhen: scala.Double = js.native
  var EventProcPrefix: java.lang.String = js.native
  var Height: scala.Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  var InSelection: scala.Boolean = js.native
  var IsVisible: scala.Boolean = js.native
  var Left: scala.Double = js.native
  var Name: java.lang.String = js.native
  var OldBorderStyle: scala.Double = js.native
  var OnClick: java.lang.String = js.native
  var OnClickMacro: java.lang.String = js.native
  var OnDblClick: java.lang.String = js.native
  var OnDblClickMacro: java.lang.String = js.native
  var OnMouseDown: java.lang.String = js.native
  var OnMouseDownMacro: java.lang.String = js.native
  var OnMouseMove: java.lang.String = js.native
  var OnMouseMoveMacro: java.lang.String = js.native
  var OnMouseUp: java.lang.String = js.native
  var OnMouseUpMacro: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: scala.Double = js.native
  var SpecialEffect: scala.Double = js.native
  var Tag: java.lang.String = js.native
  var Top: scala.Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var Visible: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var _Name: java.lang.String = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Move(Left: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def Properties(Index: java.lang.String): AccessProperty = js.native
  def Properties(Index: scala.Double): AccessProperty = js.native
  def SizeToFit(): scala.Unit = js.native
  def _Evaluate(bstrExpr: java.lang.String, ppsa: js.Any*): js.Any = js.native
}

