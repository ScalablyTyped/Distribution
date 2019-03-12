package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowView")
@js.native
class SlideShowView protected () extends js.Object {
  var AcceleratorsEnabled: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val AdvanceMode: PpSlideShowAdvanceMode = js.native
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val CurrentShowPosition: scala.Double = js.native
  val IsNamedShow: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val LastSlideViewed: Slide = js.native
  val MediaControlsHeight: scala.Double = js.native
  val MediaControlsLeft: scala.Double = js.native
  val MediaControlsTop: scala.Double = js.native
  val MediaControlsVisible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val MediaControlsWidth: scala.Double = js.native
  val Parent: js.Any = js.native
  val PointerColor: ColorFormat = js.native
  var PointerType: PpSlideShowPointerType = js.native
  var `PowerPoint.SlideShowView_typekey`: SlideShowView = js.native
  val PresentationElapsedTime: scala.Double = js.native
  val Slide: activexDashPowerpointLib.PowerPointNs.Slide = js.native
  var SlideElapsedTime: scala.Double = js.native
  val SlideShowName: java.lang.String = js.native
  var State: PpSlideShowState = js.native
  val Zoom: scala.Double = js.native
  def DrawLine(BeginX: scala.Double, BeginY: scala.Double, EndX: scala.Double, EndY: scala.Double): scala.Unit = js.native
  def EndNamedShow(): scala.Unit = js.native
  def EraseDrawing(): scala.Unit = js.native
  def Exit(): scala.Unit = js.native
  def First(): scala.Unit = js.native
  def FirstAnimationIsAutomatic(): scala.Boolean = js.native
  def GetClickCount(): scala.Double = js.native
  def GetClickIndex(): scala.Double = js.native
  def GotoClick(Index: scala.Double): scala.Unit = js.native
  def GotoNamedShow(SlideShowName: java.lang.String): scala.Unit = js.native
  /** @param Office.MsoTriState [ResetSlide=-1] */
  def GotoSlide(Index: scala.Double): scala.Unit = js.native
  def GotoSlide(Index: scala.Double, ResetSlide: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def InstallTracker(pTracker: MouseTracker, Presenter: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def Last(): scala.Unit = js.native
  def Next(): scala.Unit = js.native
  def Player(ShapeId: js.Any): activexDashPowerpointLib.PowerPointNs.Player = js.native
  def Previous(): scala.Unit = js.native
  def ResetSlideTime(): scala.Unit = js.native
}

