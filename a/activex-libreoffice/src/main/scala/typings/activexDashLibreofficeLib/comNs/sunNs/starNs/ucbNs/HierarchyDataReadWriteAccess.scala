package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides read and write access to a fragment of the hierarchy data. */
trait HierarchyDataReadWriteAccess
  extends HierarchyDataReadAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesBatch

object HierarchyDataReadWriteAccess {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    acquire: () => scala.Unit,
    addChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    commitChanges: () => scala.Unit,
    createInstance: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceWithArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    dispose: () => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getPendingChanges: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    hasPendingChanges: () => scala.Boolean,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    removeChangesListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit
  ): HierarchyDataReadWriteAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), addEventListener = js.Any.fromFunction1(addEventListener), commitChanges = js.Any.fromFunction0(commitChanges), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeChangesListener = js.Any.fromFunction1(removeChangesListener), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[HierarchyDataReadWriteAccess]
  }
}

