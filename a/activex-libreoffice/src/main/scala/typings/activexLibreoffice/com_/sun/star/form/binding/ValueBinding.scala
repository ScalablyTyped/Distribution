package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a component which allows access to a single value
  *
  * Read/Write access to the value represented by this component is supported, as well as (optionally) active broadcasting of value changes
  */
@js.native
trait ValueBinding
  extends XPropertySet
     with XValueBinding
     with XModifyBroadcaster
     with XComponent {
  
  /**
    * determines whether the value is currently readonly
    *
    * For instance, you could imagine a {@link ValueBinding} which represents a cell in a spreadsheet document, and whose value is readonly as long as the
    * spreadsheet is locked.
    *
    * As long as this property is `TRUE` , the value binding should throw a {@link InvalidBindingStateException} when its {@link XValueBinding.setValue()}
    * method is invoked.
    */
  var ReadOnly: Boolean = js.native
  
  /**
    * determines the relevance of the value represented by the binding
    *
    * In a more complex scenario, where different form controls are bound to different values, which all are part of a larger data structure, some of the
    * items in this data structure may not be relevant currently. This is indicated by the {@link Relevant} property being `FALSE` .
    *
    * XBindableValues which are bound to this binding may or may not react in certain ways on the (ir)relevance of their bound value.
    *
    * One possible reaction could be that user interface elements which are associated with the {@link XBindableValue} are disabled as long as {@link
    * Relevant} is `FALSE` .
    */
  var Relevant: Boolean = js.native
}
object ValueBinding {
  
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    Relevant: Boolean,
    SupportedValueTypes: SafeArray[`type`],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSupportedValueTypes: () => SafeArray[`type`],
    getValue: `type` => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setValue: js.Any => Unit,
    supportsType: `type` => Boolean
  ): ValueBinding = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Relevant = Relevant.asInstanceOf[js.Any], SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
    __obj.asInstanceOf[ValueBinding]
  }
  
  @scala.inline
  implicit class ValueBindingOps[Self <: ValueBinding] (val x: Self) extends AnyVal {
    
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
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevant(value: Boolean): Self = this.set("Relevant", value.asInstanceOf[js.Any])
  }
}
