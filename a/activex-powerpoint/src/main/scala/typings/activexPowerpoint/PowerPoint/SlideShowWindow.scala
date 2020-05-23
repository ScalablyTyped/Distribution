package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideShowWindow extends js.Object {
  val Active: MsoTriState
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Height: Double
  val IsFullScreen: MsoTriState
  var Left: Double
  val Parent: js.Any
  @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: SlideShowWindow
  val Presentation: typings.activexPowerpoint.PowerPoint.Presentation
  var Top: Double
  val View: SlideShowView
  var Width: Double
  def Activate(): Unit
}

object SlideShowWindow {
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Height: Double,
    IsFullScreen: MsoTriState,
    Left: Double,
    Parent: js.Any,
    PowerPointDotSlideShowWindow_typekey: SlideShowWindow,
    Presentation: Presentation,
    Top: Double,
    View: SlideShowView,
    Width: Double
  ): SlideShowWindow = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Presentation = Presentation.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindow_typekey")(PowerPointDotSlideShowWindow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindow]
  }
}

