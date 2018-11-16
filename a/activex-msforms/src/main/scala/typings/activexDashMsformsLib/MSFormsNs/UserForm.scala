package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.UserForm")
@js.native
class UserForm protected () extends js.Object {
  val ActiveControl: Control = js.native
  var BackColor: scala.Double = js.native
  var BorderColor: scala.Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  val CanPaste: scala.Boolean = js.native
  val CanRedo: scala.Boolean = js.native
  val CanUndo: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  @JSName("Controls")
  val Controls_Original: Controls = js.native
  var Cycle: fmCycle = js.native
  var DesignMode: fmMode = js.native
  var DrawBuffer: scala.Double = js.native
  var Enabled: scala.Boolean = js.native
  var Font: NewFont = js.native
  var ForeColor: scala.Double = js.native
  var GridX: scala.Double = js.native
  var GridY: scala.Double = js.native
  val InsideHeight: scala.Double = js.native
  val InsideWidth: scala.Double = js.native
  var KeepScrollBarsVisible: fmScrollBars = js.native
  var `MSForms.UserForm_typekey`: UserForm = js.native
  var MouseIcon: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Picture: activexDashStdoleLib.stdoleNs.StdPicture = js.native
  var PictureAlignment: fmPictureAlignment = js.native
  var PictureSizeMode: fmPictureSizeMode = js.native
  var PictureTiling: scala.Boolean = js.native
  var ScrollBars: fmScrollBars = js.native
  var ScrollHeight: scala.Double = js.native
  var ScrollLeft: scala.Double = js.native
  var ScrollTop: scala.Double = js.native
  var ScrollWidth: scala.Double = js.native
  @JSName("Selected")
  val Selected_Original: Controls = js.native
  var ShowGridDots: fmMode = js.native
  var ShowToolbox: fmMode = js.native
  var SnapToGrid: fmMode = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var VerticalScrollBarSide: fmVerticalScrollBarSide = js.native
  var Zoom: scala.Double = js.native
  val _Font_Reserved: NewFont = js.native
  def Controls(varg: js.Any): js.Any = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Paste(): scala.Unit = js.native
  def RedoAction(): scala.Unit = js.native
  def Repaint(): scala.Unit = js.native
  def Scroll(): scala.Unit = js.native
  def Scroll(xAction: js.Any): scala.Unit = js.native
  def Scroll(xAction: js.Any, yAction: js.Any): scala.Unit = js.native
  def Selected(varg: js.Any): js.Any = js.native
  def SetDefaultTabOrder(): scala.Unit = js.native
  def UndoAction(): scala.Unit = js.native
  def _GetGridX(GridX: scala.Double): scala.Unit = js.native
  def _GetGridY(GridY: scala.Double): scala.Unit = js.native
  def _GetInsideHeight(InsideHeight: scala.Double): scala.Unit = js.native
  def _GetInsideWidth(InsideWidth: scala.Double): scala.Unit = js.native
  def _GetScrollHeight(ScrollHeight: scala.Double): scala.Unit = js.native
  def _GetScrollLeft(ScrollLeft: scala.Double): scala.Unit = js.native
  def _GetScrollTop(ScrollTop: scala.Double): scala.Unit = js.native
  def _GetScrollWidth(ScrollWidth: scala.Double): scala.Unit = js.native
  def _SetGridX(GridX: scala.Double): scala.Unit = js.native
  def _SetGridY(GridY: scala.Double): scala.Unit = js.native
  def _SetScrollHeight(ScrollHeight: scala.Double): scala.Unit = js.native
  def _SetScrollLeft(ScrollLeft: scala.Double): scala.Unit = js.native
  def _SetScrollTop(ScrollTop: scala.Double): scala.Unit = js.native
  def _SetScrollWidth(ScrollWidth: scala.Double): scala.Unit = js.native
}

