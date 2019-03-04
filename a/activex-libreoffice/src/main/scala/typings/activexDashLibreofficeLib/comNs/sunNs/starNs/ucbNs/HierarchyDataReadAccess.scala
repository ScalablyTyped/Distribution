package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read access to a fragment of the hierarchy data.
  *
  * A hierarchy data source provides access to a tree of hierarchy data nodes. Each hierarchy data node, except the root node, has a parent that is a
  * hierarchy data node too. A hierarchy data node has a name.
  *
  * Each hierarchy data node has three data members:
  *
  * "Title", which is of type `string` . It contains a title for the node. This value must not be empty."TargetURL", which is of type `string` It may
  * contain any URL, which will be treated as the target of a hierarchy link."Children", which is of type {@link HierarchyDataReadAccess} or of type
  * {@link HierarchyDataReadWriteAccess} , depending on the type of the node. This member provides access to the children of a node.
  */
trait HierarchyDataReadAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object HierarchyDataReadAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): HierarchyDataReadAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, addChangesListener = addChangesListener, addEventListener = addEventListener, dispose = dispose, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release, removeChangesListener = removeChangesListener, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[HierarchyDataReadAccess]
  }
}

