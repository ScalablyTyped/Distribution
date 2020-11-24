package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the UNO representation of the Automation type `DATE` .
  *
  * A `DATE` could actually be representd as `double` in UNO and therefore a typedef from `double` to a date type would do. But a typedef cannot be
  * expressed in all language bindings. In the case where no typedefs are supported the actual type is used. That is, a typedef'd date type would be
  * represented as `double` in Java. The information that the `double` is a date type is lost.
  *
  * When calling Automation objects from UNO the distinction between `double` and date type is important. Therefore {@link Date} is declared as struct.
  * @since OOo 1.1.2
  */
@js.native
trait Date extends js.Object {
  
  /** corresponds to the Automation type `DATE` . */
  var Value: Double = js.native
}
object Date {
  
  @scala.inline
  def apply(Value: Double): Date = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    
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
