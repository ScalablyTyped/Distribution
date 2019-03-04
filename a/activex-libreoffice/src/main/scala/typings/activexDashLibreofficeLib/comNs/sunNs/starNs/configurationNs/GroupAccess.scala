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

object GroupAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    HierarchicalPropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getExactName: js.Function1[java.lang.String, java.lang.String],
    getHierarchicalPropertySetInfo: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo
    ],
    getHierarchicalPropertyValue: js.Function1[java.lang.String, js.Any],
    getHierarchicalPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
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
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    hasPropertyByName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
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
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): GroupAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, HierarchicalPropertySetInfo = HierarchicalPropertySetInfo, Properties = Properties, PropertySetInfo = PropertySetInfo, acquire = acquire, addContainerListener = addContainerListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getExactName = getExactName, getHierarchicalPropertySetInfo = getHierarchicalPropertySetInfo, getHierarchicalPropertyValue = getHierarchicalPropertyValue, getHierarchicalPropertyValues = getHierarchicalPropertyValues, getProperties = getProperties, getPropertyByName = getPropertyByName, getPropertyDefault = getPropertyDefault, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyState = getPropertyState, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, hasPropertyByName = hasPropertyByName, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setHierarchicalPropertyValue = setHierarchicalPropertyValue, setHierarchicalPropertyValues = setHierarchicalPropertyValues, setPropertiesToDefault = setPropertiesToDefault, setPropertyToDefault = setPropertyToDefault, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[GroupAccess]
  }
}

