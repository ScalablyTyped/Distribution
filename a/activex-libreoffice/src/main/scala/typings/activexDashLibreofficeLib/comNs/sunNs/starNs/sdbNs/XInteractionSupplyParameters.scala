package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back parameter data.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.ParametersRequest} .
  */
trait XInteractionSupplyParameters
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /**
    * set the parameters chosen by the interaction handler
    * @param Values the parameters to set
    */
  def setParameters(
    Values: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

