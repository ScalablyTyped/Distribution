package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait AccessRootElement
  extends HierarchyElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

object AccessRootElement {
  @scala.inline
  def apply(
    AsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    HierarchicalName: java.lang.String,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StateAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    acquire: () => scala.Unit,
    addChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    composeHierarchicalName: java.lang.String => java.lang.String,
    dispose: () => scala.Unit,
    getAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    getDefaultAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getHierarchicalName: () => java.lang.String,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getName: () => java.lang.String,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getStateAsProperty: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setToDefaultAsProperty: () => scala.Unit
  ): AccessRootElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, HierarchicalName = HierarchicalName, Locale = Locale, Name = Name, Parent = Parent, StateAsProperty = StateAsProperty, acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = js.Any.fromFunction0(dispose), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
  
    __obj.asInstanceOf[AccessRootElement]
  }
}

