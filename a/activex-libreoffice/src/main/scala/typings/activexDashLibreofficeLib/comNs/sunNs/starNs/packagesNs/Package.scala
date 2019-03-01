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
    acquire: js.Function0[scala.Unit],
    commitChanges: js.Function0[scala.Unit],
    createInstance: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    createInstanceWithArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getPendingChanges: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.ChangesSet],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasPendingChanges: js.Function0[scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): Package = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PendingChanges")(PendingChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("commitChanges")(commitChanges)
    __obj.updateDynamic("createInstance")(createInstance)
    __obj.updateDynamic("createInstanceWithArguments")(createInstanceWithArguments)
    __obj.updateDynamic("getByHierarchicalName")(getByHierarchicalName)
    __obj.updateDynamic("getPendingChanges")(getPendingChanges)
    __obj.updateDynamic("hasByHierarchicalName")(hasByHierarchicalName)
    __obj.updateDynamic("hasPendingChanges")(hasPendingChanges)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[Package]
  }
}

