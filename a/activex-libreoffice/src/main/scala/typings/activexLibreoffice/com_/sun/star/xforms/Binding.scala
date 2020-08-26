package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.form.binding.ValueBinding
import typings.activexLibreoffice.com_.sun.star.form.binding.XListEntryListener
import typings.activexLibreoffice.com_.sun.star.form.binding.XListEntrySource
import typings.activexLibreoffice.com_.sun.star.form.validation.XValidator
import typings.activexLibreoffice.com_.sun.star.form.validation.XValidityConstraintListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represent a binding to one or more nodes in the DOM tree of an {@link XModel} . */
@js.native
trait Binding
  extends ValueBinding
     with XListEntrySource
     with XValidator {
  /**
    * among other properties, there is this one
    *
    * It is unclear to me whether this is an implementation detail or a supported interface.
    *
    * The value supports the service {@link com.sun.star.xml.NamespaceContainer}
    * @see com.sun.star.xml.NamespaceContainer
    */
  var BindingNamespaces: XNameContainer = js.native
}

object Binding {
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    BindingNamespaces: XNameContainer,
    ListEntryCount: Double,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    Relevant: Boolean,
    SupportedValueTypes: SafeArray[`type`],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addListEntryListener: XListEntryListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addValidityConstraintListener: XValidityConstraintListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    explainInvalid: js.Any => String,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSupportedValueTypes: () => SafeArray[`type`],
    getValue: `type` => js.Any,
    isValid: js.Any => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeListEntryListener: XListEntryListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeValidityConstraintListener: XValidityConstraintListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setValue: js.Any => Unit,
    supportsType: `type` => Boolean
  ): Binding = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], BindingNamespaces = BindingNamespaces.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Relevant = Relevant.asInstanceOf[js.Any], SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addValidityConstraintListener = js.Any.fromFunction1(addValidityConstraintListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), explainInvalid = js.Any.fromFunction1(explainInvalid), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeValidityConstraintListener = js.Any.fromFunction1(removeValidityConstraintListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
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
    def setBindingNamespaces(value: XNameContainer): Self = this.set("BindingNamespaces", value.asInstanceOf[js.Any])
  }
  
}

