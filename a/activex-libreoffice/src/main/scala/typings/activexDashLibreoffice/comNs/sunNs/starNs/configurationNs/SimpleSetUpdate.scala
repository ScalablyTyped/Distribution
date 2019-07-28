package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XSingleServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
     with XNameContainer
     with XSingleServiceFactory
     with XMultiServiceFactory {
  def createInstanceWithArguments(aArguments: String): XInterface = js.native
}

