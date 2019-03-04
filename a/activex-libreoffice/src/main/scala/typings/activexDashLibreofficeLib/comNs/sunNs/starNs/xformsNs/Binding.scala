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
    AllListEntries: activexDashInteropLib.SafeArray[java.lang.String],
    BindingNamespaces: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    ListEntryCount: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    Relevant: scala.Boolean,
    SupportedValueTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addListEntryListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener, 
      scala.Unit
    ],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addValidityConstraintListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidityConstraintListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    explainInvalid: js.Function1[js.Any, java.lang.String],
    getAllListEntries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getListEntry: js.Function1[scala.Double, java.lang.String],
    getListEntryCount: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSupportedValueTypes: js.Function0[activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]],
    getValue: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    isValid: js.Function1[js.Any, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeListEntryListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.XListEntryListener, 
      scala.Unit
    ],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeValidityConstraintListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs.XValidityConstraintListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setValue: js.Function1[js.Any, scala.Unit],
    supportsType: js.Function1[activexDashLibreofficeLib.`type`, scala.Boolean]
  ): Binding = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries, BindingNamespaces = BindingNamespaces, ListEntryCount = ListEntryCount, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, Relevant = Relevant, SupportedValueTypes = SupportedValueTypes, acquire = acquire, addEventListener = addEventListener, addListEntryListener = addListEntryListener, addModifyListener = addModifyListener, addPropertyChangeListener = addPropertyChangeListener, addValidityConstraintListener = addValidityConstraintListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, explainInvalid = explainInvalid, getAllListEntries = getAllListEntries, getListEntry = getListEntry, getListEntryCount = getListEntryCount, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSupportedValueTypes = getSupportedValueTypes, getValue = getValue, isValid = isValid, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeListEntryListener = removeListEntryListener, removeModifyListener = removeModifyListener, removePropertyChangeListener = removePropertyChangeListener, removeValidityConstraintListener = removeValidityConstraintListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setValue = setValue, supportsType = supportsType)
  
    __obj.asInstanceOf[Binding]
  }
}

