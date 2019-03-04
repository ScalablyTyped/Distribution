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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commitChanges: js.Function0[scala.Unit],
    createInstance: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    createInstanceWithArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    dispose: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getPendingChanges: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    hasPendingChanges: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    removeChangesListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): HierarchyDataReadWriteAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = acquire, addChangesListener = addChangesListener, addEventListener = addEventListener, commitChanges = commitChanges, createInstance = createInstance, createInstanceWithArguments = createInstanceWithArguments, dispose = dispose, getByHierarchicalName = getByHierarchicalName, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getPendingChanges = getPendingChanges, hasByHierarchicalName = hasByHierarchicalName, hasByName = hasByName, hasElements = hasElements, hasPendingChanges = hasPendingChanges, insertByName = insertByName, queryInterface = queryInterface, release = release, removeByName = removeByName, removeChangesListener = removeChangesListener, removeEventListener = removeEventListener, replaceByName = replaceByName)
  
    __obj.asInstanceOf[HierarchyDataReadWriteAccess]
  }
}

