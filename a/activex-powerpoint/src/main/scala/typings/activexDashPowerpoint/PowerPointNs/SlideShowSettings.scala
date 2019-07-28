package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowSettings")
@js.native
class SlideShowSettings protected () extends js.Object {
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  var EndingSlide: Double = js.native
  var LoopUntilStopped: MsoTriState = js.native
  val NamedSlideShows: typings.activexDashPowerpoint.PowerPointNs.NamedSlideShows = js.native
  val Parent: js.Any = js.native
  val PointerColor: ColorFormat = js.native
  var `PowerPoint.SlideShowSettings_typekey`: SlideShowSettings = js.native
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

