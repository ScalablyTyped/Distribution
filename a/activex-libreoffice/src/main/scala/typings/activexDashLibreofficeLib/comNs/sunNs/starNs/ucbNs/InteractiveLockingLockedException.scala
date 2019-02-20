package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error indicating that the resource is locked.
  * @since OOo 3.3
  */
trait InteractiveLockingLockedException extends InteractiveLockingException {
  /**
    * The owner of the lock.
    *
    * `TRUE` , the lock has been obtained by this OOo session. `FALSE` the lock has been obtained by another principal.
    */
  var SelfOwned: scala.Boolean
}

