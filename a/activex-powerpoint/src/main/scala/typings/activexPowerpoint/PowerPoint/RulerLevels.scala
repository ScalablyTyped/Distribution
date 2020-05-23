package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerLevels extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.RulerLevels_typekey")
  var PowerPointDotRulerLevels_typekey: RulerLevels
  def Item(Index: Double): RulerLevel
}

object RulerLevels {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => RulerLevel,
    Parent: js.Any,
    PowerPointDotRulerLevels_typekey: RulerLevels
  ): RulerLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevels_typekey")(PowerPointDotRulerLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevels]
  }
}

