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

