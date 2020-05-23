package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholders extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Placeholders_typekey")
  var PowerPointDotPlaceholders_typekey: Placeholders
  def FindByName(Index: js.Any): Shape
  def Item(Index: Double): Shape
}

object Placeholders {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    FindByName: js.Any => Shape,
    Item: Double => Shape,
    Parent: js.Any,
    PowerPointDotPlaceholders_typekey: Placeholders
  ): Placeholders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], FindByName = js.Any.fromFunction1(FindByName), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Placeholders_typekey")(PowerPointDotPlaceholders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholders]
  }
}

