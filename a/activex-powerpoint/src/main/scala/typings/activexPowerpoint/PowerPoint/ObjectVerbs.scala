package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectVerbs extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.ObjectVerbs_typekey")
  var PowerPointDotObjectVerbs_typekey: ObjectVerbs
  def Item(Index: Double): String
}

object ObjectVerbs {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => String,
    Parent: js.Any,
    PowerPointDotObjectVerbs_typekey: ObjectVerbs
  ): ObjectVerbs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ObjectVerbs_typekey")(PowerPointDotObjectVerbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectVerbs]
  }
}

