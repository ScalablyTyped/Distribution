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

