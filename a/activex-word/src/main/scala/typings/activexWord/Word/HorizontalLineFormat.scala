package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalLineFormat extends js.Object {
  var Alignment: WdHorizontalLineAlignment
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var NoShade: Boolean
  val Parent: js.Any
  var PercentWidth: Double
  var WidthType: WdHorizontalLineWidthType
  @JSName("Word.HorizontalLineFormat_typekey")
  var WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
}

object HorizontalLineFormat {
  @scala.inline
  def apply(
    Alignment: WdHorizontalLineAlignment,
    Application: Application,
    Creator: Double,
    NoShade: Boolean,
    Parent: js.Any,
    PercentWidth: Double,
    WidthType: WdHorizontalLineWidthType,
    WordDotHorizontalLineFormat_typekey: HorizontalLineFormat
  ): HorizontalLineFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], NoShade = NoShade.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PercentWidth = PercentWidth.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HorizontalLineFormat_typekey")(WordDotHorizontalLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineFormat]
  }
}

