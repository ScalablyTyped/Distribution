package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleLevels extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.TextStyleLevels_typekey")
  var PowerPointDotTextStyleLevels_typekey: TextStyleLevels
  def Item(Level: Double): TextStyleLevel
}

object TextStyleLevels {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => TextStyleLevel,
    Parent: js.Any,
    PowerPointDotTextStyleLevels_typekey: TextStyleLevels
  ): TextStyleLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevels_typekey")(PowerPointDotTextStyleLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevels]
  }
}

