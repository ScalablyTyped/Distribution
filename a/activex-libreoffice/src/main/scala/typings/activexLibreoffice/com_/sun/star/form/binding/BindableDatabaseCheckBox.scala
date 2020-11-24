package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.component.DatabaseCheckBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service specifies a check box which is data-aware and thus can be bound to a database field, and additionally supports binding to arbitrary
  * external values.
  *
  * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseCheckBox} must support exchanging
  * boolean values. The following mapping between external values and control states apply: `TRUE` will be mapped to the box being checked, and vice
  * versa`FALSE` will be mapped to it being unchecked, and vice versa`NULL` will be mapped to it being in undetermined state, if the box currently
  * supports this, or being unchecked else. The undetermined of the check box will always be mapped to `NULL` when writing the external value.
  *
  * If the value binding associated with a {@link BindableDatabaseCheckBox} supports exchanging string values, **and** the {@link
  * com.sun.star.form.component.CheckBox.RefValue} is **not** empty, then the radio button will exchange its value as string: A string equal to the
  * reference value will be mapped to the button being checked, and vice versaA string not equal to the reference value will be mapped to the button being
  * unchecked, and vice versa`NULL` will be mapped to it being in undetermined state
  * @see com.sun.star.form.binding.XValueBinding.supportsType
  * @see com.sun.star.awt.UnoControlCheckBoxModel.State
  * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
  * @see com.sun.star.form.component.CheckBox.RefValue
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
- typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDatabaseCheckBox
  extends DatabaseCheckBox
     with XBindableValue {
  
  /**
    * specifies a value which is to be associated with the control when it's **not** checked.
    *
    * {@link com.sun.star.form.component.CheckBox.RefValue} is transferred to possible external value bindings as soon as the check box is checked. With the
    * member {@link SecondaryRefValue} , clients of the check box can also associate a value with the **not checked** state of the control.
    */
  var SecondaryRefValue: String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
