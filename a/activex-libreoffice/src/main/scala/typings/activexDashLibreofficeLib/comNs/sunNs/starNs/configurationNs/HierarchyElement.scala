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
  ): HierarchyElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsProperty")(AsProperty)
    __obj.updateDynamic("DefaultAsProperty")(DefaultAsProperty)
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("StateAsProperty")(StateAsProperty)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("getAsProperty")(getAsProperty)
    __obj.updateDynamic("getDefaultAsProperty")(getDefaultAsProperty)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getStateAsProperty")(getStateAsProperty)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setToDefaultAsProperty")(setToDefaultAsProperty)
    __obj.asInstanceOf[HierarchyElement]
  }
}

