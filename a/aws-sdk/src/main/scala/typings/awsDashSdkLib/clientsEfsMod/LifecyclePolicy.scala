package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicy extends js.Object {
  /**
    * A value that indicates how long it takes to transition files to the IA storage class. Currently, the only valid value is AFTER_30_DAYS.  AFTER_30_DAYS indicates files that have not been read from or written to for 30 days are transitioned from the Standard storage class to the IA storage class. Metadata operations such as listing the contents of a directory don't count as a file access event.
    */
  var TransitionToIA: js.UndefOr[TransitionToIARules] = js.undefined
}

object LifecyclePolicy {
  @scala.inline
  def apply(TransitionToIA: TransitionToIARules = null): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    if (TransitionToIA != null) __obj.updateDynamic("TransitionToIA")(TransitionToIA.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicy]
  }
}

