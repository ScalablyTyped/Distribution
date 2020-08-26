package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the "addProperty" command.
  * @see XCommandProcessor
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
@js.native
trait PropertyCommandArgument extends js.Object {
  /** The default value of the property. */
  var DefaultValue: js.Any = js.native
  /** The property that the command has to add. */
  var Property: typings.activexLibreoffice.com_.sun.star.beans.Property = js.native
}

object PropertyCommandArgument {
  @scala.inline
  def apply(DefaultValue: js.Any, Property: Property): PropertyCommandArgument = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyCommandArgument]
  }
  @scala.inline
  implicit class PropertyCommandArgumentOps[Self <: PropertyCommandArgument] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: Property): Self = this.set("Property", value.asInstanceOf[js.Any])
  }
  
}

