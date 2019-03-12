package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent a binding to one or more nodes in the DOM tree of an {@link XModel} . */
trait Binding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ValueBinding
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.ListEntrySource
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidator {
  /**
    * among other properties, there is this one
    *
    * It is unclear to me whether this is an implementation detail or a supported interface.
    *
    * The value supports the service {@link com.sun.star.xml.NamespaceContainer}
    * @see com.sun.star.xml.NamespaceContainer
    */
  var BindingNamespaces: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object Binding {
  @scala.inline
  def apply(
    AllListEntries: stdLib.SafeArray[java.lang.String],
    BindingNamespaces: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    ListEntryCount: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    Relevant: scala.Boolean,
    SupportedValueTypes: stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addListEntryListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addValidityConstraintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidityConstraintListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    dispose: () => scala.Unit,
    explainInvalid: js.Any => java.lang.String,
    getAllListEntries: () => stdLib.SafeArray[java.lang.String],
    getListEntry: scala.Double => java.lang.String,
    getListEntryCount: () => scala.Double,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSupportedValueTypes: () => stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    getValue: activexDashLibreofficeLib.`type` => js.Any,
    isValid: js.Any => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeListEntryListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeValidityConstraintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidityConstraintListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setValue: js.Any => scala.Unit,
    supportsType: activexDashLibreofficeLib.`type` => scala.Boolean
  ): Binding = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, BindingNamespaces = BindingNamespaces, ListEntryCount = ListEntryCount, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, Relevant = Relevant, SupportedValueTypes = SupportedValueTypes, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addValidityConstraintListener = js.Any.fromFunction1(addValidityConstraintListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), explainInvalid = js.Any.fromFunction1(explainInvalid), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeValidityConstraintListener = js.Any.fromFunction1(removeValidityConstraintListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
  
    __obj.asInstanceOf[Binding]
  }
}

