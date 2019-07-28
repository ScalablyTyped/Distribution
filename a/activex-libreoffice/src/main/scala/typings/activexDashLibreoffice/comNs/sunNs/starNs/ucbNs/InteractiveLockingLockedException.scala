package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
  var SelfOwned: Boolean
}

object InteractiveLockingLockedException {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    SelfOwned: Boolean,
    Url: String
  ): InteractiveLockingLockedException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, SelfOwned = SelfOwned, Url = Url)
  
    __obj.asInstanceOf[InteractiveLockingLockedException]
  }
}

