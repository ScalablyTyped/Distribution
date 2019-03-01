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
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    dispose: js.Function0[scala.Unit],
    getAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getHierarchicalName: js.Function0[java.lang.String],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getStateAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setToDefaultAsProperty: js.Function0[scala.Unit]
  ): AccessRootElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsProperty")(AsProperty)
    __obj.updateDynamic("DefaultAsProperty")(DefaultAsProperty)
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("StateAsProperty")(StateAsProperty)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChangesListener")(addChangesListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAsProperty")(getAsProperty)
    __obj.updateDynamic("getDefaultAsProperty")(getDefaultAsProperty)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getStateAsProperty")(getStateAsProperty)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChangesListener")(removeChangesListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setToDefaultAsProperty")(setToDefaultAsProperty)
    __obj.asInstanceOf[AccessRootElement]
  }
}

