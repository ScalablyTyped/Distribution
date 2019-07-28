package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.DatabaseListBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a list box model which is data-aware and thus can be bound to a database field, and additionally supports binding to arbitrary
  * external values.
  *
  * There are six possible ways that a {@link BindableDatabaseListBox} exchanges values with an external binding. If a new binding is set at a {@link
  * BindableDatabaseListBox} , the types from the following list are tried in descending order: The first type supported by the binding is used for data
  * exchange.  1. **sequences of anys** : The elements in the sequence will represent the values the selected entries of the list box (taken from
  * ValueList or read from BoundColumn). In other words, the SelectedValues property. 2. **any value** : The value will represent the value of the
  * selected entry (taken from ValueList or read from BoundColumn). If more than one entry is selected, `NULL` will be transferred. In other words, the
  * SelectedValue property. 3. **sequences of long integers** : When used, the integers in the sequence will represent the indexes of the selected entries
  * of the list box. 4. **long integer value** : When used, the value will represent the index of the selected entry. If no entry is selected, -1 will be
  * transferred. If more than one entry is selected, `NULL` will be transferred. 5. **sequences of strings** : When used, the strings in the sequence
  * present the texts of the selected entries of the list box. 6. **string values** : When used. the value will represent the text of the selected entry.
  * If no entry is selected, an empty string will be transferred. If more than one entry is selected, `NULL` will be transferred.
  * @see com.sun.star.form.binding.XValueBinding.supportsType
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.bindingNs.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDatabaseListBox extends DatabaseListBox

