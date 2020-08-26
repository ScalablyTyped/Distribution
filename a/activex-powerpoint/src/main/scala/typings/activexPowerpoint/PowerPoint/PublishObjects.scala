package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishObjects extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PublishObjects_typekey")
  var PowerPointDotPublishObjects_typekey: PublishObjects = js.native
  def Item(Index: Double): PublishObject = js.native
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
  @scala.inline
  implicit class PublishObjectsOps[Self <: PublishObjects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => PublishObject): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotPublishObjects_typekey(value: PublishObjects): Self = this.set("PowerPoint.PublishObjects_typekey", value.asInstanceOf[js.Any])
  }
  
}

