package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.DatabaseFormattedField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a formatted input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
  * arbitrary external values.
  *
  * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseFormattedField} must support
  * exchanging values of type **double** .
  * @see com.sun.star.form.binding.XValueBinding.supportsType
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDatabaseFormattedField extends DatabaseFormattedField

