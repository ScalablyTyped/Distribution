package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a text field which is data-aware, and can be bound to a database field. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl, setPropertyValues, setPropertyValues */ @js.native
trait DatabaseTextField extends TextField {
  /**
    * references to the cursor field to which the control is bound.
    *
    * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
    * com.sun.star.sdb.Column} service.
    * @see DataAwareControlModel.DataField
    */
  var BoundField: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = js.native
  /**
    * determines if an empty text should be treated as a `NULL` value.
    *
    * When the user enters text into a text field, and after this, the control content is to be committed into the database field the control is bound to, a
    * decision must be made how to deal with empty strings. ;  This is controlled by this property.
    *
    * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
    */
  var ConvertEmptyToNull: scala.Boolean = js.native
  /**
    * specifies the name of the bound database field.
    *
    * This property makes sense in the **context** of the control model only. Normally, a control model is a child of a {@link
    * com.sun.star.form.component.DataForm} , which is bound to a higher level object such as a table or query - more general, a result set. ;  This member
    * here describes the column of this result set which the control should act for.
    *
    * Not every control model can be bound to every database column. Usually, super services of the {@link DataAwareControlModel} restrict the column types
    * they can be used with.
    * @see DataAwareControlModel.BoundField
    */
  var DataField: java.lang.String = js.native
  /**
    * determines whether or not input into this field is required, when it is actually bound to a database field.
    *
    * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
    * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
    * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
    * @since OOo 3.1
    */
  var InputRequired: scala.Boolean = js.native
  /**
    * references to a control model within the same document which should be used as a label.
    *
    * Any user interface action which needs to refer to the control is assumed to use this property. ;  A very common design method for forms is to group a
    * data aware control with a label control, with the latter describing the content of the former. For instance, you may have a {@link
    * com.sun.star.form.component.TextField} , which is bound to the e-mail column of your data source. Then you will probably add a {@link
    * com.sun.star.form.component.FixedText} whose label is "E-Mail", and associate it with the TextField by setting it as {@link LabelControl} . ;  Now if
    * you imagine a component offering data search in a form, this component will examine the {@link LabelControl} property, find the {@link
    * com.sun.star.form.component.FixedText} , examine it's label, and use this label to refer to the {@link com.sun.star.form.component.TextField} .
    *
    * When setting the property, a number of constraints apply: The object which is to be set has to support the following interfaces {@link
    * com.sun.star.awt.XControlModel}{@link com.sun.star.lang.XServiceInfo}{@link com.sun.star.beans.XPropertySet}{@link com.sun.star.container.XChild}It
    * has to be a part of the same document as the model who's property is to be modified.Additionally, the support of a special service, indicating that
    * the model is of the right type, is required. Which kind of service is in the request depends on the type of the control model. ;
    *
    * For instance, text fields ( {@link com.sun.star.form.component.TextField} ) can be labeled by label controls only ( {@link
    * com.sun.star.form.component.FixedText} ), and radio buttons ( {@link com.sun.star.form.component.RadioButton} ) can be labeled by group boxes ( {@link
    * com.sun.star.form.component.GroupBox} ) only.
    */
  var LabelControl: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = js.native
}

