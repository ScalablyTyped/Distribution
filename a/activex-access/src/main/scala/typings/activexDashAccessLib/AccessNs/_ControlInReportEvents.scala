package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access._ControlInReportEvents")
@js.native
class _ControlInReportEvents protected () extends js.Object {
  var `Access._ControlInReportEvents_typekey`: _ControlInReportEvents = js.native
  val Application: Application = js.native
  var BottomPadding: scala.Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  val Form: Form = js.native
  var GridlineColor: scala.Double = js.native
  var GridlineStyleBottom: scala.Double = js.native
  var GridlineStyleLeft: scala.Double = js.native
  var GridlineStyleRight: scala.Double = js.native
  var GridlineStyleTop: scala.Double = js.native
  var GridlineWidthBottom: scala.Double = js.native
  var GridlineWidthLeft: scala.Double = js.native
  var GridlineWidthRight: scala.Double = js.native
  var GridlineWidthTop: scala.Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  val Hyperlink: Hyperlink = js.native
  @JSName("ItemsSelected")
  val ItemsSelected_Original: _ItemsSelected = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: scala.Double = js.native
  var LeftPadding: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Object: js.Any = js.native
  val OldValue: js.Any = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Report: Report = js.native
  var RightPadding: scala.Double = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  var TopPadding: scala.Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var _Name: java.lang.String = js.native
  def Column(Index: scala.Double): js.Any = js.native
  def Column(Index: scala.Double, Row: js.Any): js.Any = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: java.lang.String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: scala.Double): T = js.native
  def Dropdown(): scala.Unit = js.native
  def Goto(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def ItemData(Index: scala.Double): js.Any = js.native
  def ItemsSelected(Index: js.Any): scala.Double = js.native
  def Move(Left: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double): scala.Unit = js.native
  def Move(Left: scala.Double, Top: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def ObjectVerbs(Index: scala.Double): java.lang.String = js.native
  def Pages(Index: java.lang.String): Page = js.native
  def Pages(Index: scala.Double): Page = js.native
  def Properties(Index: java.lang.String): AccessProperty = js.native
  def Properties(Index: scala.Double): AccessProperty = js.native
  def Requery(): scala.Unit = js.native
  def Selected(lRow: scala.Double): scala.Double = js.native
  def SetFocus(): scala.Unit = js.native
  def SizeToFit(): scala.Unit = js.native
  def SmartTags(Index: java.lang.String): SmartTag = js.native
  def SmartTags(Index: scala.Double): SmartTag = js.native
  def Undo(): scala.Unit = js.native
  def _Evaluate(bstrExpr: java.lang.String, ppsa: js.Any*): js.Any = js.native
}

