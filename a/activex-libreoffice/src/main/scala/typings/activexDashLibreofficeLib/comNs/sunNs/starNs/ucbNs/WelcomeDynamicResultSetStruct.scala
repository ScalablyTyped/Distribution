package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct is to be contained in the first notification of an {@link XDynamicResultSet} .
  * @see XDynamicResultSet
  * @see ListEvent
  * @see ListAction
  * @see ListActionType
  */
trait WelcomeDynamicResultSetStruct extends js.Object {
  /** The static result set containing the new version of result set data. */
  var New: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
  /** The static result set containing the previous version of result set data. */
  var Old: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
}

