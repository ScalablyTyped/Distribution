package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sort extends js.Object {
  /**
    * The sort key of a sort object.
    */
  var Key: SortKey = js.native
  /**
    * The sort value of a sort object.
    */
  var Value: SortValue = js.native
}

object Sort {
  @scala.inline
  def apply(Key: SortKey, Value: SortValue): Sort = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  @scala.inline
  implicit class SortOps[Self <: Sort] (val x: Self) extends AnyVal {
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
    def setKey(value: SortKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: SortValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

