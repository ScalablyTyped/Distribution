package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about and access to the a hierarchy of properties from an implementation.
  *
  * Usually an object that implements this interface also implements {@link XPropertySet} and at least some of the properties have subproperties.
  *
  * This interface allows direct access to subsubproperties, ... up to an arbitrary nesting depth. Often the intermediate elements of the hierarchy
  * implement {@link XProperty} .
  *
  * Each implementation specifies how the hierarchical property names, that are used to access the elements of the hierarchy, are formed.
  *
  * Commonly a notation similar to filesystem paths (separated by '/' slashes) or nested module names (separated by dots '.' or '::') is used.
  */
trait XHierarchicalPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  val HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    */
  def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo
  /**
    * @param aHierarchicalPropertyName This parameter specifies the name of the property.
    * @returns the value of the property with the specified nested name.
    * @see XPropertySet.getPropertyValue
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::uno::lang::IllegalArgumentException if **aHierarchicalPropertyName** is not a well-formed nested name for this hierarchy. An impl
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getHierarchicalPropertyValue(aHierarchicalPropertyName: java.lang.String): js.Any
  /**
    * sets the value of the property with the specified nested name.
    * @param aHierarchicalPropertyName This parameter specifies the name of the property.
    * @param aValue This parameter specifies the new value for the property.
    * @see XPropertySet.setPropertyValue
    * @throws UnknownPropertyException if the property does not exist.
    * @throws PropertyVetoException if the property is constrained and the change is vetoed by a {@link XVetoableChangeListener} .
    * @throws com::sun::star::uno::lang::IllegalArgumentException if **aValue** is not a legal value for this property or if **aHierarchicalPropertyName** is n
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setHierarchicalPropertyValue(aHierarchicalPropertyName: java.lang.String, aValue: js.Any): scala.Unit
}

