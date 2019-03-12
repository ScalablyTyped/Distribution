package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link Package} is a service that provides access to a set of files and folders contained within a {@link Package} . One instance of the {@link
  * Package} service exists for each {@link Package} file to be manipulated.
  *
  * Each instance is created with an argument which specifies the URL of the {@link Package} file to which the user requires access. If the instance is
  * created without arguments, it must be initialized with the {@link com.sun.star.lang.XInitialization} service methods before it is a valid instance of
  * the service.
  */
trait Package
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XChangesBatch

object Package {
  @scala.inline
  def apply(
    PendingChanges: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    acquire: () => scala.Unit,
    commitChanges: () => scala.Unit,
    createInstance: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceWithArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getByHierarchicalName: java.lang.String => js.Any,
    getPendingChanges: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    hasPendingChanges: () => scala.Boolean,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): Package = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[Package]
  }
}

