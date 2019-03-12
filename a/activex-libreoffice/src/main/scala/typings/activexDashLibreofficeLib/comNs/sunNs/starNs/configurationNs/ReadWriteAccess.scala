package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides easy read/write access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadWriteAccess extends XReadWriteAccess {
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: java.lang.String): scala.Unit
}

object ReadWriteAccess {
  @scala.inline
  def apply(
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    acquire: () => scala.Unit,
    commitChanges: () => scala.Unit,
    create: java.lang.String => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    getPendingChanges: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    getPropertyByHierarchicalName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Property,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    hasPendingChanges: () => scala.Boolean,
    hasPropertyByHierarchicalName: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceByHierarchicalName: (java.lang.String, js.Any) => scala.Unit
  ): ReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), create = js.Any.fromFunction1(create), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
  
    __obj.asInstanceOf[ReadWriteAccess]
  }
}

