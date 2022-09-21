package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.XProperty
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyWithState
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalName
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XHierarchicalName
     with XNamed
     with XProperty
     with XPropertyWithState
     with XChild
object HierarchyElement {
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setToDefaultAsProperty: () => Unit
  ): HierarchyElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
    __obj.asInstanceOf[HierarchyElement]
  }
}
