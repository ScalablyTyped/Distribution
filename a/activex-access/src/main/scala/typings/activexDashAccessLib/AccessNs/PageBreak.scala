package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.PageBreak")
@js.native
class PageBreak protected () extends js.Object {
  var `Access.PageBreak_typekey`: PageBreak = js.native
  val Application: Application = js.native
  var ControlName: java.lang.String = js.native
  var ControlType: scala.Double = js.native
  var EventProcPrefix: java.lang.String = js.native
  var InSelection: scala.Boolean = js.native
  var IsVisible: scala.Boolean = js.native
  var Left: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Section: scala.Double = js.native
  var Tag: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Visible: scala.Boolean = js.native
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

