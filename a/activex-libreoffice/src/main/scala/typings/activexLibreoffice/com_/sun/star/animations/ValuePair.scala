package typings.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuePair extends js.Object {
  var First: js.Any = js.native
  var Second: js.Any = js.native
}

object ValuePair {
  @scala.inline
  def apply(First: js.Any, Second: js.Any): ValuePair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePair]
  }
  @scala.inline
  implicit class ValuePairOps[Self <: ValuePair] (val x: Self) extends AnyVal {
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
    def setFirst(value: js.Any): Self = this.set("First", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: js.Any): Self = this.set("Second", value.asInstanceOf[js.Any])
  }
  
}

