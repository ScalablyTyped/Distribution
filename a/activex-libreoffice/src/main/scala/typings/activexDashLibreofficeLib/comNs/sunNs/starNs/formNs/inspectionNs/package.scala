package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectionNs {
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which is able to enhance the {@link
    * com.sun.star.form.component.CommandButton.ButtonType} and {@link com.sun.star.form.component.CommandButton.TargetURL} properties of a {@link
    * com.sun.star.form.component.CommandButton} .
    *
    * For this, the two properties are superseded by new versions, where as button type, additional possible values are added for navigating the parent form
    * of the button. For instance, in an {@link com.sun.star.inspection.ObjectInspector} using this handler, the user will be able to choose a button type
    * saying "move to the next record", which, when chosen, well, moves the parent database form of the button to the next record.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.component.CommandButton
    */
  type ButtonNavigationHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which is able to provide properties to bind a form
    * component to a spreadsheet cell.
    *
    * The handler expects a value named "ContextDocument" in the context in which it is created. That is, the {@link com.sun.star.uno.XComponentContext}
    * used for creating the {@link CellBindingPropertyHandler} is examined for a value with this name. If the object in this value denotes a spreadsheet
    * document (indicated by supporting the {@link com.sun.star.sheet.XSpreadsheetDocument} interface), this document is used to create the
    * com::sun::star::form::binding::ValueBindings to bind the inspected object to cells in this document.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.binding.BindableControlModel
    * @see com.sun.star.form.binding.ValueBinding
    * @see com.sun.star.table.CellValueBinding
    * @see com.sun.star.table.ListPositionCellBinding
    * @see com.sun.star.uno.XComponentContext.getValueByName
    */
  type CellBindingPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which provides convenience wrappers for some properties
    * existing at a form component derived from {@link com.sun.star.awt.UnoControlEditModel} .
    *
    * First, the handler supersedes the HScroll and the VScroll properties of a {@link com.sun.star.awt.UnoControlEditModel} and puts them into one common
    * property, allowing the user to choose whether she want to have "no", a "vertical", a "horizontal", or "both" scrollbars.
    *
    * Second, if it detects a {@link com.sun.star.form.component.RichTextControl} to inspect, it supersedes the {@link
    * com.sun.star.form.component.RichTextControl.RichText} and the {@link com.sun.star.awt.UnoControlEditModel.MultiLine} properties with a new one which
    * allows choosing the text type with one single action.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.awt.UnoControlEditModel
    * @see com.sun.star.form.component.RichTextControl
    * @see com.sun.star.form.component.TextField
    */
  type EditPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which, for a {@link com.sun.star.form.FormComponent} ,
    * provides the script events offered by this form component.
    *
    * For this, the parent of the form component, which by definition supports the {@link com.sun.star.form.FormComponent} service, is examined for the
    * {@link com.sun.star.script.XEventAttacherManager} interface.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.component.CommandButton
    * @see com.sun.star.form.FormComponents
    * @see com.sun.star.script.XEventAttacherManager
    */
  type EventHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements the default property handler for all known types of {@link com.sun.star.form.FormComponents} .
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.FormComponents
    */
  type FormComponentPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which provides properties for button controls which
    * support submission of XML forms.
    *
    * The handler expects a value named "ContextDocument" in the context in which it is created. That is, the {@link com.sun.star.uno.XComponentContext}
    * used for creating the {@link CellBindingPropertyHandler} is examined for a value with this name. If the object in this value denotes a XML form
    * document (indicated by supporting the {@link com.sun.star.xforms.XFormsSupplier} interface), this document is used to examine the XML submissions
    * which the button can be bound to.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.submission.XSubmission
    * @see com.sun.star.form.submission.XSubmissionProvider
    * @see com.sun.star.form.component.SubmitButton
    * @see com.sun.star.xforms.XSubmission
    * @see com.sun.star.uno.XComponentContext.getValueByName
    */
  type SubmissionPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which provides properties related to binding form
    * control models to {@link XForm} bindings.
    *
    * The handler introduces new properties to choose an {@link com.sun.star.xforms.XModel} and a {@link com.sun.star.xforms.Binding} within this model.
    * Additionally, it introduces properties which reflect the different facets of the binding (e.g. com::sun::star::xforms::Binding::BindingExpression), so
    * they can be changed directly in the {@link com.sun.star.inspection.ObjectInspector} as if they were a property of the form component which is being
    * inspected.
    *
    * The handler expects a value named "ContextDocument" in the context in which it is created. That is, the {@link com.sun.star.uno.XComponentContext}
    * used for creating the {@link CellBindingPropertyHandler} is examined for a value with this name. If the object in this value denotes a XML form
    * document (indicated by supporting the {@link com.sun.star.xforms.XFormsSupplier} interface), this document is used to do XML binding related work.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.binding.BindableControlModel
    * @see com.sun.star.form.binding.ValueBinding
    * @see com.sun.star.xforms.Binding
    * @see com.sun.star.uno.XComponentContext.getValueByName
    */
  type XMLFormsPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which provides properties related to binding form
    * control models to {@link XForm} bindings and validating the form control content.
    *
    * By using an {@link XMLFormsPropertyHandler} , an {@link com.sun.star.inspection.ObjectInspector} can be used to bind form components to {@link
    * com.sun.star.xforms.Binding} instances. Since those instances also support validating form control content (by supporting an {@link
    * com.sun.star.form.validation.XValidator} interface), it seems reasonable to edit those validate-related properties (like the XSD data type to validate
    * against) in the {@link com.sun.star.inspection.ObjectInspector} , too. This is what an {@link XSDValidationPropertyHandler} is good for.
    *
    * The handler expects a value named "ContextDocument" in the context in which it is created. That is, the {@link com.sun.star.uno.XComponentContext}
    * used for creating the {@link CellBindingPropertyHandler} is examined for a value with this name. If the object in this value denotes a XML form
    * document (indicated by supporting the {@link com.sun.star.xforms.XFormsSupplier} interface), this document is used to do XML binding related work.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.binding.BindableControlModel
    * @see com.sun.star.form.binding.ValueBinding
    * @see com.sun.star.forms.validation.ValidatableControlModel
    * @see com.sun.star.xforms.Binding
    * @see com.sun.star.xsd.XDataType
    * @see com.sun.star.uno.XComponentContext.getValueByName
    */
  type XSDValidationPropertyHandler = activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs.XPropertyHandler
}
