package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseObject extends js.Object {
  def toJSON(): js.Any = js.native
}

object IBaseObject {
  @scala.inline
  def apply(toJSON: () => js.Any): IBaseObject = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[IBaseObject]
  }
  @scala.inline
  implicit class IBaseObjectOps[Self <: IBaseObject] (val x: Self) extends AnyVal {
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

