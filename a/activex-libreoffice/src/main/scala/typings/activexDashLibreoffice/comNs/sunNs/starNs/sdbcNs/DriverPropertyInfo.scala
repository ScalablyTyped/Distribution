package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the driver properties for making a connection.
  *
  * The {@link DriverPropertyInfo} is of interest only to advanced programmers who need to interact with a driver to discover and supply properties for
  * connections.
  */
trait DriverPropertyInfo extends js.Object {
  /**
    * contains a sequence of possible values if the value for the field `DriverPropertyInfo.value` may be selected from a particular set of values;
    * otherwise empty.
    */
  var Choices: SafeArray[String]
  /** is a brief description of the property, which may be null. */
  var Description: String
  /** is `TRUE` if a value must be supplied for this property during `Driver.connect` and `FALSE` otherwise. */
  var IsRequired: Boolean
  /** is the name of the property. */
  var Name: String
  /** specifies the current value of the property, based on the driver-supplied default values. This field may be empty if no value is known. */
  var Value: String
}

object DriverPropertyInfo {
  @scala.inline
  def apply(Choices: SafeArray[String], Description: String, IsRequired: Boolean, Name: String, Value: String): DriverPropertyInfo = {
    val __obj = js.Dynamic.literal(Choices = Choices, Description = Description, IsRequired = IsRequired, Name = Name, Value = Value)
  
    __obj.asInstanceOf[DriverPropertyInfo]
  }
}

