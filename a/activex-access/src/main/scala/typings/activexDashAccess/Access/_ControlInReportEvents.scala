package typings.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access._ControlInReportEvents")
@js.native
class _ControlInReportEvents protected () extends js.Object {
  @JSName("Access._ControlInReportEvents_typekey")
  var AccessDot_ControlInReportEvents_typekey: _ControlInReportEvents = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var BottomPadding: Double = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  val Form: typings.activexDashAccess.Access.Form = js.native
  var GridlineColor: Double = js.native
  var GridlineStyleBottom: Double = js.native
  var GridlineStyleLeft: Double = js.native
  var GridlineStyleRight: Double = js.native
  var GridlineStyleTop: Double = js.native
  var GridlineWidthBottom: Double = js.native
  var GridlineWidthLeft: Double = js.native
  var GridlineWidthRight: Double = js.native
  var GridlineWidthTop: Double = js.native
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  val Hyperlink: typings.activexDashAccess.Access.Hyperlink = js.native
  @JSName("ItemsSelected")
  val ItemsSelected_Original: _ItemsSelected = js.native
  val Layout: AcLayoutType = js.native
  val LayoutID: Double = js.native
  var LeftPadding: Double = js.native
  var Name: String = js.native
  val Object: js.Any = js.native
  val OldValue: js.Any = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Report: typings.activexDashAccess.Access.Report = js.native
  var RightPadding: Double = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  var TopPadding: Double = js.native
  var VerticalAnchor: AcVerticalAnchor = js.native
  var _Name: String = js.native
  def Column(Index: Double): js.Any = js.native
  def Column(Index: Double, Row: js.Any): js.Any = js.native
  def Controls[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  def Dropdown(): Unit = js.native
  def Goto(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def ItemData(Index: Double): js.Any = js.native
  def ItemsSelected(Index: js.Any): Double = js.native
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def ObjectVerbs(Index: Double): String = js.native
  def Pages(Index: String): Page = js.native
  def Pages(Index: Double): Page = js.native
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  def Requery(): Unit = js.native
  def Selected(lRow: Double): Double = js.native
  def SetFocus(): Unit = js.native
  def SizeToFit(): Unit = js.native
  def SmartTags(Index: String): SmartTag = js.native
  def SmartTags(Index: Double): SmartTag = js.native
  def Undo(): Unit = js.native
  def _Evaluate(bstrExpr: String, ppsa: js.Any*): js.Any = js.native
}

