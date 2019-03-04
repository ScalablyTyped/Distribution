package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a hierarchy of descendant elements.
  *
  * Subnodes are accessed by their name. Values that are direct or indirect descendants of this tree node can be retrieved. Non-value subnodes can be
  * navigated using container interfaces. Other interfaces provide access to information about this node. Changes to values in the subtree can be
  * monitored by event listeners.
  *
  * Elements of this container that are not simple values are similar containers themselves, thus (recursively) forming a hierarchical tree.
  *
  * Implementations of this service usually also implement service {@link HierarchyElement} , which concerns the complementary role of being accessible as
  * an element of the hierarchy.
  */
trait HierarchyAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XExactName
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyState
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
}

object HierarchyAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getExactName: js.Function1[java.lang.String, java.lang.String],
    getProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property]
    ],
    getPropertyByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getPropertyDefault: js.Function1[java.lang.String, js.Any],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertyState: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState
    ],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
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
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit]
  ): HierarchyAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Properties = Properties, acquire = acquire, addContainerListener = addContainerListener, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getExactName = getExactName, getProperties = getProperties, getPropertyByName = getPropertyByName, getPropertyDefault = getPropertyDefault, getPropertyDefaults = getPropertyDefaults, getPropertyState = getPropertyState, getPropertyStates = getPropertyStates, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, hasPropertyByName = hasPropertyByName, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setPropertiesToDefault = setPropertiesToDefault, setPropertyToDefault = setPropertyToDefault)
  
    __obj.asInstanceOf[HierarchyAccess]
  }
}

