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

object InteractiveLockingLockedException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    SelfOwned: scala.Boolean,
    Url: java.lang.String
  ): InteractiveLockingLockedException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Classification")(Classification)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("SelfOwned")(SelfOwned)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[InteractiveLockingLockedException]
  }
}

