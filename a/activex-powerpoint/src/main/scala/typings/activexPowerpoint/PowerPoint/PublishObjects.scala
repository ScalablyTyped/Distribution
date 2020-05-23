package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishObjects extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.PublishObjects_typekey")
  var PowerPointDotPublishObjects_typekey: PublishObjects
  def Item(Index: Double): PublishObject
}

object PublishObjects {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => PublishObject,
    Parent: js.Any,
    PowerPointDotPublishObjects_typekey: PublishObjects
  ): PublishObjects = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PublishObjects_typekey")(PowerPointDotPublishObjects_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishObjects]
  }
}

