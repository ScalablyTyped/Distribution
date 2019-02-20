package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides write access to a dynamic, homogeneous, non-hierarchical set of values or objects.
  *
  * Allows adding and removing elements. Helps create new elements to be added.
  *
  * This service extends {@link SimpleSetAccess} to support modifying the container. Any child objects shall in turn support modifying access.
  */
@js.native
trait SimpleSetUpdate
  extends SimpleSetAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory {
  def createInstanceWithArguments(aArguments: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface = js.native
}

