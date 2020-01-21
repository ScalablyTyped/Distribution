package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.Control")
@js.native
class Control protected () extends js.Object {
  var BoundValue: js.Any = js.native
  var Cancel: Boolean = js.native
  var ControlSource: String = js.native
  var ControlTipText: String = js.native
  var Default: Boolean = js.native
  var Height: Double = js.native
  var HelpContextID: Double = js.native
  var InSelection: Boolean = js.native
  val LayoutEffect: fmLayoutEffect = js.native
  var Left: Double = js.native
  @JSName("MSForms.Control_typekey")
  var MSFormsDotControl_typekey: Control = js.native
  var Name: String = js.native
  val Object: js.Any = js.native
  val OldHeight: Double = js.native
  val OldLeft: Double = js.native
  val OldTop: Double = js.native
  val OldWidth: Double = js.native
  val Parent: js.Any = js.native
  var RowSource: String = js.native
  var RowSourceType: Double = js.native
  var TabIndex: Double = js.native
  var TabStop: Boolean = js.native
  var Tag: String = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  def Move(): Unit = js.native
  def Move(Left: js.Any): Unit = js.native
  def Move(Left: js.Any, Top: js.Any): Unit = js.native
  def Move(Left: js.Any, Top: js.Any, Width: js.Any): Unit = js.native
  def Move(Left: js.Any, Top: js.Any, Width: js.Any, Height: js.Any): Unit = js.native
  def Move(Left: js.Any, Top: js.Any, Width: js.Any, Height: js.Any, Layout: js.Any): Unit = js.native
  def Select(SelectInGroup: Boolean): Unit = js.native
  def SetFocus(): Unit = js.native
  def ZOrder(): Unit = js.native
  def ZOrder(zPosition: js.Any): Unit = js.native
  def _GetHeight(Height: Double): Unit = js.native
  def _GetID(): Double = js.native
  def _GetLeft(Left: Double): Unit = js.native
  def _GetOldHeight(OldHeight: Double): Unit = js.native
  def _GetOldLeft(OldLeft: Double): Unit = js.native
  def _GetOldTop(OldTop: Double): Unit = js.native
  def _GetOldWidth(OldWidth: Double): Unit = js.native
  def _GetTop(Top: Double): Unit = js.native
  def _GetWidth(Width: Double): Unit = js.native
  def _GethWnd(): Double = js.native
  def _Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def _SetHeight(Height: Double): Unit = js.native
  def _SetLeft(Left: Double): Unit = js.native
  def _SetTop(Top: Double): Unit = js.native
  def _SetWidth(Width: Double): Unit = js.native
  def _ZOrder(zPosition: fmZOrder): Unit = js.native
}

