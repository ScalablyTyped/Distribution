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
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides write access to a predefined heterogeneous group of values and nested trees as part of a hierarchy.
  *
  * This service extends {@link GroupAccess} to support modifying values.
  */
trait GroupUpdate
  extends StObject
     with GroupAccess
     with XNameReplace {
  
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
object GroupUpdate {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    HierarchicalPropertySetInfo: XHierarchicalPropertySetInfo,
    Properties: SafeArray[Property],
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getByHierarchicalName: String => js.Any,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getExactName: String => String,
    getHierarchicalPropertySetInfo: () => XHierarchicalPropertySetInfo,
    getHierarchicalPropertyValue: String => js.Any,
    getHierarchicalPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    getPropertyDefault: String => js.Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[js.Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByName: (String, js.Any) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setHierarchicalPropertyValue: (String, js.Any) => Unit,
    setHierarchicalPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit
  ): GroupUpdate = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HierarchicalPropertySetInfo = HierarchicalPropertySetInfo.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getExactName = js.Any.fromFunction1(getExactName), getHierarchicalPropertySetInfo = js.Any.fromFunction0(getHierarchicalPropertySetInfo), getHierarchicalPropertyValue = js.Any.fromFunction1(getHierarchicalPropertyValue), getHierarchicalPropertyValues = js.Any.fromFunction1(getHierarchicalPropertyValues), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByName = js.Any.fromFunction2(replaceByName), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setHierarchicalPropertyValue = js.Any.fromFunction2(setHierarchicalPropertyValue), setHierarchicalPropertyValues = js.Any.fromFunction2(setHierarchicalPropertyValues), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[GroupUpdate]
  }
  
  @scala.inline
  implicit class GroupUpdateMutableBuilder[Self <: GroupUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHierarchicalPropertySetInfo(value: () => XHierarchicalPropertySetInfo): Self = StObject.set(x, "getHierarchicalPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyStates(value: SeqEquiv[String] => SafeArray[PropertyState]): Self = StObject.set(x, "getPropertyStates", js.Any.fromFunction1(value))
  }
}
