package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: Borders
  def Item(BorderType: PpBorderType): LineFormat
}

object Borders {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpBorderType => LineFormat,
    Parent: js.Any,
    PowerPointDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Borders_typekey")(PowerPointDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
}

