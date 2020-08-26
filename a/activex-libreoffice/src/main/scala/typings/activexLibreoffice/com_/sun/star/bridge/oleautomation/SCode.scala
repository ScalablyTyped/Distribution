package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type SCODE.
  *
  * A `SCODE` is used to express errors in Automation. In UNO it could be represented by a `long` and therefore a typedef from `long` to a particular
  * error type would do. But a typedef cannot be expressed in all language bindings. In the case where no typedefs are supported the actual type is used.
  * That is, a typedef'd error type would be represented as `int` in Java. The information that the `int` is an error type is lost.
  *
  * When calling Automation objects from UNO the distinction between error type and `long` is important. Therefore the Scode is declared as struct.
  * @since OOo 1.1.2
  */
@js.native
trait SCode extends js.Object {
  var Value: Double = js.native
}

object SCode {
  @scala.inline
  def apply(Value: Double): SCode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCode]
  }
  @scala.inline
  implicit class SCodeOps[Self <: SCode] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

