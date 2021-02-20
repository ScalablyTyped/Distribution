package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait GroupElement extends HierarchyElement
object GroupElement {
  
  @scala.inline
  def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Name: String,
    Parent: XInterface,
    StateAsProperty: PropertyState,
    acquire: () => Unit,
    composeHierarchicalName: String => String,
    getAsProperty: () => Property,
    getDefaultAsProperty: () => XInterface,
    getHierarchicalName: () => String,
    getName: () => String,
    getParent: () => XInterface,
    getStateAsProperty: () => PropertyState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setToDefaultAsProperty: () => Unit
  ): GroupElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
    __obj.asInstanceOf[GroupElement]
  }
}
