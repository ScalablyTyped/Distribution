package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an error specifying the lack of parameters values
  *
  * Usually thrown if someone tries to execute an SQL statement containing parameters which can't be filled by the executing instance.
  */
trait ParametersRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /**
    * specifies the connection on which the statement is to be executed. Somebody handling the request could, e.g., use the connection for determining the
    * identifier quote string, etc.
    */
  var Connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /**
    * is the list of parameters requested. The objects returned by the {@link com.sun.star.container.XIndexAccess} have to be property sets describing the
    * respective parameter. For this, the objects have to support the service {@link com.sun.star.sdbcx.Column} .
    */
  var Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

