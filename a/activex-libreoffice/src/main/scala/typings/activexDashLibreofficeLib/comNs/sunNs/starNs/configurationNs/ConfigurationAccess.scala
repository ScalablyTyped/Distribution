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

