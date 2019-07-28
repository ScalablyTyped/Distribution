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
  * Specifies the service of a set expression field master.
  * @see com.sun.star.text.TextFieldMaster
  */
trait SetExpression extends TextFieldMaster {
  /** determines the number of the chapter. This values is used if the field master is set as number sequence. */
  var ChapterNumberingLevel: Double
  /** determines the numbering separator string if the field master is set as number sequence. */
  var NumberingSeparator: String
  /** determines the type of the field as {@link com.sun.star.text.SetVariableType} */
  var SubType: Double
}

object SetExpression {
  @scala.inline
  def apply(
    ChapterNumberingLevel: Double,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    Name: String,
    NumberingSeparator: String,
    PropertySetInfo: XPropertySetInfo,
    SubType: Double,
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
  ): SetExpression = {
    val __obj = js.Dynamic.literal(ChapterNumberingLevel = ChapterNumberingLevel, DependentTextFields = DependentTextFields, InstanceName = InstanceName, Name = Name, NumberingSeparator = NumberingSeparator, PropertySetInfo = PropertySetInfo, SubType = SubType, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SetExpression]
  }
}

