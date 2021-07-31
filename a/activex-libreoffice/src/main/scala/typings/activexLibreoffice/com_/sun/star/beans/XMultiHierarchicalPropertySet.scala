package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to multiple properties which form a hierarchy.
  * @see XHierarchicalPropertySet
  */
trait XMultiHierarchicalPropertySet
  extends StObject
     with XInterface {
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    * @see XHierarchicalPropertySet.getHierarchicalPropertySetInfo
    */
  val HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo
  
  /**
    * retrieve information about the hierarchy of properties
    * @returns the {@link XHierarchicalPropertySetInfo} interface, which describes the property hierarchy of the object which supplies this interface.
    * @returns `NULL` if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XHierarchicalPropertySet
    * @see XHierarchicalPropertySet.getHierarchicalPropertySetInfo
    */
  def getHierarchicalPropertySetInfo(): XHierarchicalPropertySetInfo
  
  /**
    * @returns a sequence of all values of the properties which are specified by their nested names.  The order of the values in the returned sequence will be t
    * @see XHierarchicalPropertySet.getHierarchicalPropertyValue
    * @see XMultiPropertySet.setPropertyValues
    * @throws com::sun::star::lang::IllegalArgumentException if one of the names is not a well-formed nested name for this hierarchy. An implementation is not
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getHierarchicalPropertyValues(aPropertyNames: SeqEquiv[String]): SafeArray[js.Any]
  
  /**
    * sets the values of the properties with the specified nested names.
    *
    * The values of the properties must change before bound events are fired. The values of constrained properties should change after the vetoable events
    * are fired, if no exception occurs.
    *
    * Unknown properties are ignored.
    * @param aHierarchicalPropertyNames This parameter specifies the names of the properties.
    * @param Values This parameter specifies the new values for the properties.
    * @see XHierarchicalPropertySet.setHierarchicalPropertyValue
    * @see XMultiPropertySet.setPropertyValues
    * @throws PropertyVetoException if one of the properties is constrained and the change is vetoed by a {@link XVetoableChangeListener} .
    * @throws com::sun::star::lang::IllegalArgumentException if one of the values is not a legal value for the corresponding property or if one of the names is
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setHierarchicalPropertyValues(aHierarchicalPropertyNames: SeqEquiv[String], Values: SeqEquiv[js.Any]): Unit
}
object XMultiHierarchicalPropertySet {
  
  @scala.inline
  def apply(
    HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo,
    acquire: () => Unit,
    getHierarchicalPropertySetInfo: () => XHierarchicalPropertySetInfo,
    getHierarchicalPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHierarchicalPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit
  ): XMultiHierarchicalPropertySet = {
    val __obj = js.Dynamic.literal(HierarchicalPropertySetInfo = HierarchicalPropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHierarchicalPropertySetInfo = js.Any.fromFunction0(getHierarchicalPropertySetInfo), getHierarchicalPropertyValues = js.Any.fromFunction1(getHierarchicalPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHierarchicalPropertyValues = js.Any.fromFunction2(setHierarchicalPropertyValues))
    __obj.asInstanceOf[XMultiHierarchicalPropertySet]
  }
  
  @scala.inline
  implicit class XMultiHierarchicalPropertySetMutableBuilder[Self <: XMultiHierarchicalPropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHierarchicalPropertySetInfo(value: () => XHierarchicalPropertySetInfo): Self = StObject.set(x, "getHierarchicalPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHierarchicalPropertyValues(value: SeqEquiv[String] => SafeArray[js.Any]): Self = StObject.set(x, "getHierarchicalPropertyValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHierarchicalPropertySetInfo(value: XHierarchicalPropertySetInfo): Self = StObject.set(x, "HierarchicalPropertySetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHierarchicalPropertyValues(value: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit): Self = StObject.set(x, "setHierarchicalPropertyValues", js.Any.fromFunction2(value))
  }
}
