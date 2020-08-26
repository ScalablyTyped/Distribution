package typings.algoliasearchHelper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectID extends js.Object {
  val objectID: String = js.native
}

object ObjectID {
  @scala.inline
  def apply(objectID: String): ObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectID]
  }
  @scala.inline
  implicit class ObjectIDOps[Self <: ObjectID] (val x: Self) extends AnyVal {
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
    def setObjectID(value: String): Self = this.set("objectID", value.asInstanceOf[js.Any])
  }
  
}

