package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedObject extends js.Object {
  /**
    * The S3SignedObject.
    */
  var s3: js.UndefOr[S3SignedObject] = js.native
}

object SignedObject {
  @scala.inline
  def apply(s3: S3SignedObject = null): SignedObject = {
    val __obj = js.Dynamic.literal()
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedObject]
  }
}

