package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.XHierarchicalPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XChangesListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to a fragment of the configuration hierarchy.
  *
  * Values that are direct or indirect descendants of a root element can be retrieved and, if themselves objects, navigated. Other interfaces provide
  * access to information about this element and its context. Changes to values in the hierarchy can be monitored by event listeners.
  *
  * Descendants of this service also implement this service.
  *
  * Ultimately the configuration holds values. These values are organized into a hierarchy using structural elements. The structure is defined in advance
  * in a schema. Necessary information from the schema is stored in the configuration repository itself and is accessible through an implementation of
  * this service.
  *
  * Two different kinds of structural elements are used in the configuration hierarchy:
  *
  * **Sets **: are dynamic containers of homogeneous elements. Which elements a **set** contains can vary. Their names are defined by the clients that
  * insert them. On the other hand, the **type** of the elements is the same for all elements. In the case of elements that are themselves hierarchy
  * objects, the **type** includes the structure of the hierarchy fragment they contain. Such types are defined in the configuration schema as
  * **templates** .;
  *
  * **Groups **: are static collections of heterogeneous elements. The names and types of the elements of a **group** are completely defined in the
  * configuration schema. Here each element may be of a different **type** , allowing **groups** that contain a mix of subobjects and simple values.
  *
  *
  *
  * Objects in the configuration hierarchy, for example, implementations of this service, can thus be classified in the following ways:
  *
  * **Container** role: An object that can hold child elements as a **set** or a **group** .**Element** role: An object may be an element of a **set** or
  * a **group** or else it may be the root element.
  *
  * Several types of simple **values** can be used in the configuration. In addition to the basic (scalar) types, sequences of the basic types are
  * supported. The basic types are:
  *
  * **string** can hold a human-readable text.
  *
  * Values are represented as `string` .
  *
  *
  *
  * Sequences are represented as `string[]` .
  *
  *
  *
  * "<em>human-readable</em>" here excludes non-printing characters except for CR, LF and TAB [Unicode code points 9,10,13]. For binary data, use type
  * **binary** instead.
  *
  * **boolean** can hold the values `TRUE` or `FALSE` .
  *
  * Values are represented as `boolean` .
  *
  * Sequences are represented as `boolean[]` .
  *
  * **short** can hold a 16-bit signed integer.
  *
  * Values are represented as `short` .
  *
  *
  *
  * Sequences are represented as `short[]` .
  *
  * **int** can hold a 32-bit signed integer.
  *
  * Values are represented as `long` .
  *
  *
  *
  * Sequences are represented as `long[]` .
  *
  * **long** can hold a 64-bit signed integer.
  *
  * Values are represented as `hyper` .
  *
  *
  *
  * Sequences are represented as `hyper[]` .
  *
  * **double** can hold a floating point number.
  *
  * Values are represented as `double` .
  *
  *
  *
  * Sequences are represented as `double[]` .
  *
  * **binary** can hold a sequence of octets.
  *
  * Values are represented as `byte[]` .
  *
  *
  *
  * Sequences are represented as `byte[][]` .
  *
  *
  *
  * Within templates an additional type **any** can occur. When such a template is used to create a new {@link SetElement} , the type of the element is
  * initially reported as `any` (having no value). When the value of such an element is first set, it will assume the type used.
  *
  * If the schema marks a value as **nullable** (which is indicated by attribute {@link com.sun.star.beans.PropertyAttribute.MAYBEVOID} ), its contents
  * may be `NULL` .
  *
  * The configuration should support explicit access to default values (implementing {@link com.sun.star.beans.XPropertyState} and {@link
  * com.sun.star.beans.XPropertyWithState} ).
  * @see ConfigurationProvider Root instances of this service can be requested from a ConfigurationProvider.
  * @see ConfigurationUpdateAccess an extended service that includes facilities for modifying configuration data.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyWithState because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XProperty because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XHierarchicalName because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.configuration.HierarchyElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.configuration.GroupElement because var conflicts: Name, Parent. Inlined 
- typings.activexLibreoffice.com_.sun.star.configuration.SetElement because var conflicts: Name, Parent. Inlined  */ trait ConfigurationAccess
  extends StObject
     with SetAccess
     with GroupAccess
     with AccessRootElement
     with XTemplateInstance {
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  /* InferMemberOverrides */
  override def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
  
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
}
object ConfigurationAccess {
  
  inline def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    HierarchicalName: String,
    HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    Properties: SafeArray[Property],
    PropertySetInfo: XPropertySetInfo,
    StateAsProperty: PropertyState,
    TemplateName: String,
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    composeHierarchicalName: String => String,
    dispose: () => Unit,
    escapeString: String => String,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getAsProperty: () => Property,
    getByHierarchicalName: String => Any,
    getByName: String => Any,
    getDefaultAsProperty: () => XInterface,
    getElementNames: () => SafeArray[String],
    getElementTemplateName: () => String,
    getElementType: () => `type`,
    getExactName: String => String,
    getHierarchicalName: () => String,
    getHierarchicalPropertySetInfo: () => XHierarchicalPropertySetInfo,
    getHierarchicalPropertyValue: String => Any,
    getHierarchicalPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getLocale: () => Locale,
    getName: () => String,
    getParent: () => XInterface,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    getPropertyDefault: String => Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getStateAsProperty: () => PropertyState,
    getTemplateName: () => String,
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setHierarchicalPropertyValue: (String, Any) => Unit,
    setHierarchicalPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit,
    setToDefaultAsProperty: () => Unit,
    unescapeString: String => String
  ): ConfigurationAccess = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], HierarchicalPropertySetInfo = HierarchicalPropertySetInfo.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = js.Any.fromFunction0(dispose), escapeString = js.Any.fromFunction1(escapeString), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getAsProperty = js.Any.fromFunction0(getAsProperty), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getElementNames = js.Any.fromFunction0(getElementNames), getElementTemplateName = js.Any.fromFunction0(getElementTemplateName), getElementType = js.Any.fromFunction0(getElementType), getExactName = js.Any.fromFunction1(getExactName), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getHierarchicalPropertySetInfo = js.Any.fromFunction0(getHierarchicalPropertySetInfo), getHierarchicalPropertyValue = js.Any.fromFunction1(getHierarchicalPropertyValue), getHierarchicalPropertyValues = js.Any.fromFunction1(getHierarchicalPropertyValues), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), getTemplateName = js.Any.fromFunction0(getTemplateName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setHierarchicalPropertyValue = js.Any.fromFunction2(setHierarchicalPropertyValue), setHierarchicalPropertyValues = js.Any.fromFunction2(setHierarchicalPropertyValues), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty), unescapeString = js.Any.fromFunction1(unescapeString))
    __obj.asInstanceOf[ConfigurationAccess]
  }
  
  extension [Self <: ConfigurationAccess](x: Self) {
    
    inline def setGetHierarchicalPropertySetInfo(value: () => XHierarchicalPropertySetInfo): Self = StObject.set(x, "getHierarchicalPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
  }
}
