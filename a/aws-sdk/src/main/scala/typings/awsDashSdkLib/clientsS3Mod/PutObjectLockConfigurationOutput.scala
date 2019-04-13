package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectLockConfigurationOutput extends js.Object {
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
}

object PutObjectLockConfigurationOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): PutObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationOutput]
  }
}

