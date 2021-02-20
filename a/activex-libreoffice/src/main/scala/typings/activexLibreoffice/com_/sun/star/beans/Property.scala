package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes a property.
  *
  * There are three types of properties: bound propertiesconstrained propertiesfree properties
  */
@js.native
trait Property extends StObject {
  
  /** This field may contain zero or more constants of the {@link PropertyAttribute} constants group. */
  var Attributes: Double = js.native
  
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. You can use this handle to get values from the {@link XFastPropertySet} .
    */
  var Handle: Double = js.native
  
  /**
    * specifies the name of the property.
    *
    * The name is unique within an {@link XPropertySet} . Upper and lower case are distinguished.
    */
  var Name: String = js.native
  
  /**
    * contains an object that identifies the declared type for the property.
    *
    * If the property has multiple types or the type is not known, **but not an any** , then void must be returned.
    */
  var Type: `type` = js.native
}
object Property {
  
  @scala.inline
  def apply(Attributes: Double, Handle: Double, Name: String, Type: `type`): Property = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Double): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `type`): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
