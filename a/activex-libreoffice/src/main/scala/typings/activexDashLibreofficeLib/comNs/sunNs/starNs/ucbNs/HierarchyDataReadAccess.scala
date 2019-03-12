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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): HierarchyDataReadAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[HierarchyDataReadAccess]
  }
}

