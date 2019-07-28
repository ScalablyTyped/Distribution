package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.DatabaseDateField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a date input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
  * arbitrary external values.
  *
  * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's content with the binding as {@link
  * com.sun.star.util.Date} .
  * @see com.sun.star.form.binding.XValueBinding.supportsType
  * @see com.sun.star.awt.UnoControlDateFieldModel.Date
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDatabaseDateField extends DatabaseDateField

