package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of parameters, typically used for a prepared statement. */
trait XParametersSupplier extends XInterface {
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  val Parameters: XIndexAccess
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  def getParameters(): XIndexAccess
}

object XParametersSupplier {
  @scala.inline
  def apply(
    Parameters: XIndexAccess,
    acquire: () => Unit,
    getParameters: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XParametersSupplier = {
    val __obj = js.Dynamic.literal(Parameters = Parameters, acquire = js.Any.fromFunction0(acquire), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XParametersSupplier]
  }
}

