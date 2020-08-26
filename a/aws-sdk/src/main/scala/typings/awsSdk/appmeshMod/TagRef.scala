package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRef extends js.Object {
  /**
    * One part of a key-value pair that make up a tag. A key is a general label
    that acts like a category for more specific tag values.
    */
  var key: TagKey = js.native
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a
    descriptor within a tag category (key).
    */
  var value: js.UndefOr[TagValue] = js.native
}

object TagRef {
  @scala.inline
  def apply(key: TagKey): TagRef = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRef]
  }
  @scala.inline
  implicit class TagRefOps[Self <: TagRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: TagKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TagValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

