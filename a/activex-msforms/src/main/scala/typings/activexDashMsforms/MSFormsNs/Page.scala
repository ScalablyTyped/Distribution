package typings.activexDashMsforms.MSFormsNs

import typings.activexDashStdole.stdoleNs.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSForms.Page")
@js.native
class Page protected () extends js.Object {
  var Accelerator: String = js.native
  val ActiveControl: Control = js.native
  val CanPaste: Boolean = js.native
  val CanRedo: Boolean = js.native
  val CanUndo: Boolean = js.native
  var Caption: String = js.native
  var ControlTipText: String = js.native
  @JSName("Controls")
  val Controls_Original: Controls = js.native
  var Cycle: fmCycle = js.native
  var DesignMode: fmMode = js.native
  var Enabled: Boolean = js.native
  var GridX: Double = js.native
  var GridY: Double = js.native
  var Index: Double = js.native
  val InsideHeight: Double = js.native
  val InsideWidth: Double = js.native
  var KeepScrollBarsVisible: fmScrollBars = js.native
  var `MSForms.Page_typekey`: Page = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
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
  var Tag: String = js.native
  var TransitionEffect: fmTransitionEffect = js.native
  var TransitionPeriod: Double = js.native
  var VerticalScrollBarSide: fmVerticalScrollBarSide = js.native
  var Visible: Boolean = js.native
  var Zoom: Double = js.native
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

