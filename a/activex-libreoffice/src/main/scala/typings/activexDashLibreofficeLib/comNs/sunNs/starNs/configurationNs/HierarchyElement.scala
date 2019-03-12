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

object HierarchyElement {
  @scala.inline
  def apply(
    AsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    HierarchicalName: java.lang.String,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StateAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    acquire: () => scala.Unit,
    composeHierarchicalName: java.lang.String => java.lang.String,
    getAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    getDefaultAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getHierarchicalName: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getStateAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setToDefaultAsProperty: () => scala.Unit
  ): HierarchyElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, HierarchicalName = HierarchicalName, Name = Name, Parent = Parent, StateAsProperty = StateAsProperty, acquire = js.Any.fromFunction0(acquire), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
  
    __obj.asInstanceOf[HierarchyElement]
  }
}

