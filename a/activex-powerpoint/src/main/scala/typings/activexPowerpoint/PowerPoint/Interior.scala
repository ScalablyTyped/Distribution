package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interior extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var InvertIfNegative: js.Any
  val Parent: js.Any
  var Pattern: js.Any
  var PatternColor: js.Any
  var PatternColorIndex: js.Any
  @JSName("PowerPoint.Interior_typekey")
  var PowerPointDotInterior_typekey: Interior
}

object Interior {
  @scala.inline
  def apply(
    Application: Application,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any,
    PowerPointDotInterior_typekey: Interior
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Interior_typekey")(PowerPointDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
}

