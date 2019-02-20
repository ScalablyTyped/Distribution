package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined setPropertyValues, setPropertyValues */ @js.native
trait BindableDatabaseCheckBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs.DatabaseCheckBox {
  /**
    * specifies a value which is to be associated with the control when it's **not** checked.
    *
    * {@link com.sun.star.form.component.CheckBox.RefValue} is transferred to possible external value bindings as soon as the check box is checked. With the
    * member {@link SecondaryRefValue} , clients of the check box can also associate a value with the **not checked** state of the control.
    */
  var SecondaryRefValue: java.lang.String = js.native
}

