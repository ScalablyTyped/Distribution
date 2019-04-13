package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectLegalHoldOutput extends js.Object {
  /**
    * The current Legal Hold status for the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
}

object GetObjectLegalHoldOutput {
  @scala.inline
  def apply(LegalHold: ObjectLockLegalHold = null): GetObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    if (LegalHold != null) __obj.updateDynamic("LegalHold")(LegalHold)
    __obj.asInstanceOf[GetObjectLegalHoldOutput]
  }
}

