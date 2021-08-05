package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.inspection.PropertyCategoryDescriptor
import typings.activexLibreoffice.com_.sun.star.inspection.XObjectInspectorModel
import typings.activexLibreoffice.com_.sun.star.inspection.XPropertyHandler
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspection {
  
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
  type ButtonNavigationHandler = XPropertyHandler
  
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
  type CellBindingPropertyHandler = XPropertyHandler
  
  /**
    * implements a {@link com.sun.star.inspection.XObjectInspectorModel} for inspecting form components, in particular all components implementing the
    * {@link FormComponent} service.
    *
    * A {@link DefaultFormComponentInspectorModel} provides the following handlers by default: {@link ButtonNavigationHandler}{@link
    * CellBindingPropertyHandler}{@link EditPropertyHandler}{@link EventHandler}{@link FormComponentPropertyHandler}{@link SubmissionPropertyHandler}{@link
    * XMLFormsPropertyHandler}{@link XSDValidationPropertyHandler}
    * @see com.sun.star.inspection.XObjectInspectorModel.HandlerFactories
    */
  trait DefaultFormComponentInspectorModel
    extends StObject
       with XObjectInspectorModel {
    
    /**
      * creates a default {@link DefaultFormComponentInspectorModel} , providing factories for all handlers listed above.
      * @since OOo 2.2
      */
    def createDefault(): Unit
    
    /**
      * creates a default {@link DefaultFormComponentInspectorModel} , providing factories for all handlers listed above, and describing an ObjectInspector
      * which has a help section.
      * @param minHelpTextLines denotes the minimum number of lines of text to be reserved for the help section.
      * @param maxHelpTextLines denotes the maximum number of lines of text to be reserved for the help section.
      * @see XObjectInspectorModel.HasHelpSection
      * @see XObjectInspectorModel.MinHelpTextLines
      * @see XObjectInspectorModel.MaxHelpTextLines
      * @since OOo 2.2
      * @throws com::sun::star::lang::IllegalArgumentException if minHelpTextLines or maxHelpTextLines are negative, or if minHelpTextLines is greater than maxHe
      */
    def createWithHelpSection(minHelpTextLines: Double, maxHelpTextLines: Double): Unit
  }
  object DefaultFormComponentInspectorModel {
    
    inline def apply(
      HandlerFactories: SafeArray[js.Any],
      HasHelpSection: Boolean,
      IsReadOnly: Boolean,
      MaxHelpTextLines: Double,
      MinHelpTextLines: Double,
      createDefault: () => Unit,
      createWithHelpSection: (Double, Double) => Unit,
      describeCategories: () => SafeArray[PropertyCategoryDescriptor],
      getPropertyOrderIndex: String => Double
    ): DefaultFormComponentInspectorModel = {
      val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], createDefault = js.Any.fromFunction0(createDefault), createWithHelpSection = js.Any.fromFunction2(createWithHelpSection), describeCategories = js.Any.fromFunction0(describeCategories), getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
      __obj.asInstanceOf[DefaultFormComponentInspectorModel]
    }
    
    extension [Self <: DefaultFormComponentInspectorModel](x: Self) {
      
      inline def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
      
      inline def setCreateWithHelpSection(value: (Double, Double) => Unit): Self = StObject.set(x, "createWithHelpSection", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * implements a property handler for use with an {@link com.sun.star.inspection.ObjectInspector} which provides convenience wrappers for some properties
    * existing at a form component derived from {@link com.sun.star.awt.UnoControlEditModel} .
    *
    * First, the handler supersedes the HScroll and the VScroll properties of a {@link com.sun.star.awt.UnoControlEditModel} and puts them into one common
    * property, allowing the user to choose whether they want to have "no", a "vertical", a "horizontal", or "both" scrollbars.
    *
    * Second, if it detects a {@link com.sun.star.form.component.RichTextControl} to inspect, it supersedes the {@link
    * com.sun.star.form.component.RichTextControl.RichText} and the {@link com.sun.star.awt.UnoControlEditModel.MultiLine} properties with a new one which
    * allows choosing the text type with one single action.
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.awt.UnoControlEditModel
    * @see com.sun.star.form.component.RichTextControl
    * @see com.sun.star.form.component.TextField
    */
  type EditPropertyHandler = XPropertyHandler
  
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
  type EventHandler = XPropertyHandler
  
  /**
    * implements the default property handler for all known types of {@link com.sun.star.form.FormComponents} .
    * @see com.sun.star.inspection.XPropertyHandler
    * @see com.sun.star.form.FormComponents
    */
  type FormComponentPropertyHandler = XPropertyHandler
  
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
  type SubmissionPropertyHandler = XPropertyHandler
  
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
  type XMLFormsPropertyHandler = XPropertyHandler
  
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
  type XSDValidationPropertyHandler = XPropertyHandler
}
