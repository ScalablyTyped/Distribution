package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.ChangesSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XChangesBatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XChangesListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides update control for a hierarchy of configuration items and information about the hierarchy as a whole as well as its root.
  *
  * Extends {@link AccessRootElement} by adding support for collecting changes and applying them to a backend store as a single batch.
  *
  * An implementation represents the root of a partial hierarchy. [See the documentation for {@link AccessRootElement} ]. The hierarchy in turn is a
  * **view** onto a fragment of persistent data tree that can be accessed through several such views, or even several processes, simultaneously.
  *
  * Elements of the hierarchy, such as descendants of this root element, may support modification by providing appropriate interfaces. Changes done this
  * way initially only affect these objects themselves and other objects within the same hierarchy, such as other descendants of this root element.
  *
  * The accumulated changes within this hierarchy can be managed using {@link com.sun.star.util.XChangesBatch} . Pending changes will become persistent
  * and visible from other overlapping hierarchies only when {@link com.sun.star.util.XChangesBatch.commitChanges()} is called. If the hierarchy is
  * disposed or discarded without committing changes, the changes will be lost.
  * @see com.sun.star.configuration.GroupUpdate
  * @see com.sun.star.configuration.SetUpdate
  */
trait UpdateRootElement
  extends AccessRootElement
     with XChangesBatch

object UpdateRootElement {
  @scala.inline
  def apply(
    AsProperty: Property,
    DefaultAsProperty: XInterface,
    HierarchicalName: String,
    Locale: Locale,
    Name: String,
    Parent: XInterface,
    PendingChanges: ChangesSet,
    StateAsProperty: PropertyState,
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    addEventListener: XEventListener => Unit,
    commitChanges: () => Unit,
    composeHierarchicalName: String => String,
    dispose: () => Unit,
    getAsProperty: () => Property,
    getDefaultAsProperty: () => XInterface,
    getHierarchicalName: () => String,
    getLocale: () => Locale,
    getName: () => String,
    getParent: () => XInterface,
    getPendingChanges: () => ChangesSet,
    getStateAsProperty: () => PropertyState,
    hasPendingChanges: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit,
    removeEventListener: XEventListener => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit,
    setParent: XInterface => Unit,
    setToDefaultAsProperty: () => Unit
  ): UpdateRootElement = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty, DefaultAsProperty = DefaultAsProperty, HierarchicalName = HierarchicalName, Locale = Locale, Name = Name, Parent = Parent, PendingChanges = PendingChanges.asInstanceOf[js.Any], StateAsProperty = StateAsProperty, acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), commitChanges = js.Any.fromFunction0(commitChanges), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), dispose = js.Any.fromFunction0(dispose), getAsProperty = js.Any.fromFunction0(getAsProperty), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), setParent = js.Any.fromFunction1(setParent), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
  
    __obj.asInstanceOf[UpdateRootElement]
  }
}

