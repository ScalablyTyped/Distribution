package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.fieldmasterNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextFieldMaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the service of a user field master.
  * @see com.sun.star.text.TextFieldMaster
  */
trait User extends TextFieldMaster {
  /** contains the content. */
  var Content: String
  /** determines whether the field contains an expression. */
  var IsExpression: Boolean
  /** contains the value. */
  var Value: Double
}

object User {
  @scala.inline
  def apply(
    Content: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    IsExpression: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Value: Double,
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
  ): User = {
    val __obj = js.Dynamic.literal(Content = Content, DependentTextFields = DependentTextFields, InstanceName = InstanceName, IsExpression = IsExpression, Name = Name, PropertySetInfo = PropertySetInfo, Value = Value, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[User]
  }
}

