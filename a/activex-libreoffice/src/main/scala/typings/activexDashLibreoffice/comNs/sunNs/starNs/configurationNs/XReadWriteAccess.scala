package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XHierarchicalPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XHierarchicalNameReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.ChangesSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XChangesBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XReadWriteAccess
  extends XHierarchicalNameReplace
     with XChangesBatch
     with XHierarchicalPropertySetInfo

object XReadWriteAccess {
  @scala.inline
  def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    getByHierarchicalName: String => js.Any,
    getPendingChanges: () => ChangesSet,
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: () => Boolean,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): XReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
  
    __obj.asInstanceOf[XReadWriteAccess]
  }
}

