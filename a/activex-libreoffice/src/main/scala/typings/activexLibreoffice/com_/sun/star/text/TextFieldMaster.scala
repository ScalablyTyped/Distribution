package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A {@link TextFieldMaster} specifies important data for its DependentTextFields. */
trait TextFieldMaster
  extends StObject
     with XPropertySet {
  
  /** contains a sequence of all fields that depend on this master. */
  var DependentTextFields: SafeArray[XDependentTextField]
  
  /** contains the instance name as it is used in the {@link com.sun.star.text.XTextFieldsSupplier} . */
  var InstanceName: String
  
  /**
    * determines the name of the field master. The name is void as long as the instance is not member of the document structure. When the value is being set
    * the instance is inserted into the document and the name cannot be changed afterwards. That does not apply to the Database text field master.
    */
  var Name: String
}
object TextFieldMaster {
  
  @scala.inline
  def apply(
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TextFieldMaster = {
    val __obj = js.Dynamic.literal(DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextFieldMaster]
  }
  
  @scala.inline
  implicit class TextFieldMasterMutableBuilder[Self <: TextFieldMaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependentTextFields(value: SafeArray[XDependentTextField]): Self = StObject.set(x, "DependentTextFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "InstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
