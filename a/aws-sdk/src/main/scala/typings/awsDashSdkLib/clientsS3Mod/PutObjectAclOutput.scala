package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectAclOutput extends js.Object {
  var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
}

object PutObjectAclOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): PutObjectAclOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectAclOutput]
  }
}

