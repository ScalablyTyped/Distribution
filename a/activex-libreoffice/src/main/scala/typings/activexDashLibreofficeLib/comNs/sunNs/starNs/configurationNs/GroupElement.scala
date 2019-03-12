package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a predefined element contained in a heterogeneous group of elements within a hierarchy.
  *
  * Provides information about the element. Provides access to its containing group object.
  *
  * A group element bears a predefined name. It may only exist within a containing group object.
  * @see com.sun.star.configuration.GroupAccess Parent objects of this service generally implement service GroupAccess.
  * @see com.sun.star.configuration.SetElement A complementary service, for elements of a dynamic homogeneous container.
  * @see com.sun.star.configuration.AccessRootElement A complementary service, for the root element of a hierarchy.
  */
trait GroupElement extends HierarchyElement

object GroupElement {
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
  ): GroupElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, HierarchicalName = HierarchicalName, Name = Name, Parent = Parent, StateAsProperty = StateAsProperty, acquire = js.Any.fromFunction0(acquire), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
  
    __obj.asInstanceOf[GroupElement]
  }
}

