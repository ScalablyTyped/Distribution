package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XChangesListener
import typings.activexLibreoffice.com_.sun.star.util.XChangesNotifier
import typings.std.SafeArray
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
@js.native
trait HierarchyDataReadAccess
  extends XNameAccess
     with XHierarchicalNameAccess
     with XChangesNotifier
     with XComponent

object HierarchyDataReadAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getByHierarchicalName: String => js.Any,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit,
    removeEventListener: XEventListener => Unit
  ): HierarchyDataReadAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[HierarchyDataReadAccess]
  }
}

