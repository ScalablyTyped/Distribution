package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.GroupElement because var conflicts: Name, Parent. Inlined - activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.SetElement because var conflicts: Name, Parent. Inlined  */ trait ConfigurationAccess
  extends GroupAccess
     with SetAccess
     with AccessRootElement {
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  /* InferMemberOverrides */
  override def getHierarchicalPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
}

object ConfigurationAccess {
  @scala.inline
  def apply(
    AsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementTemplateName: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
    HierarchicalName: java.lang.String,
    HierarchicalPropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    StateAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    TemplateName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    dispose: js.Function0[scala.Unit],
    escapeString: js.Function1[java.lang.String, java.lang.String],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementTemplateName: js.Function0[java.lang.String],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getExactName: js.Function1[java.lang.String, java.lang.String],
    getHierarchicalName: js.Function0[java.lang.String],
    getHierarchicalPropertySetInfo: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo
    ],
    getHierarchicalPropertyValue: js.Function1[java.lang.String, js.Any],
    getHierarchicalPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property]
    ],
    getPropertyByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getPropertyDefault: js.Function1[java.lang.String, js.Any],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyState: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
    ],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getStateAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    getTemplateName: js.Function0[java.lang.String],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    hasPropertyByName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setHierarchicalPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setHierarchicalPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    setToDefaultAsProperty: js.Function0[scala.Unit],
    unescapeString: js.Function1[java.lang.String, java.lang.String]
  ): ConfigurationAccess = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, ElementNames = ElementNames, ElementTemplateName = ElementTemplateName, ElementType = ElementType, HierarchicalName = HierarchicalName, HierarchicalPropertySetInfo = HierarchicalPropertySetInfo, Locale = Locale, Name = Name, Parent = Parent, Properties = Properties, PropertySetInfo = PropertySetInfo, StateAsProperty = StateAsProperty, TemplateName = TemplateName, acquire = acquire, addChangesListener = addChangesListener, addContainerListener = addContainerListener, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, composeHierarchicalName = composeHierarchicalName, dispose = dispose, escapeString = escapeString, firePropertiesChangeEvent = firePropertiesChangeEvent, getAsProperty = getAsProperty, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getDefaultAsProperty = getDefaultAsProperty, getElementNames = getElementNames, getElementTemplateName = getElementTemplateName, getElementType = getElementType, getExactName = getExactName, getHierarchicalName = getHierarchicalName, getHierarchicalPropertySetInfo = getHierarchicalPropertySetInfo, getHierarchicalPropertyValue = getHierarchicalPropertyValue, getHierarchicalPropertyValues = getHierarchicalPropertyValues, getLocale = getLocale, getName = getName, getParent = getParent, getProperties = getProperties, getPropertyByName = getPropertyByName, getPropertyDefault = getPropertyDefault, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyState = getPropertyState, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getStateAsProperty = getStateAsProperty, getTemplateName = getTemplateName, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, hasPropertyByName = hasPropertyByName, queryInterface = queryInterface, release = release, removeChangesListener = removeChangesListener, removeContainerListener = removeContainerListener, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setHierarchicalPropertyValue = setHierarchicalPropertyValue, setHierarchicalPropertyValues = setHierarchicalPropertyValues, setLocale = setLocale, setName = setName, setParent = setParent, setPropertiesToDefault = setPropertiesToDefault, setPropertyToDefault = setPropertyToDefault, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, setToDefaultAsProperty = setToDefaultAsProperty, unescapeString = unescapeString)
  
    __obj.asInstanceOf[ConfigurationAccess]
  }
}

