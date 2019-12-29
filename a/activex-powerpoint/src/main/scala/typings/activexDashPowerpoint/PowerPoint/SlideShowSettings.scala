package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowSettings")
@js.native
class SlideShowSettings protected () extends js.Object {
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  var EndingSlide: Double = js.native
  var LoopUntilStopped: MsoTriState = js.native
  val NamedSlideShows: typings.activexDashPowerpoint.PowerPoint.NamedSlideShows = js.native
  val Parent: js.Any = js.native
  val PointerColor: ColorFormat = js.native
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: SlideShowSettings = js.native
  var RangeType: PpSlideShowRangeType = js.native
  var ShowMediaControls: MsoTriState = js.native
  var ShowPresenterView: MsoTriState = js.native
  var ShowScrollbar: MsoTriState = js.native
  var ShowType: PpSlideShowType = js.native
  var ShowWithAnimation: MsoTriState = js.native
  var ShowWithNarration: MsoTriState = js.native
  var SlideShowName: String = js.native
  var StartingSlide: Double = js.native
  def Run(): SlideShowWindow = js.native
}

