package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adjustments extends js.Object {
  val Application: js.Any
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("PowerPoint.Adjustments_typekey")
  var PowerPointDotAdjustments_typekey: Adjustments
  def Item(Index: Double): Double
}

object Adjustments {
  @scala.inline
  def apply(
    Application: js.Any,
    Count: Double,
    Creator: Double,
    Item: Double => Double,
    Parent: js.Any,
    PowerPointDotAdjustments_typekey: Adjustments
  ): Adjustments = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Adjustments_typekey")(PowerPointDotAdjustments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustments]
  }
}

