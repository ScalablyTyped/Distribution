package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a specialization of the {@link com.sun.star.form.DataAwareControlModel} which additionally supports binding to external value suppliers.
  *
  * Control models usually have some kind of value property, which reflects the very current content of the controls associated with this model. For
  * instance, for an {@link com.sun.star.form.component.TextField} , this would be the {@link com.sun.star.awt.UnoControlEditModel.Text} property of the
  * base service. Similarly, a {@link com.sun.star.form.component.CheckBox} has a property {@link com.sun.star.awt.UnoControlCheckBoxModel.State} , which
  * reflects the current check state.
  *
  * Usual com::sun::star::form::DataAwareControlModels can be bound to a column of a {@link com.sun.star.form.component.DataForm} , and exchange their
  * content with such a column. ;  In particular, when the {@link com.sun.star.form.component.DataForm} is moved to a different record, then the bound
  * control model is updated with the value of it's column in this particular row. ;  On the other hand, when any change in the control model (e.g.
  * resulting from a user entering data in a control associated with the control model) is committed ( {@link com.sun.star.form.XBoundComponent.commit()}
  * ), then the actual data of the control model is written into the associated {@link com.sun.star.form.component.DataForm} column.
  *
  * {@link BindableDataAwareControlModel} 's additionally support an alternative value binding, which forces them to exchange their value with another
  * foreign instance. In some sense, they are an abstraction of the data aware control models, which only support a specialized, hard-coded value binding
  * (namely the binding to a {@link com.sun.star.form.component.DataForm} column).
  *
  * For this, they provide the {@link XBindableValue} interface which allows to set an external component to exchange the value with.
  *
  * The following rules apply when a data aware control model is bound to an external value binding: **Priority**;  External value bindings overrule any
  * active SQL-column binding. If an external component is bound to a control model which currently has an active SQL binding, this SQL binding is
  * suspended, until the external binding is revoked.**Activation**;  An external value binding becomes effective as soon as it is set. This is a
  * difference to SQL bindings, which only are effective when the parent form of the control model is loaded ( {@link com.sun.star.form.XLoadable}
  * ).**Immediacy**;  When a {@link BindableDataAwareControlModel} is bound to an external value, then every change in the control model's value is
  * **immediately** reflected in the external binding. This is a difference to SQL bindings of most {@link com.sun.star.form.DataAwareControlModel} 's,
  * where changes in the control model's value are only propagated to the bound column upon explicit request via {@link
  * com.sun.star.form.XBoundComponent.commit()} . ;  Note that this restriction is inherited from the {@link BindableControlModel} .**Cloning**;
  * com::sun::star::form::FormControlModels support cloning themselves via the {@link com.sun.star.util.XCloneable} interface which they inherit from the
  * {@link com.sun.star.awt.UnoControlModel} service. ;  When a {@link BindableDataAwareControlModel} is cloned while it has an active external value
  * binding, then the clone is also bound to the same binding instance. ;  Note that this restriction is inherited from the {@link BindableControlModel} .
  *
  * When a {@link BindableDataAwareControlModel} is being bound to an external value, using {@link XBindableValue.setValueBinding()} , then the control
  * model (its value property, respectively) and the external value are initially synchronized by setting the external value ( {@link
  * XValueBinding.getValue()} ) at the control model.
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
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait BindableDataAwareControlModel
  extends DataAwareControlModel
     with XBindableValue {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

