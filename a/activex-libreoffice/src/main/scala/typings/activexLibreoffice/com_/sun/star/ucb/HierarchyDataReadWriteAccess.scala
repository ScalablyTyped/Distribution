package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.ChangesSet
import typings.activexLibreoffice.com_.sun.star.util.XChangesBatch
import typings.activexLibreoffice.com_.sun.star.util.XChangesListener
import typings.activexLibreoffice.com_.sun.star.util.XChangesNotifier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides read and write access to a fragment of the hierarchy data. */
@js.native
trait HierarchyDataReadWriteAccess
  extends XNameContainer
     with XHierarchicalNameAccess
     with XChangesNotifier
     with XComponent
     with XSingleServiceFactory
     with XChangesBatch
object HierarchyDataReadWriteAccess {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    addEventListener: XEventListener => Unit,
    commitChanges: () => Unit,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    dispose: () => Unit,
    getByHierarchicalName: String => js.Any,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getPendingChanges: () => ChangesSet,
    hasByHierarchicalName: String => Boolean,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasPendingChanges: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    removeChangesListener: XChangesListener => Unit,
    removeEventListener: XEventListener => Unit,
    replaceByName: (String, js.Any) => Unit
  ): HierarchyDataReadWriteAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), commitChanges = js.Any.fromFunction0(commitChanges), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[HierarchyDataReadWriteAccess]
  }
}
