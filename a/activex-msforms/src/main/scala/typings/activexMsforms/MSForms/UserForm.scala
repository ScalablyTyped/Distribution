package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.UserForm")
@js.native
class UserForm protected () extends js.Object {
  val ActiveControl: Control = js.native
  var BackColor: Double = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  val CanPaste: Boolean = js.native
  val CanRedo: Boolean = js.native
  val CanUndo: Boolean = js.native
  var Caption: String = js.native
  @JSName("Controls")
  val Controls_Original: Controls = js.native
  var Cycle: fmCycle = js.native
  var DesignMode: fmMode = js.native
  var DrawBuffer: Double = js.native
  var Enabled: Boolean = js.native
  var Font: NewFont = js.native
  var ForeColor: Double = js.native
  var GridX: Double = js.native
  var GridY: Double = js.native
  val InsideHeight: Double = js.native
  val InsideWidth: Double = js.native
  var KeepScrollBarsVisible: fmScrollBars = js.native
  @JSName("MSForms.UserForm_typekey")
  var MSFormsDotUserForm_typekey: UserForm = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Picture: StdPicture = js.native
  var PictureAlignment: fmPictureAlignment = js.native
  var PictureSizeMode: fmPictureSizeMode = js.native
  var PictureTiling: Boolean = js.native
  var ScrollBars: fmScrollBars = js.native
  var ScrollHeight: Double = js.native
  var ScrollLeft: Double = js.native
  var ScrollTop: Double = js.native
  var ScrollWidth: Double = js.native
  @JSName("Selected")
  val Selected_Original: Controls = js.native
  var ShowGridDots: fmMode = js.native
  var ShowToolbox: fmMode = js.native
  var SnapToGrid: fmMode = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var VerticalScrollBarSide: fmVerticalScrollBarSide = js.native
  var Zoom: Double = js.native
  val _Font_Reserved: NewFont = js.native
  def Controls(varg: js.Any): js.Any = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
  def RedoAction(): Unit = js.native
  def Repaint(): Unit = js.native
  def Scroll(): Unit = js.native
  def Scroll(xAction: js.Any): Unit = js.native
  def Scroll(xAction: js.Any, yAction: js.Any): Unit = js.native
  def Selected(varg: js.Any): js.Any = js.native
  def SetDefaultTabOrder(): Unit = js.native
  def UndoAction(): Unit = js.native
  def _GetGridX(GridX: Double): Unit = js.native
  def _GetGridY(GridY: Double): Unit = js.native
  def _GetInsideHeight(InsideHeight: Double): Unit = js.native
  def _GetInsideWidth(InsideWidth: Double): Unit = js.native
  def _GetScrollHeight(ScrollHeight: Double): Unit = js.native
  def _GetScrollLeft(ScrollLeft: Double): Unit = js.native
  def _GetScrollTop(ScrollTop: Double): Unit = js.native
  def _GetScrollWidth(ScrollWidth: Double): Unit = js.native
  def _SetGridX(GridX: Double): Unit = js.native
  def _SetGridY(GridY: Double): Unit = js.native
  def _SetScrollHeight(ScrollHeight: Double): Unit = js.native
  def _SetScrollLeft(ScrollLeft: Double): Unit = js.native
  def _SetScrollTop(ScrollTop: Double): Unit = js.native
  def _SetScrollWidth(ScrollWidth: Double): Unit = js.native
}

