package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XExactName
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XMultiPropertyStates
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.std.SafeArray
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
  extends XNameAccess
     with XHierarchicalNameAccess
     with XContainer
     with XExactName
     with XPropertySetInfo
     with XPropertyState
     with XMultiPropertyStates {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
}

object HierarchyAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Properties: SafeArray[Property],
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    getByHierarchicalName: String => js.Any,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getExactName: String => String,
    getProperties: () => SafeArray[Property],
    getPropertyByName: String => Property,
    getPropertyDefault: String => js.Any,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasPropertyByName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyToDefault: String => Unit
  ): HierarchyAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Properties = Properties, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getExactName = js.Any.fromFunction1(getExactName), getProperties = js.Any.fromFunction0(getProperties), getPropertyByName = js.Any.fromFunction1(getPropertyByName), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPropertyByName = js.Any.fromFunction1(hasPropertyByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault))
  
    __obj.asInstanceOf[HierarchyAccess]
  }
}

