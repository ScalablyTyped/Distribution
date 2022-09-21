package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlButtonModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBoxModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlComboBoxModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlDateFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEditModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlFileControlModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlFixedTextModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBoxModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlImageControlModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlListBoxModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlNumericFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlPatternFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButtonModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlScrollBarModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlSpinButtonModel
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlTimeFieldModel
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyState
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XContentEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.form.submission.XSubmissionSupplier
import typings.activexLibreoffice.com_.sun.star.sdb.RowSet
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object component {
  
  /**
    * specifies the model of a check box control
    *
    * The model supports the properties required for HTML, thus you can build up HTMLForms with it
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait CheckBox
    extends StObject
       with UnoControlCheckBoxModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlCheckBoxModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /**
      * contains a reference value which is used for submission in a HTML form
      *
      * When submitting a {@link HTMLForm} which contains a check box, which is checked, the RefValue is used for submission.
      */
    var RefValue: String = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies a component which allows the input of text or selection of text from a list of text values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait ComboBox
    extends StObject
       with UnoControlComboBoxModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlComboBoxModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * specifies the control model for a clickable button which is part of a form component hierarchy.
    * @see ImageButton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait CommandButton
    extends StObject
       with UnoControlButtonModel
       with XImageProducerSupplier
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /** describes the action to be executed by the button when pressed. */
    var ButtonType: FormButtonType = js.native
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * specifies the default toggle state for the button, used when it is reset.
      *
      * This property is meaningful only when {@link com.sun.star.awt.UnoControlButtonModel.Toggle} is `TRUE` . In this case, the `DefaultState` controls to
      * which `State` the button will be reset.
      *
      * For a given implementation of the interface, if this (optional) property is present, then also the optional interface {@link com.sun.star.form.XReset}
      * must be present.
      */
    var DefaultState: Boolean = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /**
      * describes the frame, where to open the document specified by the TargetURL.
      *
      * This property is evaluated if the button is of type URL.
      *
      * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
      */
    var TargetFrame: String = js.native
    
    /**
      * specifies the URL, which should be opened if the button was clicked.
      *
      * This property is evaluated if the button is of type URL.
      * @see com.sun.star.form.FormButtonType
      */
    var TargetURL: String = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** This service specifies the ControlModel for an edit field which contains a currency value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait CurrencyField
    extends StObject
       with UnoControlCurrencyFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies a form which is connected to a database and displays the results of SQL queries. It provides the possibility of adding new data
    * records, modifying existing ones, or deleting them.
    *
    * A database form is a special kind of enhanced database row set which provides all information for displaying the data and has more possibilities for
    * configuring the data manipulation.
    */
  @js.native
  trait DataForm
    extends StObject
       with RowSet
       with Form
       with XReset
       with XLoadable
       with XDatabaseParameterBroadcaster {
    
    /**
      * determines if deletions of records of the form are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for deletions
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowDeletes: Boolean = js.native
    
    /**
      * determines if insertions into the form's row set are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for insertions
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowInserts: Boolean = js.native
    
    /**
      * determines if modifications of the current record of the form are allowed.
      *
      * Note that this is a recommendation for user interface components displaying the form. {@link Form} implementations may decide to allow for updates
      * done via the API, even if the property is set to `FALSE` , but the user interface should respect the property value.
      */
    var AllowUpdates: Boolean = js.native
    
    /** returns the kind of tabulator controlling. */
    var Cycle: TabulatorCycle = js.native
    
    /**
      * is used for subforms and contains the names of the columns of the subform which are related to the master fields of the parent form.
      *
      * Entries in this sequence can either denote column names in the sub form, or parameter names. ;  For instance, you could base the form on the SQL
      * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
      * the corresponding master field. ;  Alternatively, you could simply base your form on the table `invoices` , and add the column name `cust_ref` to the
      * DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
      * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
      * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
      *
      * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail form.
      *
      * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
      */
    var DetailFields: SafeArray[String] = js.native
    
    /**
      * is used for subforms and contains the names of columns of the parent form.
      *
      * These columns are typically the foreign key fields of the parent form. The values of theses columns are used to identify the data for the subform.
      * Each time the parent form changes its current row, the subform requeries it's data based on the values of the master fields.
      *
      * If the form is no sub form (e.g. its parent is not a form itself), this property is not evaluated.
      */
    var MasterFields: SafeArray[String] = js.native
    
    /** determines how an navigation bar for this form should act. */
    var NavigationBarMode: typings.activexLibreoffice.com_.sun.star.form.NavigationBarMode = js.native
  }
  
  /**
    * This service specifies a check box which is data-aware, and can be bound to a database field.
    *
    * Mostly, you will create data-aware checkboxes as tristate checkboxes, because this is a requirement to correctly handle `NULL` values in databases.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseCheckBox
    extends StObject
       with CheckBox
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a combo box which is data-aware, and can be bound to a database field.
    *
    * Like most other data aware controls, such a combo box will display the actual content of the field it is bound to. In addition, as a combo box
    * contains a list where the user can choose items to fill into the control, this list can be filled with different data from a database, too.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseComboBox
    extends StObject
       with ComboBox
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a combo box, and after this, the control content is to be committed into the database field the control is bound to, a
      * decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * describes the source of items in the combo box's list.
      *
      * The concrete meaning of this property depends on the value of {@link ListSourceType}
      */
    var ListSource: String = js.native
    
    /**
      * specifies the kind of list source.
      *
      * Note: A value of com::sun::star::form::ListSourceType::VALUELIST is not valid for a combo box. It won't be rejected when setting it, but controls will
      * usually ignore it and leave the list empty.
      */
    var ListSourceType: typings.activexLibreoffice.com_.sun.star.form.ListSourceType = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a currency field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseCurrencyField
    extends StObject
       with CurrencyField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a date field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseDateField
    extends StObject
       with DateField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a formatted field model which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseFormattedField
    extends StObject
       with FormattedField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a formatted field control, and after this, the control content is to be committed into the database field the control
      * is bound to, a decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies the model of a control used for displaying images stored in a database.
    *
    * As every {@link com.sun.star.form.DataAwareControlModel} , an image control can be bound to a database field. This means that for instance with every
    * record change, the content of the database field is taken, interpreted as image, and displayed in the control. ;  Unlike other more text-based
    * controls, it does not interpret the content of the field as text or double, but as binary stream (see {@link
    * com.sun.star.sdb.XColumn.getBinaryStream()} ).
    *
    * Usually, an image control model can be bound to binary columns only, namely {@link com.sun.star.sdbc.DataType.BINARY} , {@link
    * com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link com.sun.star.sdbc.DataType.OTHER} , {@link
    * com.sun.star.sdbc.DataType.LONGVARCHAR}
    *
    * Note that besides taking the image to be displayed from the bound field, there is another option. The {@link
    * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be displayed. If this property is changed from
    * outside, the respective file is loaded and set as image source.
    *
    * In a usual data form, the scenario will be as follows: There is a {@link DatabaseImageControl} as part of the document model, which acts as control
    * model for an {@link com.sun.star.form.control.ImageControl} .
    *
    * The control is an {@link com.sun.star.awt.XImageConsumer} for the {@link com.sun.star.awt.XImageProducer} supplied by the model.
    *
    * Whenever the form's cursor is positioned on a new record, the column the control model is bound to is examined for a binary data stream. This stream
    * is set as source at the image producer, which notifies it's consumers, which leads to the control displaying the image.
    *
    * When the user by some interaction tells the control to contain a new image, this is exchanged by URL. For example, implementations of the control
    * service may allow the user to browse for image. After this, the URL of the image is set as {@link
    * com.sun.star.awt.UnoControlImageControlModel.ImageURL} property at the model. ;  Now the control loads the image determined by the property value, and
    * starts producing a new data stream, which is displayed by the control (which is a consumer for this stream). ;  From now on, the control and thus the
    * database record counts as modified. If the cursor of the form is moved further, the modified record is saved, means the content of the image pointed
    * to by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} is saved into the column.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseImageControl
    extends StObject
       with UnoControlImageControlModel
       with XImageProducerSupplier
       with XBoundComponent
       with XLoadListener
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** indicates if it is possible to change the image being displayed. */
    var ReadOnly: Boolean = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies a data-aware list box control model.
    *
    * The base service for list boxes ( {@link ListBox} ) offers only one possibility to specify the list entries: The display strings in the {@link
    * com.sun.star.awt.UnoControlListBoxModel.StringItemList} property and the corresponding values in the {@link ListBox.ListSource} property.
    *
    * This service here extends this mimic. It allows to fill the list from a data source. This means that a second result set is opened, which works on the
    * same connection as the form which the list box belongs to, but can be based on an arbitrary table or SQL statement.
    *
    * For instance, you may have a form which is bound to a table **invoice** , and you use it to enter invoices for your customers. Probably, you will have
    * a second table (say **customer** ), which (among other data) contains a unique key for identifying customers. In your invoice table, you will have a
    * foreign key referring to these customers. ;  Now, besides the result set the form is based on (all your invoices), the list box can be instructed to
    * open a second result set, this time for the **customer** table, and fill its list with entries from this result set. ;  Additionally, it allows to
    * model the relation between the two tables: When the user selects a customer from the list, this customer has the unique id we just talked about (which
    * is not necessarily visible to the user in any way). The list box then automatically transfers this id into the foreign key column of **invoice** ,
    * thus allowing the user to transparently work with human-readable strings instead of pure numbers. ;  Let's call this result set the list is filled
    * from the **list result set** here ...
    *
    * The display strings are always taken from the first column of that result set, and the corresponding value as per the BoundColumn property.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseListBox
    extends StObject
       with ListBox
       with XBoundComponent
       with XLoadListener {
    
    /**
      * specifies which column of the list result set should be used for data exchange.
      *
      * When you make a selection from a list box, the "BoundColumn" property reflects which column value of a result set should be used as the value of the
      * component. If the control is bound to a database field, the column value is stored in the database field identified by the property {@link
      * com.sun.star.form.DataAwareControlModel.DataField} .
      *
      * **-1 **: The index (starting at 0) of the selected list box entry is stored in the current database field.;
      *
      * **0 or greater **: The column value of the result set at the position (0-indexed) is stored in the current database field. In particular, for value 0,
      * the selected (displayed) list box string is stored.
      *
      *
      *
      * The bound column property is only used if a list source is defined and the list source matches with the types
      * com::sun::star::form::ListSourceType::TABLE, com::sun::star::form::ListSourceType::QUERY, com::sun::star::form::ListSourceType::SQL or
      * com::sun::star::form::ListSourceType::SQLPASSTHROUGH. Otherwise the property is ignored, as there is no result set from which to get the column
      * values.
      */
    var BoundColumn: Double = js.native
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * describes the kind of list source used.
      *
      * Depending on the value of this property, the way the value of {@link ListBox.ListSource} is evaluated varies.
      * **com::sun::star::form::ListSourceType::VALUELIST **: The elements in the string sequence in {@link ListBox.ListSource} build up the entry list.;
      *
      * **com::sun::star::form::ListSourceType::TABLE **: The first element of the string sequence in {@link ListBox.ListSource} determines the table which
      * the list result set should be based on.;
      *
      * **com::sun::star::form::ListSourceType::QUERY **: The first element of the string sequence in {@link ListBox.ListSource} determines the query which
      * the list result set should be based on. ;  For retrieving the query, the connection which the data form is working with ( {@link
      * com.sun.star.sdb.RowSet.ActiveConnection} ) is queried for the {@link com.sun.star.sdb.XQueriesSupplier} interface.;
      *
      * **com::sun::star::form::ListSourceType::SQL **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL statement
      * which the list result set should be based on.; ;
      *
      * **com::sun::star::form::ListSourceType::SQLPASSTHROUGH **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL
      * statement which the list result set should be based on. ;  The statement is not analyzed by the parser. This means that you can use database specific
      * SQL features here, but, on the other hand, lose features like parameter value substitution.;
      *
      * **com::sun::star::form::ListSourceType::TABLEFIELDS **: The first element of the string sequence in {@link ListBox.ListSource} determines the table
      * whose column names should fill the list.
      */
    var ListSourceType: typings.activexLibreoffice.com_.sun.star.form.ListSourceType = js.native
    
    /** The selected value, if there is at most one. */
    var SelectedValue: Any = js.native
    
    /** The selected values. */
    var SelectedValues: SafeArray[Any] = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a numeric field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseNumericField
    extends StObject
       with NumericField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a data-aware control model for entering text which matches a specific pattern. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabasePatternField
    extends StObject
       with PatternField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a pattern field, and after this, the control content is to be committed into the database field the control is bound
      * to, a decision must be made how to deal with empty strings. ;  This is controlled by this property.
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a radio button which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseRadioButton
    extends StObject
       with RadioButton
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a text field which is data-aware, and can be bound to a database field. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseTextField
    extends StObject
       with TextField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
    /**
      * determines if an empty text should be treated as a `NULL` value.
      *
      * When the user enters text into a text field, and after this, the control content is to be committed into the database field the control is bound to, a
      * decision must be made how to deal with empty strings. ;  This is controlled by this property.
      *
      * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
      */
    var ConvertEmptyToNull: Boolean = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a data-aware field for inputting a time value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined BoundField, DataField, InputRequired, LabelControl */ @js.native
  trait DatabaseTimeField
    extends StObject
       with TimeField
       with XBoundComponent
       with XLoadListener {
    
    /**
      * references to the cursor field to which the control is bound.
      *
      * Applies only if the form the control model belongs to is loaded and the control is valid bound. The referenced field supports the {@link
      * com.sun.star.sdb.Column} service.
      * @see DataAwareControlModel.DataField
      */
    var BoundField: XPropertySet = js.native
    
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
    var DataField: String = js.native
    
    /**
      * determines whether or not input into this field is required, when it is actually bound to a database field.
      *
      * If this property is set to `FALSE` , then the form runtime will not check the control/model for `NULL` values before submitting data to the database.
      * Usually, if a control model is bound to a database field which cannot be `NULL` , and the model itself does not have a value, then the database update
      * is prevented, showing an error message to the user. To disable this behavior on a per-control basis, use the `InputRequired` property.
      * @since OOo 3.1
      */
    var InputRequired: Boolean = js.native
    
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
    var LabelControl: XPropertySet = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies the model of a date field control, which is an edit field used to enter a date. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait DateField
    extends StObject
       with UnoControlDateFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlDateFieldModel.Date
      * @see com.sun.star.form.XReset
      */
    var DefaultDate: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** This service specifies the control model of an edit field for a file name. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait FileControl
    extends StObject
       with UnoControlFileControlModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlFileControlModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies the control model for a text which can be displayed, but not edited by the user.
    *
    * These kind of controls is usually used to label other controls.
    * @see com.sun.star.form.DataAwareControlModel.LabelControl
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait FixedText
    extends StObject
       with UnoControlFixedTextModel
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies a form which is a group of {@link FormComponents} .
    *
    * A form fulfills several tasks, like storing the structure of its form components, storing the information concerning tab ordering and control
    * grouping, and last but not least, it provides the event environment for its contained elements.
    *
    * A form acts on the one hand like a container of {@link FormComponents} and on the other hand like a {@link FormComponent} . This generic construction
    * allows the definition of hierarchies of forms and their dependent subforms.
    * @see com.sun.star.form.FormControlModel
    */
  @js.native
  trait Form
    extends StObject
       with FormComponent
       with FormComponents
       with XTabControllerModel {
    
    def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[Any] = js.native
  }
  
  /**
    * This service specifies the control model of an edit field for entering text which can be (nearly) arbitrarily formatted.
    * @see com.sun.star.util.XNumberFormatsSupplier
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait FormattedField
    extends StObject
       with UnoControlFormattedFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * specifies a model for a control which can display form data in a table-like way.
    *
    * In opposite to other form controls, grid controls do not only display the single current value of a column they are bound to. Moreover, they do
    * display not only the current row of the form, but all rows (at least potentially, limited by the control size, of course).
    *
    * The table rows in a grid control correspond to the rows in the {@link DataForm} the control belongs to, and the columns correspond to single columns
    * of the form's row set.
    *
    * Columns of a grid control are modeled by own objects, too. They are very similar to usual com::sun::star::form::DataAwareControlModels modeling other
    * "single-value" controls, but they are not described as own services. Instead, they need to be created using the {@link
    * com.sun.star.form.XGridColumnFactory} interface.
    */
  @js.native
  trait GridControl
    extends StObject
       with FormControlModel
       with FormComponents
       with XGridColumnFactory
       with XSelectionSupplier
       with XReset {
    
    /**
      * returns the border style of the control.
      *
      * `; 0: No border; 1: 3D border; 2: simple border; `
      */
    var Border: Double = js.native
    
    /**
      * specifies the color of the border, if present
      *
      * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
      * @since OOo 2.0
      */
    var BorderColor: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** contains the font attributes of the text in the control. */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /**
      * specifies the height of a row of the grid.
      *
      * If the value is set to `NULL` , the height is determined automatically according to the current font used.
      * @see GridControl.FontDescriptor
      */
    var RowHeight: Double = js.native
    
    /** determines whether the control can be reached by the tabulator key. */
    var Tabstop: Boolean = js.native
    
    /** specifies the text color (RGB) of the control. */
    var TextColor: Color = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** This service specifies a model for a control which can be used to visually group controls. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait GroupBox
    extends StObject
       with UnoControlGroupBoxModel
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies the special kind of {@link Forms} for HTML documents.
    *
    * An {@link HTMLForm} fulfills the specification of forms in HTML. It supplies the possibility of submitting or resetting the contents of a form. For
    * more information on HTML forms, please see the documentation of HTML.
    */
  @js.native
  trait HTMLForm
    extends StObject
       with Form
       with XReset
       with XSubmit {
    
    /** specifies the kind of encoding for submission. */
    var SubmitEncoding: FormSubmitEncoding = js.native
    
    /** specifies the kind of submission. */
    var SubmitMethod: FormSubmitMethod = js.native
    
    /** describes the frame, where to open the document specified by the TargetURL. */
    var TargetFrame: String = js.native
    
    /** specifies the URL, which should be used for submission. */
    var TargetURL: String = js.native
  }
  
  /**
    * This service specifies the model of a hidden control.
    *
    * The only sense of a hidden control is to store data in the form which is not visible to the user.
    *
    * Usually, hidden controls are used in com::sun::star::form::component::HTMLForms, where they contain data which is to be submitted. ;  Nevertheless,
    * you can use them in your own forms for storing any data, for instance to evaluate it in some scripting macro.
    */
  @js.native
  trait HiddenControl
    extends StObject
       with FormComponent {
    
    /** specifies the value of the component. */
    var HiddenValue: String = js.native
    
    def getPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[Any] = js.native
  }
  
  /**
    * This service specifies the control model for a clickable button which is represented by an image.
    *
    * The image to be displayed is determined by {@link com.sun.star.awt.UnoControlImageControlModel.ImageURL} property specifies the URL of an image to be
    * displayed.
    * @see CommandButton
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait ImageButton
    extends StObject
       with UnoControlImageControlModel
       with XImageProducerSupplier
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /** describes the action to be executed by the button when pressed. */
    var ButtonType: FormButtonType = js.native
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /**
      * describes the frame, where to open the document specified by the TargetURL.
      *
      * This property is evaluated if the button is of type URL.
      *
      * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
      */
    var TargetFrame: String = js.native
    
    /**
      * specifies the URL, which should be opened if the button was clicked.
      *
      * This property is evaluated if the button is of type URL.
      * @see com.sun.star.form.FormButtonType
      */
    var TargetURL: String = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies a model for a control which allows to choose in a list of alternative values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait ListBox
    extends StObject
       with UnoControlListBoxModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains the indexes of entries of the listbox, which should selected by default.
      *
      * This selection is used initially or for a reset.
      * @see com.sun.star.awt.UnoControlListBoxModel.SelectedItems
      * @see com.sun.star.form.XReset
      */
    var DefaultSelection: SafeArray[Double] = js.native
    
    /** contains the values associated to the strings to be displayed (which are specified by {@link com.sun.star.awt.UnoControlListBoxModel.StringItemList} ) */
    var ListSource: SafeArray[String] = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * This service specifies the model for control which provides controller functionality for a {@link DataForm} , such as navigating or filtering the
    * form.
    */
  @js.native
  trait NavigationToolBar
    extends StObject
       with FormControlModel {
    
    /**
      * denotes the border style of the control.
      *
      * Allowed values are **0** : no border at all**1** : 3D border**2** : simple flat
      */
    var Border: Double = js.native
    
    /** determines whether the control is enabled or disabled. */
    var Enabled: Boolean = js.native
    
    /** contains the font attributes for the text in the control */
    var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
    
    /**
      * specifies the emphasis mark for the font described in {@link FontDescriptor}
      *
      * The value must be one of the {@link com.sun.star.text.FontEmphasis} constants.
      */
    var FontEmphasisMark: Double = js.native
    
    /**
      * specifies the relief for the font described in {@link FontDescriptor}
      *
      * The value must be one of the {@link com.sun.star.text.FontRelief} constants.
      */
    var FontRelief: Double = js.native
    
    /**
      * specifies the size of the icons in the control
      *
      * At least the following values are to be supported: 0: small icons (16x16)1: medium size icons (26x26)
      */
    var IconSize: Double = js.native
    
    /**
      * specifies a repeat delay for the control
      *
      * Some buttons of a {@link NavigationToolBar} may show repeating behavior, e.g. may be repeatedly triggered when the user keeps the mouse pressed over
      * such a button. ;  The delay between two such triggers (in milliseconds) is specified with this property.
      */
    var RepeatDelay: Double = js.native
    
    /** determines whether the control should provide functionality for filtering and sorting the parent form */
    var ShowFilterSort: Boolean = js.native
    
    /** determines whether the control should provide functionality for navigating the parent form */
    var ShowNavigation: Boolean = js.native
    
    /** determines whether the control should provide functionality for positioning the parent form */
    var ShowPosition: Boolean = js.native
    
    /** determines whether the control should provide functionality for acting on the current record of the parent form */
    var ShowRecordActions: Boolean = js.native
    
    /** specifies the text color (as RGB value) of the control. */
    var TextColor: Double = js.native
    
    /**
      * specifies the text line color (as RGB value) of the control.
      *
      * This color is used if the {@link FontDescriptor} defines that the text in the control should be underlined or stroke out.
      */
    var TextLineColor: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which allows the input of a numeric value. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait NumericField
    extends StObject
       with UnoControlNumericFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlNumericFieldModel.Value
      * @see com.sun.star.form.XReset
      */
    var DefaultValue: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies a component which allows the input of text which matches a specific pattern. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait PatternField
    extends StObject
       with UnoControlPatternFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlPatternFieldModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * specifies a component which acts as a radio button as needed in HTMLForms.
    *
    * Radio buttons are controls which can be grouped together, and in every group, only one of the controls can be check. This means if one of them is
    * checked by a user interaction, all other controls in the same group are automatically unchecked
    *
    * Like in HTML, radio buttons are grouped together if and only if they have the same name (see {@link com.sun.star.form.FormComponent.Name} ).
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait RadioButton
    extends StObject
       with UnoControlRadioButtonModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      *
      * In a group of radio buttons only one button should be checked by default.
      * @see com.sun.star.awt.UnoControlRadioButtonModel.State
      * @see com.sun.star.form.XReset
      */
    var DefaultState: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /**
      * contains a reference value which is used for submission in a HTML form.
      *
      * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
      * used for submission.
      */
    var RefValue: String = js.native
    
    /**
      * specifies a value which is to be associated with the control when it's **not** selected.
      *
      * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
      * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
      */
    var UncheckedRefValue: String = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies a component which extends the {@link com.sun.star.awt.UnoControlEditModel} with capabilities to display and input formatted text. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex because var conflicts: WritingMode. Inlined 
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.text.TextRange because var conflicts: WritingMode. Inlined 
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait RichTextControl
    extends StObject
       with UnoControlEditModel
       with XFastPropertySet
       with XPropertyState
       with XTextRange
       with XContentEnumerationAccess
       with CharacterProperties
       with CharacterPropertiesAsian
       with CharacterPropertiesComplex
       with ParagraphProperties
       with ParagraphPropertiesAsian
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /**
      * specifies whether the control should display the text including all its formatting.
      *
      * If this is set to `FALSE` , the control will act as ordinary {@link com.sun.star.awt.UnoControlEditModel} .
      *
      * If the property is set to `TRUE` , the control will ignore the following properties: {@link com.sun.star.awt.UnoControlEditModel.EchoChar}{@link
      * com.sun.star.awt.UnoControlEditModel.MaxTextLen}{@link com.sun.star.awt.UnoControlEditModel.MultiLine}{@link
      * com.sun.star.awt.UnoControlEditModel.Align}
      */
    var RichText: Boolean = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies the model of a scroll bar control. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait ScrollBar
    extends StObject
       with UnoControlScrollBarModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlScrollBarModel.ScrollValue
      * @see com.sun.star.form.XReset
      */
    var DefaultScrollValue: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /** specifies the model of a scroll bar control. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait SpinButton
    extends StObject
       with UnoControlSpinButtonModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlSpinButtonModel.SpinValue
      * @see com.sun.star.form.XReset
      */
    var DefaultSpinValue: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
  
  /**
    * specifies the control model for a button, part of a form component hierarchy, which can be bound to external submissions.
    * @see CommandButton
    */
  @js.native
  trait SubmitButton
    extends StObject
       with FormControlModel
       with XSubmissionSupplier {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies a component which allows the input of text, either single- or multi-line. */
  @js.native
  trait TextField
    extends StObject
       with RichTextControl
       with XReset {
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlEditModel.Text
      * @see com.sun.star.form.XReset
      */
    var DefaultText: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** specifies the control model for a field which can be used to input time values. */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
  - typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined 
  - typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typings.activexLibreoffice.com_.sun.star.form.FormControlModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined ClassId */ @js.native
  trait TimeField
    extends StObject
       with UnoControlTimeFieldModel
       with XReset
       with XFastPropertySet
       with XPropertyState
       with XChild
       with XPropertyBag {
    
    /**
      * specifies the ID for classification of the component.
      * @see FormComponentType
      */
    var ClassId: Double = js.native
    
    /**
      * contains a default value for the control.
      *
      * This value is used when the control is initially displayed, and for resetting it.
      * @see com.sun.star.awt.UnoControlTimeFieldModel.Time
      * @see com.sun.star.form.XReset
      */
    var DefaultTime: Double = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override val PropertySetInfo: XPropertySetInfo = js.native
    
    /** @returns the programmatic name of the object. */
    def getName(): String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
    
    /** sets the programmatic name of the object. */
    def setName(aName: String): Unit = js.native
  }
}
