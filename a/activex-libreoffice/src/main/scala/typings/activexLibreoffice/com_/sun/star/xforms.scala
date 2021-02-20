package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.container.XSet
import typings.activexLibreoffice.com_.sun.star.form.binding.ListEntrySource
import typings.activexLibreoffice.com_.sun.star.form.binding.ValueBinding
import typings.activexLibreoffice.com_.sun.star.form.binding.XListEntryListener
import typings.activexLibreoffice.com_.sun.star.form.submission.XSubmissionVetoListener
import typings.activexLibreoffice.com_.sun.star.form.validation.XValidator
import typings.activexLibreoffice.com_.sun.star.form.validation.XValidityConstraintListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.util.VetoException
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.PhaseType
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.XEvent
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.XEventTarget
import typings.activexLibreoffice.com_.sun.star.xsd.XDataType
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xforms {
  
  /** represent a binding to one or more nodes in the DOM tree of an {@link XModel} . */
  @js.native
  trait Binding
    extends ValueBinding
       with ListEntrySource
       with XValidator {
    
    /**
      * among other properties, there is this one
      *
      * It is unclear to me whether this is an implementation detail or a supported interface.
      *
      * The value supports the service {@link com.sun.star.xml.NamespaceContainer}
      * @see com.sun.star.xml.NamespaceContainer
      */
    var BindingNamespaces: XNameContainer = js.native
  }
  object Binding {
    
    @scala.inline
    def apply(
      AllListEntries: SafeArray[String],
      BindingNamespaces: XNameContainer,
      ListEntryCount: Double,
      PropertySetInfo: XPropertySetInfo,
      ReadOnly: Boolean,
      Relevant: Boolean,
      SupportedValueTypes: SafeArray[`type`],
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addListEntryListener: XListEntryListener => Unit,
      addModifyListener: XModifyListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addValidityConstraintListener: XValidityConstraintListener => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      dispose: () => Unit,
      explainInvalid: js.Any => String,
      getAllListEntries: () => SafeArray[String],
      getListEntry: Double => String,
      getListEntryCount: () => Double,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      getSupportedValueTypes: () => SafeArray[`type`],
      getValue: `type` => js.Any,
      isValid: js.Any => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeListEntryListener: XListEntryListener => Unit,
      removeModifyListener: XModifyListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeValidityConstraintListener: XValidityConstraintListener => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit,
      setValue: js.Any => Unit,
      supportsType: `type` => Boolean
    ): Binding = {
      val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], BindingNamespaces = BindingNamespaces.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Relevant = Relevant.asInstanceOf[js.Any], SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addListEntryListener = js.Any.fromFunction1(addListEntryListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addValidityConstraintListener = js.Any.fromFunction1(addValidityConstraintListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), explainInvalid = js.Any.fromFunction1(explainInvalid), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = js.Any.fromFunction0(getSupportedValueTypes), getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeValidityConstraintListener = js.Any.fromFunction1(removeValidityConstraintListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setValue = js.Any.fromFunction1(setValue), supportsType = js.Any.fromFunction1(supportsType))
      __obj.asInstanceOf[Binding]
    }
    
    @scala.inline
    implicit class BindingMutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindingNamespaces(value: XNameContainer): Self = StObject.set(x, "BindingNamespaces", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * thrown if the user triggers an {@link XForms} submission with invalid instance data
    *
    * The com::sun::star::uno::Exception::Source member refers to the submission which was invoked.
    */
  type InvalidDataOnSubmitException = VetoException
  
  /** @since LibreOffice 4.1 */
  type Model = XModel2
  
  /**
    * specifies a repository of XSD data types
    *
    * The elements of the repository are instances supporting the {@link com.sun.star.xsd.XDataType} interface.
    */
  @js.native
  trait XDataTypeRepository
    extends XEnumerationAccess
       with XNameAccess {
    
    /**
      * creates a clone of the given data type, and inserts it into the repository
      * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
      * @throws com::sun::star::container::ElementExistException if the new name is already used in the repository
      */
    def cloneDataType(sourceName: String, newName: String): XDataType = js.native
    
    /**
      * retrieves the basic type for the given type class
      * @see com.sun.star.xsd.DataTypeClass
      * @throws com::sun::star::container::NoSuchElementException if in the repository, there is no data type with the given class
      */
    def getBasicDataType(dataTypeClass: Double): XDataType = js.native
    
    def getDataType(typeName: String): XDataType = js.native
    
    /**
      * removes a data type given by name from the repository
      * @see com.sun.star.xsd.XDataType
      * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
      * @throws com::sun::star::util::VetoException if the specified data type is a built-in (basic) data type, and cannot be removed
      */
    def revokeDataType(typeName: String): Unit = js.native
  }
  object XDataTypeRepository {
    
    @scala.inline
    def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: () => Unit,
      cloneDataType: (String, String) => XDataType,
      createEnumeration: () => XEnumeration,
      getBasicDataType: Double => XDataType,
      getByName: String => js.Any,
      getDataType: String => XDataType,
      getElementNames: () => SafeArray[String],
      getElementType: () => `type`,
      hasByName: String => Boolean,
      hasElements: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      revokeDataType: String => Unit
    ): XDataTypeRepository = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cloneDataType = js.Any.fromFunction2(cloneDataType), createEnumeration = js.Any.fromFunction0(createEnumeration), getBasicDataType = js.Any.fromFunction1(getBasicDataType), getByName = js.Any.fromFunction1(getByName), getDataType = js.Any.fromFunction1(getDataType), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokeDataType = js.Any.fromFunction1(revokeDataType))
      __obj.asInstanceOf[XDataTypeRepository]
    }
    
    @scala.inline
    implicit class XDataTypeRepositoryMutableBuilder[Self <: XDataTypeRepository] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloneDataType(value: (String, String) => XDataType): Self = StObject.set(x, "cloneDataType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetBasicDataType(value: Double => XDataType): Self = StObject.set(x, "getBasicDataType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDataType(value: String => XDataType): Self = StObject.set(x, "getDataType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevokeDataType(value: String => Unit): Self = StObject.set(x, "revokeDataType", js.Any.fromFunction1(value))
    }
  }
  
  /** @since LibreOffice 4.1 */
  type XForms = XNameContainer
  
  @js.native
  trait XFormsEvent extends XEvent {
    
    def initXFormsEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  }
  object XFormsEvent {
    
    @scala.inline
    def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: () => Unit,
      getBubbles: () => Boolean,
      getCancelable: () => Boolean,
      getCurrentTarget: () => XEventTarget,
      getEventPhase: () => PhaseType,
      getTarget: () => XEventTarget,
      getTimeStamp: () => Time,
      getType: () => String,
      initEvent: (String, Boolean, Boolean) => Unit,
      initXFormsEvent: (String, Boolean, Boolean) => Unit,
      preventDefault: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      stopPropagation: () => Unit
    ): XFormsEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initXFormsEvent = js.Any.fromFunction3(initXFormsEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
      __obj.asInstanceOf[XFormsEvent]
    }
    
    @scala.inline
    implicit class XFormsEventMutableBuilder[Self <: XFormsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitXFormsEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initXFormsEvent", js.Any.fromFunction3(value))
    }
  }
  
  /** provides access to the {@link XForms} models contained in the component */
  @js.native
  trait XFormsSupplier extends XInterface {
    
    /**
      * access {@link XForms} model container.
      * @returns a container for the {@link XForms} models contained in the component
      */
    val XForms: XNameContainer = js.native
    
    /**
      * access {@link XForms} model container.
      * @returns a container for the {@link XForms} models contained in the component
      */
    def getXForms(): XNameContainer = js.native
  }
  object XFormsSupplier {
    
    @scala.inline
    def apply(
      XForms: XNameContainer,
      acquire: () => Unit,
      getXForms: () => XNameContainer,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XFormsSupplier = {
      val __obj = js.Dynamic.literal(XForms = XForms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXForms = js.Any.fromFunction0(getXForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XFormsSupplier]
    }
    
    @scala.inline
    implicit class XFormsSupplierMutableBuilder[Self <: XFormsSupplier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetXForms(value: () => XNameContainer): Self = StObject.set(x, "getXForms", js.Any.fromFunction0(value))
      
      @scala.inline
      def setXForms(value: XNameContainer): Self = StObject.set(x, "XForms", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provide several helper methods for the UI
    *
    * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
    */
  @js.native
  trait XFormsUIHelper1 extends StObject {
    
    def cloneBindingAsGhost(binding: XPropertySet): XPropertySet = js.native
    
    def createAttribute(xParent: XNode, sName: String): XNode = js.native
    
    def createElement(xParent: XNode, sName: String): XNode = js.native
    
    def getBindingForNode(xNode: XNode, bCreate: Boolean): XPropertySet = js.native
    
    def getBindingName(xBinding: XPropertySet, bDetail: Boolean): String = js.native
    
    def getDefaultBindingExpressionForNode(xNode: XNode): String = js.native
    
    def getDefaultServiceNameForNode(xNode: XNode): String = js.native
    
    def getNodeDisplayName(xNode: XNode, bDetail: Boolean): String = js.native
    
    def getNodeName(xNode: XNode): String = js.native
    
    def getResultForExpression(xBinding: XPropertySet, bIsBindingExpression: Boolean, sExpression: String): String = js.native
    
    def getSubmissionName(xSubm: XPropertySet, bDetail: Boolean): String = js.native
    
    def isValidPrefixName(sName: String): Boolean = js.native
    
    def isValidXMLName(sName: String): Boolean = js.native
    
    def newInstance(sName: String, sURL: String, bURLOnce: Boolean): XDocument = js.native
    
    def newModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): XModel = js.native
    
    def removeBindingForNode(xNode: XNode): Unit = js.native
    
    def removeBindingIfUseless(xBinding: XPropertySet): Unit = js.native
    
    def removeInstance(sName: String): Unit = js.native
    
    def removeModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): Unit = js.native
    
    def renameInstance(sFrom: String, sTo: String, sURL: String, bURLOnce: Boolean): Unit = js.native
    
    def renameModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sFrom: String, sTo: String): Unit = js.native
    
    def renameNode(xNode: XNode, sName: String): XNode = js.native
    
    def setNodeValue(xNode: XNode, sValue: String): Unit = js.native
  }
  object XFormsUIHelper1 {
    
    @scala.inline
    def apply(
      cloneBindingAsGhost: XPropertySet => XPropertySet,
      createAttribute: (XNode, String) => XNode,
      createElement: (XNode, String) => XNode,
      getBindingForNode: (XNode, Boolean) => XPropertySet,
      getBindingName: (XPropertySet, Boolean) => String,
      getDefaultBindingExpressionForNode: XNode => String,
      getDefaultServiceNameForNode: XNode => String,
      getNodeDisplayName: (XNode, Boolean) => String,
      getNodeName: XNode => String,
      getResultForExpression: (XPropertySet, Boolean, String) => String,
      getSubmissionName: (XPropertySet, Boolean) => String,
      isValidPrefixName: String => Boolean,
      isValidXMLName: String => Boolean,
      newInstance: (String, String, Boolean) => XDocument,
      newModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel,
      removeBindingForNode: XNode => Unit,
      removeBindingIfUseless: XPropertySet => Unit,
      removeInstance: String => Unit,
      removeModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit,
      renameInstance: (String, String, String, Boolean) => Unit,
      renameModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit,
      renameNode: (XNode, String) => XNode,
      setNodeValue: (XNode, String) => Unit
    ): XFormsUIHelper1 = {
      val __obj = js.Dynamic.literal(cloneBindingAsGhost = js.Any.fromFunction1(cloneBindingAsGhost), createAttribute = js.Any.fromFunction2(createAttribute), createElement = js.Any.fromFunction2(createElement), getBindingForNode = js.Any.fromFunction2(getBindingForNode), getBindingName = js.Any.fromFunction2(getBindingName), getDefaultBindingExpressionForNode = js.Any.fromFunction1(getDefaultBindingExpressionForNode), getDefaultServiceNameForNode = js.Any.fromFunction1(getDefaultServiceNameForNode), getNodeDisplayName = js.Any.fromFunction2(getNodeDisplayName), getNodeName = js.Any.fromFunction1(getNodeName), getResultForExpression = js.Any.fromFunction3(getResultForExpression), getSubmissionName = js.Any.fromFunction2(getSubmissionName), isValidPrefixName = js.Any.fromFunction1(isValidPrefixName), isValidXMLName = js.Any.fromFunction1(isValidXMLName), newInstance = js.Any.fromFunction3(newInstance), newModel = js.Any.fromFunction2(newModel), removeBindingForNode = js.Any.fromFunction1(removeBindingForNode), removeBindingIfUseless = js.Any.fromFunction1(removeBindingIfUseless), removeInstance = js.Any.fromFunction1(removeInstance), removeModel = js.Any.fromFunction2(removeModel), renameInstance = js.Any.fromFunction4(renameInstance), renameModel = js.Any.fromFunction3(renameModel), renameNode = js.Any.fromFunction2(renameNode), setNodeValue = js.Any.fromFunction2(setNodeValue))
      __obj.asInstanceOf[XFormsUIHelper1]
    }
    
    @scala.inline
    implicit class XFormsUIHelper1MutableBuilder[Self <: XFormsUIHelper1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloneBindingAsGhost(value: XPropertySet => XPropertySet): Self = StObject.set(x, "cloneBindingAsGhost", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateAttribute(value: (XNode, String) => XNode): Self = StObject.set(x, "createAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateElement(value: (XNode, String) => XNode): Self = StObject.set(x, "createElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetBindingForNode(value: (XNode, Boolean) => XPropertySet): Self = StObject.set(x, "getBindingForNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetBindingName(value: (XPropertySet, Boolean) => String): Self = StObject.set(x, "getBindingName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDefaultBindingExpressionForNode(value: XNode => String): Self = StObject.set(x, "getDefaultBindingExpressionForNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDefaultServiceNameForNode(value: XNode => String): Self = StObject.set(x, "getDefaultServiceNameForNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNodeDisplayName(value: (XNode, Boolean) => String): Self = StObject.set(x, "getNodeDisplayName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNodeName(value: XNode => String): Self = StObject.set(x, "getNodeName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetResultForExpression(value: (XPropertySet, Boolean, String) => String): Self = StObject.set(x, "getResultForExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetSubmissionName(value: (XPropertySet, Boolean) => String): Self = StObject.set(x, "getSubmissionName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValidPrefixName(value: String => Boolean): Self = StObject.set(x, "isValidPrefixName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidXMLName(value: String => Boolean): Self = StObject.set(x, "isValidXMLName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewInstance(value: (String, String, Boolean) => XDocument): Self = StObject.set(x, "newInstance", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNewModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel): Self = StObject.set(x, "newModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveBindingForNode(value: XNode => Unit): Self = StObject.set(x, "removeBindingForNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveBindingIfUseless(value: XPropertySet => Unit): Self = StObject.set(x, "removeBindingIfUseless", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveInstance(value: String => Unit): Self = StObject.set(x, "removeInstance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit): Self = StObject.set(x, "removeModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenameInstance(value: (String, String, String, Boolean) => Unit): Self = StObject.set(x, "renameInstance", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenameModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit): Self = StObject.set(x, "renameModel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenameNode(value: (XNode, String) => XNode): Self = StObject.set(x, "renameNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetNodeValue(value: (XNode, String) => Unit): Self = StObject.set(x, "setNodeValue", js.Any.fromFunction2(value))
    }
  }
  
  /** represent an {@link XForms} model */
  @js.native
  trait XModel extends StObject {
    
    /** get a container containing all bindings; also supports XNameAccess */
    val Bindings: XSet = js.native
    
    /** provides management access to the XSD data types associated with the model */
    val DataTypeRepository: XDataTypeRepository = js.native
    
    /** get the default instance for this model */
    val DefaultInstance: XDocument = js.native
    
    /** get the {@link XForms} model ID */
    var ID: String = js.native
    
    /**
      * gets container containing all instances;
      *
      * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
      */
    val Instances: XSet = js.native
    
    /** get container containing all submissions; also supports XNameAccess */
    val Submissions: XSet = js.native
    
    /**
      * clone an arbitrary binding element for this model; still needs
      *
      * The returned binding still needs to be inserted into the bindings container.
      * @see getBindings
      */
    def cloneBinding(binding: XPropertySet): XPropertySet = js.native
    
    /**
      * clone an arbitrary submission element for this model
      *
      * The returned submission element still needs to be inserted into the submission container.
      * @see getSubmissions
      */
    def cloneSubmission(submission: XPropertySet): XSubmission = js.native
    
    /**
      * create a binding element for this model
      *
      * The returned binding still needs to be inserted into the bindings container.
      * @see getBindings
      */
    def createBinding(): XPropertySet = js.native
    
    /**
      * create a submission element for this model
      *
      * The returned submission element still needs to be inserted into the submission container.
      * @see getSubmissions
      */
    def createSubmission(): XSubmission = js.native
    
    /**
      * get a binding with a certain ID
      *
      * This is a convenience method: the same result can also be obtained through {@link getBindings()}
      */
    def getBinding(id: String): XPropertySet = js.native
    
    /** get a container containing all bindings; also supports XNameAccess */
    def getBindings(): XSet = js.native
    
    /** provides management access to the XSD data types associated with the model */
    def getDataTypeRepository(): XDataTypeRepository = js.native
    
    /** get the default instance for this model */
    def getDefaultInstance(): XDocument = js.native
    
    /** get the {@link XForms} model ID */
    def getID(): String = js.native
    
    /** retrieves the instance with the given id */
    def getInstanceDocument(id: String): XDocument = js.native
    
    /**
      * gets container containing all instances;
      *
      * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
      */
    def getInstances(): XSet = js.native
    
    /**
      * get a submission with a certain ID.
      *
      * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
      */
    def getSubmission(id: String): XSubmission = js.native
    
    /** get container containing all submissions; also supports XNameAccess */
    def getSubmissions(): XSet = js.native
    
    /** initialize the model */
    def initialize(): Unit = js.native
    
    /** rebuild the model */
    def rebuild(): Unit = js.native
    
    /** re-evaluate all calculate attributes */
    def recalculate(): Unit = js.native
    
    /** refresh the model */
    def refresh(): Unit = js.native
    
    /** re-evaluate all validity attributes */
    def revalidate(): Unit = js.native
    
    /** set the {@link XForms} model ID */
    def setID(id: String): Unit = js.native
    
    /**
      * submit form through given submission id
      *
      * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
      * @param id the ID of the submission to execute
      * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
      * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
      */
    def submit(id: String): Unit = js.native
    
    /**
      * submit form through given submission id
      *
      * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
      * @param id the ID of the submission to execute
      * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
      * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
      * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
      */
    def submitWithInteraction(id: String, aHandler: XInteractionHandler): Unit = js.native
  }
  object XModel {
    
    @scala.inline
    def apply(
      Bindings: XSet,
      DataTypeRepository: XDataTypeRepository,
      DefaultInstance: XDocument,
      ID: String,
      Instances: XSet,
      Submissions: XSet,
      cloneBinding: XPropertySet => XPropertySet,
      cloneSubmission: XPropertySet => XSubmission,
      createBinding: () => XPropertySet,
      createSubmission: () => XSubmission,
      getBinding: String => XPropertySet,
      getBindings: () => XSet,
      getDataTypeRepository: () => XDataTypeRepository,
      getDefaultInstance: () => XDocument,
      getID: () => String,
      getInstanceDocument: String => XDocument,
      getInstances: () => XSet,
      getSubmission: String => XSubmission,
      getSubmissions: () => XSet,
      initialize: () => Unit,
      rebuild: () => Unit,
      recalculate: () => Unit,
      refresh: () => Unit,
      revalidate: () => Unit,
      setID: String => Unit,
      submit: String => Unit,
      submitWithInteraction: (String, XInteractionHandler) => Unit
    ): XModel = {
      val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
      __obj.asInstanceOf[XModel]
    }
    
    @scala.inline
    implicit class XModelMutableBuilder[Self <: XModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: XSet): Self = StObject.set(x, "Bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneBinding(value: XPropertySet => XPropertySet): Self = StObject.set(x, "cloneBinding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloneSubmission(value: XPropertySet => XSubmission): Self = StObject.set(x, "cloneSubmission", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateBinding(value: () => XPropertySet): Self = StObject.set(x, "createBinding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateSubmission(value: () => XSubmission): Self = StObject.set(x, "createSubmission", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataTypeRepository(value: XDataTypeRepository): Self = StObject.set(x, "DataTypeRepository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInstance(value: XDocument): Self = StObject.set(x, "DefaultInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBinding(value: String => XPropertySet): Self = StObject.set(x, "getBinding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBindings(value: () => XSet): Self = StObject.set(x, "getBindings", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataTypeRepository(value: () => XDataTypeRepository): Self = StObject.set(x, "getDataTypeRepository", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultInstance(value: () => XDocument): Self = StObject.set(x, "getDefaultInstance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInstanceDocument(value: String => XDocument): Self = StObject.set(x, "getInstanceDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetInstances(value: () => XSet): Self = StObject.set(x, "getInstances", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubmission(value: String => XSubmission): Self = StObject.set(x, "getSubmission", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSubmissions(value: () => XSet): Self = StObject.set(x, "getSubmissions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstances(value: XSet): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecalculate(value: () => Unit): Self = StObject.set(x, "recalculate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRevalidate(value: () => Unit): Self = StObject.set(x, "revalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetID(value: String => Unit): Self = StObject.set(x, "setID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmissions(value: XSet): Self = StObject.set(x, "Submissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmit(value: String => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmitWithInteraction(value: (String, XInteractionHandler) => Unit): Self = StObject.set(x, "submitWithInteraction", js.Any.fromFunction2(value))
    }
  }
  
  /** @since LibreOffice 4.1 */
  @js.native
  trait XModel2
    extends XPropertySet
       with XModel
  object XModel2 {
    
    @scala.inline
    def apply(
      Bindings: XSet,
      DataTypeRepository: XDataTypeRepository,
      DefaultInstance: XDocument,
      ID: String,
      Instances: XSet,
      PropertySetInfo: XPropertySetInfo,
      Submissions: XSet,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      cloneBinding: XPropertySet => XPropertySet,
      cloneSubmission: XPropertySet => XSubmission,
      createBinding: () => XPropertySet,
      createSubmission: () => XSubmission,
      getBinding: String => XPropertySet,
      getBindings: () => XSet,
      getDataTypeRepository: () => XDataTypeRepository,
      getDefaultInstance: () => XDocument,
      getID: () => String,
      getInstanceDocument: String => XDocument,
      getInstances: () => XSet,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      getSubmission: String => XSubmission,
      getSubmissions: () => XSet,
      initialize: () => Unit,
      queryInterface: `type` => js.Any,
      rebuild: () => Unit,
      recalculate: () => Unit,
      refresh: () => Unit,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      revalidate: () => Unit,
      setID: String => Unit,
      setPropertyValue: (String, js.Any) => Unit,
      submit: String => Unit,
      submitWithInteraction: (String, XInteractionHandler) => Unit
    ): XModel2 = {
      val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), queryInterface = js.Any.fromFunction1(queryInterface), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), setPropertyValue = js.Any.fromFunction2(setPropertyValue), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
      __obj.asInstanceOf[XModel2]
    }
  }
  
  /** specifies a submission object, associated with an {@link XModel} */
  @js.native
  trait XSubmission
    extends XPropertySet
       with XNamed
       with typings.activexLibreoffice.com_.sun.star.form.submission.XSubmission
  object XSubmission {
    
    @scala.inline
    def apply(
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addSubmissionVetoListener: XSubmissionVetoListener => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getName: () => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeSubmissionVetoListener: XSubmissionVetoListener => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setName: String => Unit,
      setPropertyValue: (String, js.Any) => Unit,
      submit: () => Unit,
      submitWithInteraction: XInteractionHandler => Unit
    ): XSubmission = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSubmissionVetoListener = js.Any.fromFunction1(addSubmissionVetoListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSubmissionVetoListener = js.Any.fromFunction1(removeSubmissionVetoListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), submit = js.Any.fromFunction0(submit), submitWithInteraction = js.Any.fromFunction1(submitWithInteraction))
      __obj.asInstanceOf[XSubmission]
    }
  }
}
