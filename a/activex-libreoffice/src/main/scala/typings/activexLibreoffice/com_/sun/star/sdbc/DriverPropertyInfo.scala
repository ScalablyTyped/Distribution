package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the driver properties for making a connection.
  *
  * The {@link DriverPropertyInfo} is of interest only to advanced programmers who need to interact with a driver to discover and supply properties for
  * connections.
  */
trait DriverPropertyInfo extends StObject {
  
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
    val __obj = js.Dynamic.literal(Choices = Choices.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsRequired = IsRequired.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverPropertyInfo]
  }
  
  @scala.inline
  implicit class DriverPropertyInfoMutableBuilder[Self <: DriverPropertyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoices(value: SafeArray[String]): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
