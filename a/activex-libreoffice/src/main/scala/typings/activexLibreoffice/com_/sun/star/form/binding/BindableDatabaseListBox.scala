package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.component.DatabaseListBox
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
trait BindableDatabaseListBox
  extends DatabaseListBox
     with XBindableValue {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

