package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a predefined heterogeneous group of values and nested trees as part of a hierarchy.
  *
  * Provides access to, and information about, its children and descendants viewed either as properties or as contained elements.
  *
  * **Groups** are static collections within the hierarchy.
  *
  * The number and names of contained elements are fixed in advance and each child may have a different type.
  *
  * This service subsumes two alternate ways of accessing child and descendent elements. These strongly overlap, supporting the basic identity
  * `xGroup.getPropertyValue( aName ) == xGroup.getByName( aName )` .
  * @see com.sun.star.configuration.GroupElement Child objects of this service generally implement service GroupElement.
  * @see com.sun.star.configuration.SetAccess A complementary service providing for dynamic homogeneous sets of elements.
  */
trait GroupAccess
  extends HierarchyAccess
     with PropertyHierarchy {
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

