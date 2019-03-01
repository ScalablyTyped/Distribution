package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a dynamic element that can be inserted into a homogeneous set of elements within a hierarchy.
  *
  * Provides information about the element. Provides access to its containing set object. Allows controlling the lifetime of the element.
  *
  * Set elements may be added to and removed from the hierarchy at runtime. They bear user-defined names. They may exist independently, outside any
  * container.
  *
  * New set element instances generally are created through members of {@link com.sun.star.lang.XSingleServiceFactory} or, if supported, {@link
  * com.sun.star.lang.XMultiServiceFactory} on an implementation of {@link SetUpdate} . Initially, they are not contained in a set object and have no
  * meaningful name.
  *
  * While an instance is not contained in a set object, it is owned by the client and can be disposed by calling {@link
  * com.sun.star.lang.XComponent.dispose()} . The name of the object can freely be changed in that situation though without persistent effect.
  *
  * When the instance is inserted into a set (this includes replacing an existing element), ownership is transferred to the container. While it is
  * contained in the container, clients must not dispose the object. When inserted, the name of the object is fixed and is used to identify it within the
  * container. An implementation may support {@link com.sun.star.container.XNamed.setName()} even in this case. If it does, changing the name has the same
  * effect of removing the object (under the old name) and then reinserting it into the same container (using the new name).
  *
  * When an instance is removed from a set (this includes being replaced by a new element), ownership is transferred to the client again. It can then be
  * disposed or reinserted into a container. An instance can only be inserted into a container, if it was obtained from the same hierarchy.
  *
  * When a set element is removed from its set from outside the hierarchy, the container disposes of the object. This occurrence can be detected by
  * registering a {@link com.sun.star.lang.XEventListener} with the object.
  *
  * If an implementation is part of a **read-only** view of the hierarchy, changing the name or parent is not supported (the object can't be removed from
  * its container anyway).
  * @see com.sun.star.configuration.SetAccess Parent objects of this service generally implement service SetAccess.
  * @see com.sun.star.configuration.GroupElement A complementary service for elements of a static heterogeneous collection.
  * @see com.sun.star.configuration.AccessRootElement A complementary service for the root element of a hierarchy.
  */
trait SetElement
  extends HierarchyElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XTemplateInstance

object SetElement {
  @scala.inline
  def apply(
    AsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    DefaultAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    HierarchicalName: java.lang.String,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    StateAsProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState,
    TemplateName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    dispose: js.Function0[scala.Unit],
    getAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property],
    getDefaultAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getHierarchicalName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getStateAsProperty: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    getTemplateName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setToDefaultAsProperty: js.Function0[scala.Unit]
  ): SetElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsProperty")(AsProperty)
    __obj.updateDynamic("DefaultAsProperty")(DefaultAsProperty)
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("StateAsProperty")(StateAsProperty)
    __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAsProperty")(getAsProperty)
    __obj.updateDynamic("getDefaultAsProperty")(getDefaultAsProperty)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getStateAsProperty")(getStateAsProperty)
    __obj.updateDynamic("getTemplateName")(getTemplateName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setToDefaultAsProperty")(setToDefaultAsProperty)
    __obj.asInstanceOf[SetElement]
  }
}

