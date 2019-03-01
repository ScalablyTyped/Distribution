package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesBatch

object UpdateRootElement {
  @scala.inline
  def apply(
    AsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    HierarchicalName: java.lang.String,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    StateAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commitChanges: js.Function0[scala.Unit],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    dispose: js.Function0[scala.Unit],
    getAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getHierarchicalName: js.Function0[java.lang.String],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPendingChanges: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet],
    getStateAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    hasPendingChanges: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setToDefaultAsProperty: js.Function0[scala.Unit]
  ): UpdateRootElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsProperty")(AsProperty)
    __obj.updateDynamic("DefaultAsProperty")(DefaultAsProperty)
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("PendingChanges")(PendingChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("StateAsProperty")(StateAsProperty)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChangesListener")(addChangesListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("commitChanges")(commitChanges)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAsProperty")(getAsProperty)
    __obj.updateDynamic("getDefaultAsProperty")(getDefaultAsProperty)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPendingChanges")(getPendingChanges)
    __obj.updateDynamic("getStateAsProperty")(getStateAsProperty)
    __obj.updateDynamic("hasPendingChanges")(hasPendingChanges)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChangesListener")(removeChangesListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setToDefaultAsProperty")(setToDefaultAsProperty)
    __obj.asInstanceOf[UpdateRootElement]
  }
}

