package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideShowSettings extends js.Object {
  var AdvanceMode: PpSlideShowAdvanceMode
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var EndingSlide: Double
  var LoopUntilStopped: MsoTriState
  val NamedSlideShows: typings.activexPowerpoint.PowerPoint.NamedSlideShows
  val Parent: js.Any
  val PointerColor: ColorFormat
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: SlideShowSettings
  var RangeType: PpSlideShowRangeType
  var ShowMediaControls: MsoTriState
  var ShowPresenterView: MsoTriState
  var ShowScrollbar: MsoTriState
  var ShowType: PpSlideShowType
  var ShowWithAnimation: MsoTriState
  var ShowWithNarration: MsoTriState
  var SlideShowName: String
  var StartingSlide: Double
  def Run(): SlideShowWindow
}

object SlideShowSettings {
  @scala.inline
  def apply(
    AdvanceMode: PpSlideShowAdvanceMode,
    Application: Application,
    EndingSlide: Double,
    LoopUntilStopped: MsoTriState,
    NamedSlideShows: NamedSlideShows,
    Parent: js.Any,
    PointerColor: ColorFormat,
    PowerPointDotSlideShowSettings_typekey: SlideShowSettings,
    RangeType: PpSlideShowRangeType,
    Run: () => SlideShowWindow,
    ShowMediaControls: MsoTriState,
    ShowPresenterView: MsoTriState,
    ShowScrollbar: MsoTriState,
    ShowType: PpSlideShowType,
    ShowWithAnimation: MsoTriState,
    ShowWithNarration: MsoTriState,
    SlideShowName: String,
    StartingSlide: Double
  ): SlideShowSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], EndingSlide = EndingSlide.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], NamedSlideShows = NamedSlideShows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PointerColor = PointerColor.asInstanceOf[js.Any], RangeType = RangeType.asInstanceOf[js.Any], Run = js.Any.fromFunction0(Run), ShowMediaControls = ShowMediaControls.asInstanceOf[js.Any], ShowPresenterView = ShowPresenterView.asInstanceOf[js.Any], ShowScrollbar = ShowScrollbar.asInstanceOf[js.Any], ShowType = ShowType.asInstanceOf[js.Any], ShowWithAnimation = ShowWithAnimation.asInstanceOf[js.Any], ShowWithNarration = ShowWithNarration.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], StartingSlide = StartingSlide.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowSettings_typekey")(PowerPointDotSlideShowSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowSettings]
  }
}

