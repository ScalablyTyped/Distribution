package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a pair of two strings. */
@js.native
trait StringPair extends js.Object {
  /** specifies the first of the two strings. */
  var First: String = js.native
  /** specifies the second of the two strings. */
  var Second: String = js.native
}

object StringPair {
  @scala.inline
  def apply(First: String, Second: String): StringPair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringPair]
  }
  @scala.inline
  implicit class StringPairOps[Self <: StringPair] (val x: Self) extends AnyVal {
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
    def setFirst(value: String): Self = this.set("First", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: String): Self = this.set("Second", value.asInstanceOf[js.Any])
  }
  
}

