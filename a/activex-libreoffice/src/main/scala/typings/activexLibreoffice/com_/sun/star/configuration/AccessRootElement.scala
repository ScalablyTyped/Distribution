package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XLocalizable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XChangesListener
import typings.activexLibreoffice.com_.sun.star.util.XChangesNotifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about the root element of a hierarchy and about the hierarchy as a whole.
  *
  * Provides information about the element and the whole hierarchy. Allows controlling the lifetime of the hierarchy. Allows observing changes in the
  * hierarchy as a whole.
  *
  * When access to a hierarchy is first obtained from a factory or provider, this is the initial object that is created by the factory. It represents the
  * **root** of the accessible part of the hierarchy.
  *
  * **NOTE: In this description "hierarchy" may actually designate a part or fragment of a larger hierarchy. It is that part that is rooted in the element
  * represented by an implementation of this service and that is accessible starting from this element.**
  *
  * Generally it is not possible to navigate the parent or siblings, if any, of this element, so {@link com.sun.star.container.XChild} is not supported.
  * @see com.sun.star.configuration.UpdateRootElement Implementations that support modifying data in the hierarchy implement service UpdateRootElement.
  * @see com.sun.star.configuration.SetElement A complementary service, for children of a dynamic homogeneous container.
  * @see com.sun.star.configuration.GroupElement A complementary service, for children of a static heterogeneous collection.
  * @see com.sun.star.configuration.ConfigurationProvider Objects provided by a ConfigurationProvider implement this service.
  */
@js.native
trait AccessRootElement
  extends HierarchyElement
     with XComponent
     with XChangesNotifier
     with XLocalizable
object AccessRootElement {
  
  @scala.inline
  def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    StateAsProperty: PropertyState,
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    addEventListener: XEventListener => Unit,
    composeHierarchicalName: String => String,
    dispose: () => Unit,
    getAsProperty: () => Property,
    getDefaultAsProperty: () => XInterface,
    getHierarchicalName: () => String,
    getLocale: () => Locale,
    getName: () => String,
    getParent: () => XInterface,
    getStateAsProperty: () => PropertyState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit,
    removeEventListener: XEventListener => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setToDefaultAsProperty: () => Unit
  ): AccessRootElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], DefaultAsProperty = DefaultAsProperty.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StateAsProperty = StateAsProperty.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = js.Any.fromFunction0(dispose), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
    __obj.asInstanceOf[AccessRootElement]
  }
}
