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
    acquire: js.Function0[scala.Unit],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    getAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getHierarchicalName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getStateAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setToDefaultAsProperty: js.Function0[scala.Unit]
  ): GroupElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, HierarchicalName = HierarchicalName, Name = Name, Parent = Parent, StateAsProperty = StateAsProperty, acquire = acquire, composeHierarchicalName = composeHierarchicalName, getAsProperty = getAsProperty, getDefaultAsProperty = getDefaultAsProperty, getHierarchicalName = getHierarchicalName, getName = getName, getParent = getParent, getStateAsProperty = getStateAsProperty, queryInterface = queryInterface, release = release, setName = setName, setParent = setParent, setToDefaultAsProperty = setToDefaultAsProperty)
  
    __obj.asInstanceOf[GroupElement]
  }
}

