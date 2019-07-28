package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionContinuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back parameter data.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.ParametersRequest} .
  */
trait XInteractionSupplyParameters extends XInteractionContinuation {
  /**
    * set the parameters chosen by the interaction handler
    * @param Values the parameters to set
    */
  def setParameters(Values: SeqEquiv[PropertyValue]): Unit
}

object XInteractionSupplyParameters {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setParameters: SeqEquiv[PropertyValue] => Unit
  ): XInteractionSupplyParameters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setParameters = js.Any.fromFunction1(setParameters))
  
    __obj.asInstanceOf[XInteractionSupplyParameters]
  }
}

