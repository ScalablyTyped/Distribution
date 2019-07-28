package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
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
  var Property: typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
}

object PropertyCommandArgument {
  @scala.inline
  def apply(DefaultValue: js.Any, Property: Property): PropertyCommandArgument = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue, Property = Property)
  
    __obj.asInstanceOf[PropertyCommandArgument]
  }
}

