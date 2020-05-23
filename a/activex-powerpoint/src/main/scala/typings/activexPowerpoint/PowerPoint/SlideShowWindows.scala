package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideShowWindows extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.SlideShowWindows_typekey")
  var PowerPointDotSlideShowWindows_typekey: SlideShowWindows
  def Item(Index: Double): SlideShowWindow
}

object SlideShowWindows {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => SlideShowWindow,
    Parent: js.Any,
    PowerPointDotSlideShowWindows_typekey: SlideShowWindows
  ): SlideShowWindows = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindows_typekey")(PowerPointDotSlideShowWindows_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindows]
  }
}

