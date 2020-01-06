package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockLegalHold extends js.Object {
  /**
    * Indicates whether the specified object has a Legal Hold in place.
    */
  var Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.native
}

object ObjectLockLegalHold {
  @scala.inline
  def apply(Status: ObjectLockLegalHoldStatus = null): ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLockLegalHold]
  }
}

