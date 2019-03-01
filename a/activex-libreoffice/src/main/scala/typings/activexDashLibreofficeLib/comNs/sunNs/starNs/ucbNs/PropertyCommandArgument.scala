package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the "addProperty" command.
  * @see XCommandProcessor
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
trait PropertyCommandArgument extends js.Object {
  /** The default value of the property. */
  var DefaultValue: js.Any
  /** The property that the command has to add. */
  var Property: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property
}

object PropertyCommandArgument {
  @scala.inline
  def apply(DefaultValue: js.Any, Property: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property): PropertyCommandArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultValue")(DefaultValue)
    __obj.updateDynamic("Property")(Property)
    __obj.asInstanceOf[PropertyCommandArgument]
  }
}

