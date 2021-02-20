package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument for the "addProperty" command.
  * @see XCommandProcessor
  * @since Apache OpenOffice 4.0, LibreOffice 4.2
  */
@js.native
trait PropertyCommandArgument extends StObject {
  
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
  implicit class PropertyCommandArgumentMutableBuilder[Self <: PropertyCommandArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Property): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
  }
}
