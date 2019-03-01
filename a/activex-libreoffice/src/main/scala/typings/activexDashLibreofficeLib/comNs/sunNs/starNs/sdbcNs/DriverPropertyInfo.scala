package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

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
  var Choices: activexDashInteropLib.SafeArray[java.lang.String]
  /** is a brief description of the property, which may be null. */
  var Description: java.lang.String
  /** is `TRUE` if a value must be supplied for this property during `Driver.connect` and `FALSE` otherwise. */
  var IsRequired: scala.Boolean
  /** is the name of the property. */
  var Name: java.lang.String
  /** specifies the current value of the property, based on the driver-supplied default values. This field may be empty if no value is known. */
  var Value: java.lang.String
}

object DriverPropertyInfo {
  @scala.inline
  def apply(
    Choices: activexDashInteropLib.SafeArray[java.lang.String],
    Description: java.lang.String,
    IsRequired: scala.Boolean,
    Name: java.lang.String,
    Value: java.lang.String
  ): DriverPropertyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Choices")(Choices)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("IsRequired")(IsRequired)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DriverPropertyInfo]
  }
}

