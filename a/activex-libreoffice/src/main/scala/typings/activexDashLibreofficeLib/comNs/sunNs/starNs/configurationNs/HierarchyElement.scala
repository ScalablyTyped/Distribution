package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about an element within a hierarchy.
  *
  * The local name and the full hierarchical name can be retrieved. Attributes detailing the role of the element can be queried. The state of the element
  * (regarding defaults) can be accessed.
  *
  * Implementations of this service usually also implement service {@link HierarchyAccess} , which concerns the complementary role of providing access to
  * subelements of the hierarchy.
  */
trait HierarchyElement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalName
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XProperty
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyWithState
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

