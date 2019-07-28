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
  * specifies service of a {@link DDE} field master.
  * @see com.sun.star.text.TextField
  */
trait DDE extends TextFieldMaster {
  /** contains the content. */
  var Content: String
  /** contains the element string of the {@link DDE} command. */
  var DDECommandElement: String
  /** contains the file string of the {@link DDE} command. */
  var DDECommandFile: String
  /** contains the type string of the {@link DDE} command. */
  var DDECommandType: String
  /** determines whether {@link DDE} link is updated automatically. */
  var IsAutomaticUpdate: Boolean
}

object DDE {
  @scala.inline
  def apply(
    Content: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    IsAutomaticUpdate: Boolean,
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
  ): DDE = {
    val __obj = js.Dynamic.literal(Content = Content, DDECommandElement = DDECommandElement, DDECommandFile = DDECommandFile, DDECommandType = DDECommandType, DependentTextFields = DependentTextFields, InstanceName = InstanceName, IsAutomaticUpdate = IsAutomaticUpdate, Name = Name, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DDE]
  }
}

