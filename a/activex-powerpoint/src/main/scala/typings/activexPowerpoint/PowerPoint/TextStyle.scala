package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Levels: TextStyleLevels
  val Parent: js.Any
  @JSName("PowerPoint.TextStyle_typekey")
  var PowerPointDotTextStyle_typekey: TextStyle
  val Ruler: typings.activexPowerpoint.PowerPoint.Ruler
  val TextFrame: typings.activexPowerpoint.PowerPoint.TextFrame
}

object TextStyle {
  @scala.inline
  def apply(
    Application: Application,
    Levels: TextStyleLevels,
    Parent: js.Any,
    PowerPointDotTextStyle_typekey: TextStyle,
    Ruler: Ruler,
    TextFrame: TextFrame
  ): TextStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyle_typekey")(PowerPointDotTextStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

