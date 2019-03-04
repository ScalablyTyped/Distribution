package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Date extends js.Object {
  /** corresponds to the Automation type `DATE` . */
  var Value: scala.Double
}

object Date {
  @scala.inline
  def apply(Value: scala.Double): Date = {
    val __obj = js.Dynamic.literal(Value = Value)
  
    __obj.asInstanceOf[Date]
  }
}

