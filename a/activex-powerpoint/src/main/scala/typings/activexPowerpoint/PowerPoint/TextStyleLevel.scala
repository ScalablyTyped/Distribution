package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleLevel extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Font: typings.activexPowerpoint.PowerPoint.Font
  val ParagraphFormat: typings.activexPowerpoint.PowerPoint.ParagraphFormat
  val Parent: js.Any
  @JSName("PowerPoint.TextStyleLevel_typekey")
  var PowerPointDotTextStyleLevel_typekey: TextStyleLevel
}

object TextStyleLevel {
  @scala.inline
  def apply(
    Application: Application,
    Font: Font,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    PowerPointDotTextStyleLevel_typekey: TextStyleLevel
  ): TextStyleLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevel_typekey")(PowerPointDotTextStyleLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevel]
  }
}

