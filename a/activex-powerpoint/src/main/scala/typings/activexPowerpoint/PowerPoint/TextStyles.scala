package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyles extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.TextStyles_typekey")
  var PowerPointDotTextStyles_typekey: TextStyles
  def Item(Type: PpTextStyleType): TextStyle
}

object TextStyles {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpTextStyleType => TextStyle,
    Parent: js.Any,
    PowerPointDotTextStyles_typekey: TextStyles
  ): TextStyles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyles_typekey")(PowerPointDotTextStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyles]
  }
}

