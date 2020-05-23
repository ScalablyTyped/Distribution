package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScheme extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.ColorScheme_typekey")
  var PowerPointDotColorScheme_typekey: ColorScheme
  def Colors(SchemeColor: PpColorSchemeIndex): RGBColor
  def Delete(): Unit
}

object ColorScheme {
  @scala.inline
  def apply(
    Application: Application,
    Colors: PpColorSchemeIndex => RGBColor,
    Count: Double,
    Delete: () => Unit,
    Parent: js.Any,
    PowerPointDotColorScheme_typekey: ColorScheme
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Colors = js.Any.fromFunction1(Colors), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorScheme_typekey")(PowerPointDotColorScheme_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
}

