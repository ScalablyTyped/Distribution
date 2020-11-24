package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideShowSettings extends js.Object {
  
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var EndingSlide: Double = js.native
  
  var LoopUntilStopped: MsoTriState = js.native
  
  val NamedSlideShows: typings.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  
  val Parent: js.Any = js.native
  
  val PointerColor: ColorFormat = js.native
  
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: SlideShowSettings = js.native
  
  var RangeType: PpSlideShowRangeType = js.native
  
  def Run(): SlideShowWindow = js.native
  
  var ShowMediaControls: MsoTriState = js.native
  
  var ShowPresenterView: MsoTriState = js.native
  
  var ShowScrollbar: MsoTriState = js.native
  
  var ShowType: PpSlideShowType = js.native
  
  var ShowWithAnimation: MsoTriState = js.native
  
  var ShowWithNarration: MsoTriState = js.native
  
  var SlideShowName: String = js.native
  
  var StartingSlide: Double = js.native
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
  
  @scala.inline
  implicit class SlideShowSettingsOps[Self <: SlideShowSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvanceMode(value: PpSlideShowAdvanceMode): Self = this.set("AdvanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingSlide(value: Double): Self = this.set("EndingSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUntilStopped(value: MsoTriState): Self = this.set("LoopUntilStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedSlideShows(value: NamedSlideShows): Self = this.set("NamedSlideShows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerColor(value: ColorFormat): Self = this.set("PointerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSlideShowSettings_typekey(value: SlideShowSettings): Self = this.set("PowerPoint.SlideShowSettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeType(value: PpSlideShowRangeType): Self = this.set("RangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => SlideShowWindow): Self = this.set("Run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowMediaControls(value: MsoTriState): Self = this.set("ShowMediaControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPresenterView(value: MsoTriState): Self = this.set("ShowPresenterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowScrollbar(value: MsoTriState): Self = this.set("ShowScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowType(value: PpSlideShowType): Self = this.set("ShowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWithAnimation(value: MsoTriState): Self = this.set("ShowWithAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWithNarration(value: MsoTriState): Self = this.set("ShowWithNarration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = this.set("SlideShowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingSlide(value: Double): Self = this.set("StartingSlide", value.asInstanceOf[js.Any])
  }
}
